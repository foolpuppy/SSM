/**
 * @fileName: UserController
 * @author: L
 * @date: 2019/6/3 18:23
 * @description:
 * @history: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.wigon.controller.front;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.code.kaptcha.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import top.wigon.common.ReturnT;
import top.wigon.pojo.User;
import top.wigon.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

@RequestMapping("/user")
@Controller
@Slf4j
public class UserController {
	@Resource
	UserService userService;

	@RequestMapping("/id/{id}")
	ModelAndView findUserById(@PathVariable(name = "id") int id) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", userService.load(id));
		mv.setViewName("success");
		return mv;
	}


	@RequestMapping(value = "login", method = RequestMethod.POST)
	String login(@ModelAttribute User user, @RequestParam String kaptcha, HttpSession session, HttpServletRequest req, HttpServletResponse resp) {
		log.info("user:{},kaptcha:{}", user.toString(), kaptcha);
		if (session.getAttribute(Constants.KAPTCHA_SESSION_KEY).equals(kaptcha) && userService.findByTel(user.getTel()).getPassword().equals(user.getPassword())) {
			//用户Tel 唯一ID 存Cookies
			Cookie cookie = new Cookie("userTel", user.getTel());
			cookie.setPath("/");
			cookie.setMaxAge(60 * 30);
			resp.addCookie(cookie);
			req.getSession().setAttribute("tel", user.getTel());
			return "redirect:/index.html";
		} else {
			log.info("false");
			return "redirect:/login.html";
		}
	}

	@RequestMapping(value = "/info", method = RequestMethod.POST)
	@ResponseBody
	String getInfo(HttpServletRequest req, HttpServletResponse resp) throws JsonProcessingException {
		String tel = String.valueOf(req.getSession().getAttribute("tel"));
		if ("null".equals(tel)) {
			return "500";
		} else {
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
			User user = userService.findByTel(tel);
			user.setRole(0);
			user.setActive(0);
			user.setPassword("");
			return objectMapper.writeValueAsString(user);
		}
	}

	@RequestMapping(value = "/reg", method = RequestMethod.POST)
	String register(User user, @RequestParam(required = true) String kaptcha) {
		user.setActive(1);
		user.setRole(1);
		user.setGmtCreate(new Date());
		log.info(user.toString());
		if (userService.insert(user).getCode() == 200) {
			return "redirect:/index.html";
		} else {
			return "redirect:/register.html";
		}

	}

	@RequestMapping(value = "/checkTel")
	@ResponseBody
	ReturnT<String> checkTel(String tel) {
		if (userService.findByTel(tel) != null) {
			return new ReturnT<String>(200, "SUCCESS");
		} else {
			return new ReturnT<String>(500, "ERROR");
		}

	}

	@RequestMapping(value = "logout", method = RequestMethod.GET)
	String logOut(HttpServletRequest req) {
		if (null != req.getSession().getAttribute("tel")) {
			req.getSession().removeAttribute("tel");
			req.getSession().invalidate();
		}
		return "redirect:/index.html";
	}
}

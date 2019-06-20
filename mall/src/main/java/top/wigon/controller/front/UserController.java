/**
 * @fileName: UserController
 * @author: L
 * @date: 2019/6/3 18:23
 * @description:
 * @history: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.wigon.controller.front;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.code.kaptcha.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import top.wigon.pojo.User;
import top.wigon.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("/user")
@Controller
@Slf4j
public class UserController {
	@Resource
	UserService userService;

	@RequestMapping("/id/{id}")
	ModelAndView findUserById(@PathVariable(name = "id") int id) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", userService.find(id));
		mv.setViewName("success");
		return mv;
	}

	@RequestMapping("page")
	ModelAndView SelectByPage(@RequestParam(name = "pn", defaultValue = "1") int pn, @RequestParam(name = "size", defaultValue = "5") int size) {
		ModelAndView mv = new ModelAndView();
		PageHelper.startPage(pn, size);
		List<User> uList = userService.findAll();
		PageInfo<User> list = new PageInfo<User>(uList);
		mv.addObject("list", list);
		mv.setViewName("success");
		return mv;
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	String login(@ModelAttribute User user, @RequestParam String kaptcha, HttpSession session, HttpServletRequest req, HttpServletResponse resp) {
		log.info("user:{},kaptcha:{}", user.toString(), kaptcha);
		if (session.getAttribute(Constants.KAPTCHA_SESSION_KEY).equals(kaptcha) && userService.findByTel(user.getTel()).getPassword().equals(user.getPassword())) {
			log.info("true");
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

	@RequestMapping(value = "logout", method = RequestMethod.GET)
	String logOut(HttpServletRequest req) {
		if (null != req.getSession().getAttribute("tel")) {
			req.getSession().removeAttribute("tel");
			req.getSession().invalidate();
		}
		return "redirect:/index.html";
	}
}

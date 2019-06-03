/**
 * @fileName: UserController
 * @author: L
 * @date: 2019/6/3 18:23
 * @description:
 * @history: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.wigon.controller.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.wigon.service.UserService;

import javax.annotation.Resource;

@RequestMapping("/user")
@Controller
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
}

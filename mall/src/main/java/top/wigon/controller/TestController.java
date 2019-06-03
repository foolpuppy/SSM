/**
 * @fileName: TestController
 * @author: L
 * @date: 2019/6/2 12:33
 * @description:
 * @history: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.wigon.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class TestController {
	@RequestMapping("/test")
	String test() {
		log.info("test");
		log.debug("test");
		return "500";
	}
}

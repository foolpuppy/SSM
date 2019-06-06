/**
 * @fileName: ItemController
 * @author: L
 * @date: 2019/6/4 15:25
 * @description:
 * @history: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.wigon.controller.front;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import top.wigon.common.ReturnT;
import top.wigon.pojo.Item;
import top.wigon.service.ItemService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by xuxueli on '2019-06-04 15:24:21'.
 */
@Slf4j
@Controller
@RequestMapping("/item")
public class ItemController {

	@Resource
	private ItemService itemService;

	/**
	 * 新增
	 */
	@RequestMapping("/insert")
	@ResponseBody
	public ReturnT<String> insert(Item item) {
		return itemService.insert(item);
	}

	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public ReturnT<String> delete(int id) {
		return itemService.delete(id);
	}

	/**
	 * 更新
	 */
	@RequestMapping("/update")
	@ResponseBody
	public ReturnT<String> update(Item item) {
		return itemService.update(item);
	}

	/**
	 * Load查询
	 */
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView load(@PathVariable int id) {
		log.info("id:{}", id);
		log.info("ReturnT<Item>(itemService.load(id):{}", new ReturnT<Item>(itemService.load(id)));
		ModelAndView mv=new ModelAndView();
		mv.addObject("list", new ReturnT<Item>(itemService.load(id)).getData());
		mv.setViewName("success");
		return mv;
	}


}

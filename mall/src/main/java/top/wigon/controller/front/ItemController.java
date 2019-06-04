/**
 * @fileName: ItemController
 * @author: L
 * @date: 2019/6/4 15:25
 * @description:
 * @history: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.wigon.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
@Controller
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
	@RequestMapping("/load")
	@ResponseBody
	public ReturnT<Item> load(int id) {
		return new ReturnT<Item>(itemService.load(id));
	}

	/**
	 * 分页查询
	 */
	@RequestMapping("/pageList")
	@ResponseBody
	public Map<String, Object> pageList(@RequestParam(required = false, defaultValue = "0") int offset,
	                                    @RequestParam(required = false, defaultValue = "10") int pagesize) {
		return itemService.pageList(offset, pagesize);
	}

}

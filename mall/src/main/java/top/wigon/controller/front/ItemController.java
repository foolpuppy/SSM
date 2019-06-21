/**
 * @fileName: ItemController
 * @author: L
 * @date: 2019/6/4 15:25
 * @description:
 * @history: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.wigon.controller.front;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.wigon.common.ReturnT;
import top.wigon.pojo.Item;
import top.wigon.service.ItemService;

import javax.annotation.Resource;
import java.util.List;

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
	 *
	 * @return
	 */
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "text/plain;charset=utf-8")
	@ResponseBody
	public String load(@PathVariable int id) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		String JSON = null;
		try {
			JSON = objectMapper.writeValueAsString(itemService.load(id));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		StringBuffer content = new StringBuffer();
		content.append("{\n" +
				"  \"status\": 0,\n" +
				"  \"detailList\":[");
		content.append(JSON);
		content.append("]}");
		return content.toString();
	}

	@RequestMapping(value = "/searchByCategory", method = RequestMethod.GET, produces = "text/plain;charset=utf-8")
	@ResponseBody
	public String loadByCategory(String category) {
		log.info("category:{}", category);
		log.info("List<Item>:{}", itemService.loadByCategory(category));
		ObjectMapper objectMapper = new ObjectMapper();
		String JSON = null;
		try {
			JSON = objectMapper.writeValueAsString(itemService.loadByCategory(category));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		StringBuffer content = new StringBuffer();
		content.append("{\"status\":0,\"content\":");
		content.append(JSON);
		content.append("}");
		return content.toString();
	}

	@RequestMapping(value = "search", produces = "text/plain;charset=utf-8")

	@ResponseBody
	public String search(@RequestParam String title) {

		List<Item> userList = itemService.loadByTitle(title);
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		String JSON = null;
		try {
			JSON = objectMapper.writeValueAsString(userList);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		StringBuffer content = new StringBuffer();
		content.append("{\"status\":");
		content.append("0");
		content.append(",\"content\":");
		content.append(JSON);
		content.append("}");
		return content.toString();


	}


}

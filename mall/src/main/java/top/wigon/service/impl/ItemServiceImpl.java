/**
 * @fileName: ItemServiceImpl
 * @author: L
 * @date: 2019/6/4 15:26
 * @description:
 * @history: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.wigon.service.impl;

import org.springframework.stereotype.Service;
import top.wigon.common.ReturnT;
import top.wigon.dao.ItemMapper;
import top.wigon.pojo.Item;
import top.wigon.service.ItemService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuxueli on '2019-06-04 15:24:21'.
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Resource
	private ItemMapper itemMapper;

	/**
	 * 新增
	 */
	@Override
	public ReturnT<String> insert(Item item) {

		// valid
		if (item == null) {
			return new ReturnT<String>(ReturnT.FAIL_CODE, "必要参数缺失");
		}

		itemMapper.insert(item);
		return ReturnT.SUCCESS;
	}

	/**
	 * 删除
	 */
	@Override
	public ReturnT<String> delete(int id) {
		int ret = itemMapper.delete(id);
		return ret > 0 ? ReturnT.SUCCESS : ReturnT.FAIL;
	}

	/**
	 * 更新
	 */
	@Override
	public ReturnT<String> update(Item item) {
		int ret = itemMapper.update(item);
		return ret > 0 ? ReturnT.SUCCESS : ReturnT.FAIL;
	}

	/**
	 * Load查询
	 */
	@Override
	public Item load(int id) {
		return itemMapper.load(id);
	}

	/**
	 * 分页查询
	 */
	@Override
	public Map<String, Object> pageList(int offset, int pagesize) {

		List<Item> pageList = itemMapper.pageList(offset, pagesize);
		int totalCount = itemMapper.pageListCount(offset, pagesize);

		// result
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("pageList", pageList);
		result.put("totalCount", totalCount);

		return result;
	}

	/**
	 * 分类查询
	 *
	 * @param category
	 * @return
	 */
	@Override
	public List<Item> loadByCategory(String category) {
		return itemMapper.loadByCategory(category);
	}

	/**
	 * 分页查询
	 *
	 * @param offset
	 * @param pagesize
	 * @return
	 */
	@Override
	public List<Item> loadPage(int offset, int pagesize) {
		return itemMapper.pageList(offset, pagesize);
	}

	@Override
	public List<Item> loadByTitle(String title) {
		return itemMapper.loadByTitle(title);
	}

}

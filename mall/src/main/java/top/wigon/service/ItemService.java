/**
 * @fileName: ItemService
 * @author: L
 * @date: 2019/6/4 15:25
 * @description:
 * @history: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.wigon.service;

import org.springframework.context.annotation.Bean;
import top.wigon.common.ReturnT;
import top.wigon.pojo.Item;

import java.util.List;
import java.util.Map;

/**
 * Created by xuxueli on '2019-06-04 15:24:21'.
 */
public interface ItemService {

	/**
	 * 新增
	 */
	public ReturnT<String> insert(Item item);

	/**
	 * 删除
	 */
	public ReturnT<String> delete(int id);

	/**
	 * 更新
	 */
	public ReturnT<String> update(Item item);

	/**
	 * Load查询
	 */
	public Item load(int id);

	/**
	 * 分类查询
	 * @param category
	 * @return
	 */
	public List<Item> loadByCategory(String category);

}

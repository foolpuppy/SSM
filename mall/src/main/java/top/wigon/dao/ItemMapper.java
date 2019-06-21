package top.wigon.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import top.wigon.pojo.Item;

import java.util.List;

/**
 * Created by xuxueli on '2019-06-21 16:22:28'.
 */
@Component
public interface ItemMapper {

	/**
	 * 新增
	 */
	public int insert(@Param("item") Item item);

	/**
	 * 删除
	 */
	public int delete(@Param("id") int id);

	/**
	 * 更新
	 */
	public int update(@Param("item") Item item);

	/**
	 * Load查询
	 */
	public Item load(@Param("id") int id);

	/**
	 * 分页查询Data
	 */
	public List<Item> pageList(@Param("offset") int offset,
	                           @Param("pagesize") int pagesize);

	/**
	 * 分页查询Count
	 */
	public int pageListCount(@Param("offset") int offset,
	                         @Param("pagesize") int pagesize);

	/**
	 * 分类查询
	 *
	 * @param category
	 * @return
	 */
	List<Item> loadByCategory(String category);

	/**
	 * 根据名字查找商品
	 *
	 * @param title
	 * @return
	 */

	public List<Item> loadByTitle(String title);

}

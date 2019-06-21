package top.wigon.service;

import top.wigon.common.ReturnT;
import top.wigon.pojo.Delivery;

import java.util.Map;

/**
 *
 *
 * Created by xuxueli on '2019-06-21 16:18:06'.
 */
public interface DeliveryService {

	/**
	 * 新增
	 */
	public ReturnT<String> insert(Delivery delivery);

	/**
	 * 删除
	 */
	public ReturnT<String> delete(int id);

	/**
	 * 更新
	 */
	public ReturnT<String> update(Delivery delivery);

	/**
	 * Load查询
	 */
	public Delivery load(int id);

	/**
	 * 分页查询
	 */
	public Map<String,Object> pageList(int offset, int pagesize);

}

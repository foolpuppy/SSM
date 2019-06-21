package top.wigon.service.impl;

import org.springframework.stereotype.Service;
import top.wigon.common.ReturnT;
import top.wigon.dao.DeliveryMapper;
import top.wigon.pojo.Delivery;
import top.wigon.service.DeliveryService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 *
 * Created by xuxueli on '2019-06-21 16:18:06'.
 */
@Service
public class DeliveryServiceImpl implements DeliveryService {

	@Resource
	private DeliveryMapper deliveryDao;

	/**
	 * 新增
	 */
	@Override
	public ReturnT<String> insert(Delivery delivery) {

		// valid
		if (delivery == null) {
			return new ReturnT<String>(ReturnT.FAIL_CODE, "必要参数缺失");
		}

		deliveryDao.insert(delivery);
		return ReturnT.SUCCESS;
	}

	/**
	 * 删除
	 */
	@Override
	public ReturnT<String> delete(int id) {
		int ret = deliveryDao.delete(id);
		return ret>0?ReturnT.SUCCESS:ReturnT.FAIL;
	}

	/**
	 * 更新
	 */
	@Override
	public ReturnT<String> update(Delivery delivery) {
		int ret = deliveryDao.update(delivery);
		return ret>0?ReturnT.SUCCESS:ReturnT.FAIL;
	}

	/**
	 * Load查询
	 */
	@Override
	public Delivery load(int id) {
		return deliveryDao.load(id);
	}

	/**
	 * 分页查询
	 */
	@Override
	public Map<String,Object> pageList(int offset, int pagesize) {

		List<Delivery> pageList = deliveryDao.pageList(offset, pagesize);
		int totalCount = deliveryDao.pageListCount(offset, pagesize);

		// result
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("pageList", pageList);
		result.put("totalCount", totalCount);

		return result;
	}

}

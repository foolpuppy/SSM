/**
 * @fileName: UserServiceImpl
 * @author: L
 * @date: 2019/6/3 18:26
 * @description:
 * @history: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.wigon.service.impl;

import org.springframework.stereotype.Service;
import top.wigon.common.ReturnT;
import top.wigon.dao.UserMapper;
import top.wigon.pojo.User;
import top.wigon.service.UserService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuxueli on '2019-06-03 16:22:54'.
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	/**
	 * 新增
	 */
	@Override
	public ReturnT<String> insert(User user) {

		// valid
		if (user == null) {
			return new ReturnT<String>(ReturnT.FAIL_CODE, "必要参数缺失");
		}


		return userMapper.insert(user) == 1 ? ReturnT.SUCCESS : ReturnT.FAIL;
	}

	/**
	 * 删除
	 */
	@Override
	public ReturnT<String> delete(int id) {
		int ret = userMapper.delete(id);
		return ret > 0 ? ReturnT.SUCCESS : ReturnT.FAIL;
	}

	/**
	 * 更新
	 */
	@Override
	public ReturnT<String> update(User user) {
		int ret = userMapper.update(user);
		return ret > 0 ? ReturnT.SUCCESS : ReturnT.FAIL;
	}

	/**
	 * Load查询
	 */
	@Override
	public User load(int id) {
		return userMapper.load(id);
	}

	/**
	 * 分页查询
	 */
	@Override
	public Map<String, Object> pageList(int offset, int pagesize) {

		List<User> pageList = userMapper.pageList(offset, pagesize);
		int totalCount = userMapper.pageListCount(offset, pagesize);

		// result
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("pageList", pageList);
		result.put("totalCount", totalCount);

		return result;
	}


	@Override
	public User findByTel(String tel) {
		return userMapper.selectByTel(tel);
	}

}

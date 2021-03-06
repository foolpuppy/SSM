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
import java.util.List;

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

		userMapper.insert(user);
		return ReturnT.SUCCESS;
	}

	/**
	 * 删除
	 */
	@Override
	public ReturnT<String> delete(int id) {
		int ret = userMapper.deleteByPrimaryKey(id);
		return ret > 0 ? ReturnT.SUCCESS : ReturnT.FAIL;
	}

	/**
	 * 更新
	 */
	@Override
	public ReturnT<String> update(User user) {
		int ret = userMapper.updateByPrimaryKey(user);
		return ret > 0 ? ReturnT.SUCCESS : ReturnT.FAIL;
	}

	/**
	 * 获取所有用户
	 *
	 * @return
	 */
	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}

	/**
	 * Load查询
	 */
	@Override
	public User find(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public User findByTel(String tel) {
		return userMapper.selectByTel(tel);
	}

}

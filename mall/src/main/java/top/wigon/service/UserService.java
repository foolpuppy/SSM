/**
 * @fileName: UserService
 * @author: L
 * @date: 2019/6/3 18:26
 * @description:
 * @history: <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package top.wigon.service;
import org.springframework.stereotype.Service;
import top.wigon.common.ReturnT;
import top.wigon.pojo.User;

import java.util.Map;

/**
 *
 *
 * Created by xuxueli on '2019-06-03 16:22:54'.
 */
public interface UserService {

	/**
	 * 新增
	 */
	public ReturnT<String> insert(User user);

	/**
	 * 删除
	 */
	public ReturnT<String> delete(int id);

	/**
	 * 更新
	 */
	public ReturnT<String> update(User user);

	/**
	 * Load查询
	 */
	public User load(int id);

}

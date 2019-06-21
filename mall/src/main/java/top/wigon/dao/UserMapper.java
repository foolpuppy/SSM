package top.wigon.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import top.wigon.pojo.User;

@Component
public interface UserMapper {

	/**
	 * 新增
	 */
	public int insert(@Param("user") User user);

	/**
	 * 删除
	 */
	public int delete(@Param("id") int id);

	/**
	 * 更新
	 */
	public int update(@Param("user") User user);

	/**
	 * Load查询
	 */
	public User load(@Param("id") int id);

	/**
	 * Load查询 ByTEL
	 */
	public User selectByTel(@Param("tel") String tel);

	/**
	 * 分页查询Data
	 */
	public List<User> pageList(@Param("offset") int offset,
	                           @Param("pagesize") int pagesize);

	/**
	 * 分页查询Count
	 */
	public int pageListCount(@Param("offset") int offset,
	                         @Param("pagesize") int pagesize);

}
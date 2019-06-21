package top.wigon.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * user
 *
 * @author
 */
@Data
public class User implements Serializable {
	private static final long serialVersionUID = 42L;

	/**
	 * 唯一主键UUID
	 */
	private int id;

	/**
	 *
	 */
	private String tel;

	/**
	 *
	 */
	private String email;

	/**
	 *
	 */
	private String username;

	/**
	 * 加密密码
	 */
	private String password;

	/**
	 * 用户头像相对路径
	 */
	private String uimg;

	/**
	 * 是否开启1 开启，0 关闭
	 */
	private int active;

	/**
	 * 用户类别：1普通用户，2商家用户，3管理员用户
	 */
	private int role;

	/**
	 *
	 */
	private Date gmtCreate;

	/**
	 *
	 */
	private Date gmtModified;
}
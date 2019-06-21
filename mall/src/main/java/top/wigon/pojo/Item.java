package top.wigon.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by xuxueli on '2019-06-21 16:22:28'.
 */
@Data
public class Item implements Serializable {
	private static final long serialVersionUID = 42L;

	/**
	 *
	 */
	private int id;

	/**
	 *
	 */
	private String title;

	/**
	 *
	 */
	private String category;

	/**
	 *
	 */
	private BigDecimal price;

	/**
	 * 商品的图片地址
	 */
	private String img;

	/**
	 * \"\"
	 */
	private String description;

	/**
	 *
	 */
	private int stock;

	/**
	 * 商品状态1是上架，2是下架
	 */
	private int state;

	/**
	 * 店铺ID
	 */
	private String shopId;

	/**
	 *
	 */
	private Date gmtCreate;

	/**
	 *
	 */
	private Date gmtModified;
}
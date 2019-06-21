package top.wigon.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * delivery
 *
 * @author
 */
@Data
public class Delivery implements Serializable {
	private static final long serialVersionUID = 42L;

	/**
	 *
	 */
	private int id;

	/**
	 *
	 */
	private int oid;

	/**
	 *
	 */
	private String name;

	/**
	 *
	 */
	private String tel;

	/**
	 *
	 */
	private String state;

	/**
	 *
	 */
	private String city;

	/**
	 *
	 */
	private String district;

	/**
	 *
	 */
	private String address;

	/**
	 *
	 */
	private String currentLocation;

	/**
	 * 配送状态，0未配送，1配送中，2已签收
	 */
	private int deliveryState;

	/**
	 *
	 */
	private Date gmtCreate;

	/**
	 *
	 */
	private Date gmtModified;
}
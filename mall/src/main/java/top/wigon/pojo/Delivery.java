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
	private Integer id;

	private Integer oid;

	private String name;

	private String tel;

	private String state;

	private String city;

	private String district;

	private String address;

	private String currentlocation;

	/**
	 * 配送状态，0未配送，1配送中，2已签收
	 */
	private Byte deliverystate;

	private Date gmtCreate;

	private Date gmtModified;

	private static final long serialVersionUID = 1L;


}
package top.wigon.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * order
 * @author 
 */
@Data
public class Order implements Serializable {
    private Integer id;

    /**
     * 用户ID
     */
    private String uid;

    private Integer totalmoney;

    private Date paydatetime;

    /**
     * 订单状态默认未付款,1未付款，2已付款，3待发货，4已发货，5已收货
     */
    private Byte orderstate;

    /**
     * 支付宝流水号
     */
    private String outtradeno;

    private String expresscode;

    private String expressname;

    private Date consigndatetime;

    private Date gmtCreate;

    private Date gmtModified;

    private static final long serialVersionUID = 1L;

}
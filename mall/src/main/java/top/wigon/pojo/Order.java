package top.wigon.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * order
 * @author 
 */
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Integer totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Date getPaydatetime() {
        return paydatetime;
    }

    public void setPaydatetime(Date paydatetime) {
        this.paydatetime = paydatetime;
    }

    public Byte getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Byte orderstate) {
        this.orderstate = orderstate;
    }

    public String getOuttradeno() {
        return outtradeno;
    }

    public void setOuttradeno(String outtradeno) {
        this.outtradeno = outtradeno;
    }

    public String getExpresscode() {
        return expresscode;
    }

    public void setExpresscode(String expresscode) {
        this.expresscode = expresscode;
    }

    public String getExpressname() {
        return expressname;
    }

    public void setExpressname(String expressname) {
        this.expressname = expressname;
    }

    public Date getConsigndatetime() {
        return consigndatetime;
    }

    public void setConsigndatetime(Date consigndatetime) {
        this.consigndatetime = consigndatetime;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}
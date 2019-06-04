package top.wigon.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * item
 * @author 
 */
@Data
public class Item implements Serializable {
    private Integer id;

    private String title;

    private String category;

    private BigDecimal price;

    private Integer stock;

    /**
     * 商品状态1是上架，2是下架
     */
    private Byte state;

    /**
     * 店铺ID
     */
    private String shopid;

    private Date gmtCreate;

    private Date gmtModified;

    private static final long serialVersionUID = 1L;

}
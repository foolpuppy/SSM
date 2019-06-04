package top.wigon.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * orderitem
 * @author 
 */
@Data
public class Orderitem implements Serializable {
    private Integer id;

    private Integer oid;

    private Integer pid;

    /**
     * 该商品的数量
     */
    private Integer num;

    private Date gmtCreate;

    private Date gmtModified;

    private static final long serialVersionUID = 1L;

}
package top.wigon.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * iteminfo
 * @author 
 */
@Data
public class Iteminfo implements Serializable {
    private Integer id;

    private Integer iid;

    /**
     * 商品的图片地址
     */
    private String img;

    private Date gmtCreate;

    private Date gmtModified;

    /**
     * ""
     */
    private String description;

    private static final long serialVersionUID = 1L;


}
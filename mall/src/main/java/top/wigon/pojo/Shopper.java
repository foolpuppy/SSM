package top.wigon.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * shopper
 * @author 
 */
@Data
public class Shopper implements Serializable {
    private Integer id;

    private Integer uid;

    private Date gmtCreate;

    private Date gmtModified;

    private static final long serialVersionUID = 1L;

}
package top.wigon.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import top.wigon.pojo.Delivery;

import java.util.List;

/**
 *
 *
 * Created by xuxueli on '2019-06-21 16:18:06'.
 */
@Component
public interface DeliveryMapper {

    /**
     * 新增
     */
    public int insert(@Param("delivery") Delivery delivery);

    /**
     * 删除
     */
    public int delete(@Param("id") int id);

    /**
     * 更新
     */
    public int update(@Param("delivery") Delivery delivery);

    /**
     * Load查询
     */
    public Delivery load(@Param("id") int id);

    /**
     * 分页查询Data
     */
    public List<Delivery> pageList(@Param("offset") int offset,
                                   @Param("pagesize") int pagesize);

    /**
     * 分页查询Count
     */
    public int pageListCount(@Param("offset") int offset,
                             @Param("pagesize") int pagesize);

}

package top.wigon.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.wigon.pojo.Delivery;
import top.wigon.pojo.DeliveryExample;

@Repository
public interface DeliveryMapper {
    long countByExample(DeliveryExample example);

    int deleteByExample(DeliveryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Delivery record);

    int insertSelective(Delivery record);

    List<Delivery> selectByExample(DeliveryExample example);

    Delivery selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Delivery record, @Param("example") DeliveryExample example);

    int updateByExample(@Param("record") Delivery record, @Param("example") DeliveryExample example);

    int updateByPrimaryKeySelective(Delivery record);

    int updateByPrimaryKey(Delivery record);
}
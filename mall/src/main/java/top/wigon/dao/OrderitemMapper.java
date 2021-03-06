package top.wigon.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.wigon.pojo.Orderitem;
import top.wigon.pojo.OrderitemExample;

@Repository
public interface OrderitemMapper {
    long countByExample(OrderitemExample example);

    int deleteByExample(OrderitemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Orderitem record);

    int insertSelective(Orderitem record);

    List<Orderitem> selectByExample(OrderitemExample example);

    Orderitem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Orderitem record, @Param("example") OrderitemExample example);

    int updateByExample(@Param("record") Orderitem record, @Param("example") OrderitemExample example);

    int updateByPrimaryKeySelective(Orderitem record);

    int updateByPrimaryKey(Orderitem record);
}
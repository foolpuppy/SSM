package top.wigon.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.wigon.pojo.Shopper;
import top.wigon.pojo.ShopperExample;

@Repository
public interface ShopperMapper {
    long countByExample(ShopperExample example);

    int deleteByExample(ShopperExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Shopper record);

    int insertSelective(Shopper record);

    List<Shopper> selectByExample(ShopperExample example);

    Shopper selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Shopper record, @Param("example") ShopperExample example);

    int updateByExample(@Param("record") Shopper record, @Param("example") ShopperExample example);

    int updateByPrimaryKeySelective(Shopper record);

    int updateByPrimaryKey(Shopper record);
}
package top.wigon.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.wigon.pojo.Iteminfo;
import top.wigon.pojo.IteminfoExample;

@Repository
public interface IteminfoMapper {
    long countByExample(IteminfoExample example);

    int deleteByExample(IteminfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Iteminfo record);

    int insertSelective(Iteminfo record);

    List<Iteminfo> selectByExampleWithBLOBs(IteminfoExample example);

    List<Iteminfo> selectByExample(IteminfoExample example);

    Iteminfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Iteminfo record, @Param("example") IteminfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Iteminfo record, @Param("example") IteminfoExample example);

    int updateByExample(@Param("record") Iteminfo record, @Param("example") IteminfoExample example);

    int updateByPrimaryKeySelective(Iteminfo record);

    int updateByPrimaryKeyWithBLOBs(Iteminfo record);

    int updateByPrimaryKey(Iteminfo record);
}
package cn.gson.jd2021.model.mapper.tjq;

import cn.gson.jd2021.model.pojos.GgFactory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GgFactoryMapper {
    //删除 生产厂商
    Integer doDelete(Integer id);

    //查询所有 汽车厂商、品牌 一个汽车厂商有多个品牌
    List<GgFactory> selectAll();
    //查询 生产厂商
    List<GgFactory> selectall(GgFactory ggFactory);

    int deleteByPrimaryKey(Integer factoryId);

    int insert(GgFactory record);

    int insertSelective(GgFactory record);

    GgFactory selectByPrimaryKey(Integer factoryId);

    int updateByPrimaryKeySelective(GgFactory record);

    int updateByPrimaryKey(GgFactory record);
}
package cn.gson.jd2021.model.mapper.tjq;

import cn.gson.jd2021.model.pojos.GgColor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GgColorMapper {
    //多条件查询 查询所有
    List<GgColor> select(GgColor ggColor);
    int deleteByPrimaryKey(Integer colorId);

    int insert(GgColor record);

    int insertSelective(GgColor record);

    GgColor selectByPrimaryKey(Integer colorId);

    int updateByPrimaryKeySelective(GgColor record);

    int updateByPrimaryKey(GgColor record);
}
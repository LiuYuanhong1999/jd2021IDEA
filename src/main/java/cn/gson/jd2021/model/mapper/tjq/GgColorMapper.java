package cn.gson.jd2021.model.mapper.tjq;

import cn.gson.jd2021.model.pojos.GgColor;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GgColorMapper {
    int deleteByPrimaryKey(Integer colorId);

    int insert(GgColor record);

    int insertSelective(GgColor record);

    GgColor selectByPrimaryKey(Integer colorId);

    int updateByPrimaryKeySelective(GgColor record);

    int updateByPrimaryKey(GgColor record);
}
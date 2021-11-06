package cn.gson.jd2021.model.mapper.tjq;

import cn.gson.jd2021.model.pojos.GgCoustomertype;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GgCoustomertypeMapper {
    int deleteByPrimaryKey(Integer ctId);

    int insert(GgCoustomertype record);

    int insertSelective(GgCoustomertype record);

    GgCoustomertype selectByPrimaryKey(Integer ctId);

    int updateByPrimaryKeySelective(GgCoustomertype record);

    int updateByPrimaryKey(GgCoustomertype record);
}
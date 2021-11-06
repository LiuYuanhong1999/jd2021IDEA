package cn.gson.jd2021.model.mapper.tjq;

import cn.gson.jd2021.model.pojos.GgSource;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GgSourceMapper {
    int deleteByPrimaryKey(Integer sourceId);

    int insert(GgSource record);

    int insertSelective(GgSource record);

    GgSource selectByPrimaryKey(Integer sourceId);

    int updateByPrimaryKeySelective(GgSource record);

    int updateByPrimaryKey(GgSource record);
}
package cn.gson.jd2021.model.mapper.tjq;

import cn.gson.jd2021.model.pojos.GgFactory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GgFactoryMapper {
    int deleteByPrimaryKey(Integer factoryId);

    int insert(GgFactory record);

    int insertSelective(GgFactory record);

    GgFactory selectByPrimaryKey(Integer factoryId);

    int updateByPrimaryKeySelective(GgFactory record);

    int updateByPrimaryKey(GgFactory record);
}
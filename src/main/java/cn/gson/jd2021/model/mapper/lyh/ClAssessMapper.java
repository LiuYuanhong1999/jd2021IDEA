package cn.gson.jd2021.model.mapper.lyh;

import cn.gson.jd2021.model.pojos.ClAssess;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ClAssessMapper {
    int deleteByPrimaryKey(String assessId);

    int insert(ClAssess record);

    int insertSelective(ClAssess record);

    ClAssess selectByPrimaryKey(String assessId);

    int updateByPrimaryKeySelective(ClAssess record);

    int updateByPrimaryKey(ClAssess record);
}
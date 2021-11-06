package cn.gson.jd2021.model.mapper.hlj;

import cn.gson.jd2021.model.pojos.OtherBop;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OtherBopDao {
    int deleteByPrimaryKey(Integer otherId);

    int insert(OtherBop record);

    int insertSelective(OtherBop record);

    OtherBop selectByPrimaryKey(Integer otherId);

    int updateByPrimaryKeySelective(OtherBop record);

    int updateByPrimaryKey(OtherBop record);

    List<OtherBop> selectAllOtherBop(@Param("value")String value, @Param("input") String input);
}
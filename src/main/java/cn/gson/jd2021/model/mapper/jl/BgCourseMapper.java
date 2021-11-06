package cn.gson.jd2021.model.mapper.jl;

import cn.gson.jd2021.model.pojos.BgCourse;

public interface BgCourseMapper {
    int deleteByPrimaryKey(Integer bgceId);

    int insert(BgCourse record);

    int insertSelective(BgCourse record);

    BgCourse selectByPrimaryKey(Integer bgceId);

    int updateByPrimaryKeySelective(BgCourse record);

    int updateByPrimaryKey(BgCourse record);
}
package cn.gson.jd2021.model.mapper.jl;

import cn.gson.jd2021.model.pojos.BgCourse;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BgCourseMapper {
    int deleteByPrimaryKey(Integer bgceId);

    int insert(BgCourse record);

    /**
     * 新增审批流程过程
     * @param record
     * @return
     */
    int insertSelective(BgCourse record);

    BgCourse selectByPrimaryKey(Integer bgceId);

    int updateByPrimaryKeySelective(BgCourse record);

    int updateByPrimaryKey(BgCourse record);
}
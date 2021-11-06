package cn.gson.jd2021.model.mapper.jl;

import cn.gson.jd2021.model.pojos.BgGrade;

public interface BgGradeMapper {
    int deleteByPrimaryKey(Integer bggeId);

    int insert(BgGrade record);

    int insertSelective(BgGrade record);

    BgGrade selectByPrimaryKey(Integer bggeId);

    int updateByPrimaryKeySelective(BgGrade record);

    int updateByPrimaryKey(BgGrade record);
}
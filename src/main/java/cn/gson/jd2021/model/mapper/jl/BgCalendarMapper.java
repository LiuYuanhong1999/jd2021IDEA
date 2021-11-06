package cn.gson.jd2021.model.mapper.jl;

import cn.gson.jd2021.model.pojos.BgCalendar;

public interface BgCalendarMapper {
    int deleteByPrimaryKey(Integer bgcrId);

    int insert(BgCalendar record);

    int insertSelective(BgCalendar record);

    BgCalendar selectByPrimaryKey(Integer bgcrId);

    int updateByPrimaryKeySelective(BgCalendar record);

    int updateByPrimaryKey(BgCalendar record);
}
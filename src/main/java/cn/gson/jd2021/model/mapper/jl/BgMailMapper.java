package cn.gson.jd2021.model.mapper.jl;

import cn.gson.jd2021.model.pojos.BgMail;

public interface BgMailMapper {
    int deleteByPrimaryKey(Integer bgmlId);

    int insert(BgMail record);

    int insertSelective(BgMail record);

    BgMail selectByPrimaryKey(Integer bgmlId);

    int updateByPrimaryKeySelective(BgMail record);

    int updateByPrimaryKey(BgMail record);
}
package cn.gson.jd2021.model.mapper.jl;

import cn.gson.jd2021.model.pojos.BgLeave;

public interface BgLeaveMapper {
    int deleteByPrimaryKey(Integer bgleId);

    int insert(BgLeave record);

    int insertSelective(BgLeave record);

    BgLeave selectByPrimaryKey(Integer bgleId);

    int updateByPrimaryKeySelective(BgLeave record);

    int updateByPrimaryKey(BgLeave record);
}
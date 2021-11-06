package cn.gson.jd2021.model.mapper.jl;

import cn.gson.jd2021.model.pojos.BgFlow;

public interface BgFlowMapper {
    int deleteByPrimaryKey(Integer bgfwId);

    int insert(BgFlow record);

    int insertSelective(BgFlow record);

    BgFlow selectByPrimaryKey(Integer bgfwId);

    int updateByPrimaryKeySelective(BgFlow record);

    int updateByPrimaryKey(BgFlow record);
}
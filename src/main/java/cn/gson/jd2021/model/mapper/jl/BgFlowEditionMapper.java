package cn.gson.jd2021.model.mapper.jl;

import cn.gson.jd2021.model.pojos.BgFlowEdition;

public interface BgFlowEditionMapper {
    int deleteByPrimaryKey(Integer bgfnId);

    int insert(BgFlowEdition record);

    int insertSelective(BgFlowEdition record);

    BgFlowEdition selectByPrimaryKey(Integer bgfnId);

    int updateByPrimaryKeySelective(BgFlowEdition record);

    int updateByPrimaryKey(BgFlowEdition record);
}
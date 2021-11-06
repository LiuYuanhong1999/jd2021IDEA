package cn.gson.jd2021.model.mapper.jl;

import cn.gson.jd2021.model.pojos.BgExpenseAccount;

public interface BgExpenseAccountMapper {
    int deleteByPrimaryKey(Integer bgetId);

    int insert(BgExpenseAccount record);

    int insertSelective(BgExpenseAccount record);

    BgExpenseAccount selectByPrimaryKey(Integer bgetId);

    int updateByPrimaryKeySelective(BgExpenseAccount record);

    int updateByPrimaryKey(BgExpenseAccount record);
}
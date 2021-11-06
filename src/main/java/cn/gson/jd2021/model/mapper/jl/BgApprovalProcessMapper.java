package cn.gson.jd2021.model.mapper.jl;

import cn.gson.jd2021.model.pojos.jl.BgApprovalProcess;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BgApprovalProcessMapper {
    int deleteByPrimaryKey(Integer bgapId);

    int insert(BgApprovalProcess record);

    int insertSelective(BgApprovalProcess record);

    BgApprovalProcess selectByPrimaryKey(Integer bgapId);

    int updateByPrimaryKeySelective(BgApprovalProcess record);

    int updateByPrimaryKey(BgApprovalProcess record);
}
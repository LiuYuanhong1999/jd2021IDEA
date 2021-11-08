package cn.gson.jd2021.model.mapper.jl;

import cn.gson.jd2021.model.pojos.BgApprovalProcess;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BgApprovalProcessMapper {
    int deleteByPrimaryKey(Integer bgapId);

    int insert(BgApprovalProcess record);

    /**
     * 新增流程申请
     * @param bgApprovalProcess
     * @return
     */
    void insertSelective(BgApprovalProcess bgApprovalProcess);

    BgApprovalProcess selectByPrimaryKey(Integer bgapId);

    int updateByPrimaryKeySelective(BgApprovalProcess record);

    int updateByPrimaryKey(BgApprovalProcess record);

    /**
     * 查询待审批的流程
     * @return
     */
    List<BgApprovalProcess> selectbgapr ();

    /**
     * 查询审核中的流程
     * @return
     */
    List<BgApprovalProcess> selectbgapr1 ();
}
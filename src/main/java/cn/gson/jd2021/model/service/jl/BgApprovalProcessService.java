package cn.gson.jd2021.model.service.jl;

import cn.gson.jd2021.model.mapper.jl.BgApprovalProcessMapper;
import cn.gson.jd2021.model.pojos.BgApprovalProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class BgApprovalProcessService {
    @Autowired
    BgApprovalProcessMapper bgapproMap;

    /**
     * 新增流程申请
     * @param bgApprovalProcess
     */
    public void insertSelective(BgApprovalProcess bgApprovalProcess){
        bgapproMap.insertSelective(bgApprovalProcess);
    }

    /**
     * 查询待审批的流程
     * @return
     */
    public List<BgApprovalProcess> selectbgapr(){
         return bgapproMap.selectbgapr();
    }

    /**
     * 查询审核中的流程
     * @return
     */
    public List<BgApprovalProcess> selectbgapr1(){
        return bgapproMap.selectbgapr1();
    }
}

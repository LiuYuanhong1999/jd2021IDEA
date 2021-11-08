package cn.gson.jd2021.controller.jl;

import cn.gson.jd2021.model.pojos.BgApprovalProcess;
import cn.gson.jd2021.model.service.jl.BgApprovalProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BgApprovalProcessController {
    @Autowired
    BgApprovalProcessService bgrpprSer;

    /**
     * 查询待审批的流程
     * @return
     */
    @RequestMapping("select-bgapr")
    public List<BgApprovalProcess> selectbgapr(){
         return bgrpprSer.selectbgapr();
    }

    @RequestMapping("select-bgapr1")
    public List<BgApprovalProcess> selectbgapr1(){
        return bgrpprSer.selectbgapr1();
    }
}

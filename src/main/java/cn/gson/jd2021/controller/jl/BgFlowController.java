package cn.gson.jd2021.controller.jl;

import cn.gson.jd2021.model.pojos.BgFlow;
import cn.gson.jd2021.model.service.jl.BgFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class BgFlowController {
    @Autowired
    BgFlowService bgFlSer;

    /**
     * 查询所有流程
     * @return
     */
    @GetMapping("all-bgfwId")
    public List<BgFlow> selectbgflow (){
        return bgFlSer.selectbgflow();
    }

    /**
     * 新增流程
     * @param bgFlow
     * @return
     */
    @PostMapping("add-record")
    public void insert (@RequestBody BgFlow bgFlow){
         bgFlSer.insert(bgFlow);
    }
}

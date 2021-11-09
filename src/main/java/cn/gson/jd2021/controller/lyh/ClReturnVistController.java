package cn.gson.jd2021.controller.lyh;

import cn.gson.jd2021.model.pojos.ClAssess;
import cn.gson.jd2021.model.pojos.ClReturnVist;
import cn.gson.jd2021.model.service.lyh.ClReturnVistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClReturnVistController {

    @Autowired
    ClReturnVistService clReturnVistService;//回访


    //查询回访记录
    @RequestMapping("find-clReturnVist")
    public List<ClReturnVist> findClReturnVist(){
        return clReturnVistService.findClReturnVist();
    }

    //增加回访记录
    @PostMapping("add-clReturnVist")
    public void insert(@RequestBody ClReturnVist clReturnVist){
        clReturnVistService.insert(clReturnVist);
    }


    //根据评估编号获取评估信息
    @RequestMapping("findBy-clAssessId")
    private List<ClAssess> findClReturnVist(String assessId){
        return clReturnVistService.findClReturnVist(assessId);
    }


    //所有记录
    @RequestMapping("find-clReturnVist2")
    public List<ClReturnVist> findClReturnVist2(String vistId){
        return clReturnVistService.findClReturnVist2(vistId);
    }
}

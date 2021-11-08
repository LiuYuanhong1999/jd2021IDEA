package cn.gson.jd2021.controller.lyh;

import cn.gson.jd2021.model.pojos.ClAssess;
import cn.gson.jd2021.model.pojos.ClOrders;
import cn.gson.jd2021.model.service.lyh.ClAssessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClAssessController {


    @Autowired
    ClAssessService clAssessService;//车辆评估


    //查询评估记录
    @RequestMapping("find-clAssess")
     public List<ClAssess> findClAssess(){
        return clAssessService.findClAssess();
    }

    //增加评估记录
    @PostMapping("/add-clAssess")
    public void insertClAssess(@RequestBody ClAssess clAssess){
        clAssessService.insert(clAssess);
    }


    //查询客户预约已预约客户的信息
    @RequestMapping("find-clOrdersStates")
    public List<ClOrders> findClOrdersState(){
        return clAssessService.findClOrdersState();
    }

    @RequestMapping("find-clOrdersState1")
    public List<ClOrders> findClOrdersState2(String ordersId){
        return clAssessService.findClOrdersState3(ordersId);
    }
}

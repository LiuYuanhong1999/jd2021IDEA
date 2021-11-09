package cn.gson.jd2021.controller.lyh;


import cn.gson.jd2021.model.pojos.ClOrders;
import cn.gson.jd2021.model.pojos.GgArchive;
import cn.gson.jd2021.model.service.lyh.ClOrdersService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ClOrdersController {

    @Resource
    ClOrdersService clOrdersService;



    //客户预约成功记录
    @RequestMapping("find-clOrders")
    public List<ClOrders> findClOrders(){
        return clOrdersService.findClOrders();
    }


    //所有预约记录
    @RequestMapping("find-clOrders2")
    public List<ClOrders> findClOrders2(String ordersId){
        return clOrdersService.findClOrders2(ordersId);
    }

    //增加预约记录
    @PostMapping("add-clOrders")
    public void insert(@RequestBody ClOrders clOrders){
        clOrdersService.insert(clOrders);
    }




    //查询归档类型
    @RequestMapping("find-clOrdersType")
    public List<GgArchive> findClOrdersType(){
        return clOrdersService.findClOrdersType();
    }



}

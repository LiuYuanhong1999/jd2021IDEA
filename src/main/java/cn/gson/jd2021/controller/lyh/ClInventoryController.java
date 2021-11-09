package cn.gson.jd2021.controller.lyh;

import cn.gson.jd2021.model.pojos.ClInventory;
import cn.gson.jd2021.model.service.lyh.ClInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClInventoryController {

    @Autowired
    ClInventoryService clInventoryService;



    //查询库存
    @RequestMapping("find-clInventoryRecord")
    public List<ClInventory> findAll(String storageId){
        return clInventoryService.findAll(storageId);
    }


}

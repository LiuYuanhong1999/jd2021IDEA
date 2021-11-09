package cn.gson.jd2021.controller.lyh;

import cn.gson.jd2021.model.pojos.ClInventory;
import cn.gson.jd2021.model.pojos.ClReturnVist;
import cn.gson.jd2021.model.pojos.ClStorage;
import cn.gson.jd2021.model.service.lyh.ClStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClStorageController {

    @Autowired
    ClStorageService clStorageService;


    //查询所有记录
    @RequestMapping("select_ClStorageAll2")
    public List<ClStorage> findAll2(){
     return    clStorageService.selectClStorageAll2();
    }

    //查询库存记录
    @RequestMapping("select_ClStorageAll")
    public List<ClStorage> selectClStorageAll(){
        return clStorageService.selectClStorageAll();
    }



    //增加收车入库记录
    @PostMapping("add-clStorage")
    public void addClStorage(@RequestBody ClStorage clStorage){

        clStorageService.insert(clStorage);

    }

    //初始入库记录
    @PostMapping("add-clInitial")
    public void insertInventory(@RequestBody ClStorage clStorage){
        clStorageService.insertInitial(clStorage);
        }

    //初始入库
    @PostMapping("add-clInventory")
      public void insertClInventory(@RequestBody ClInventory clInventory){
        clStorageService.insertInventory(clInventory);

    }

    //收车入库
    @PostMapping("add-inventory")
    public void addClInventory(@RequestBody ClInventory clInventory){
        clStorageService.insertClInventory(clInventory);
    }


    //查询签约的回访单
    @RequestMapping("findBy-ClStorage")
    public List<ClReturnVist> findByClStorage(){
        return clStorageService.findByClStorage();
    }

    //根据签约单获取数据
    @RequestMapping("findBy-ClStorageRecord")
    public List<ClReturnVist> findByClStorage2(String vistId){
        return clStorageService.findByClStorage2(vistId);
    }
}

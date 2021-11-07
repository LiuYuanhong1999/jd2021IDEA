package cn.gson.jd2021.controller.lyh;

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



    //增加入库记录
    @PostMapping("add-clStorage")
    public void addClStorage(@RequestBody ClStorage clStorage){

        clStorageService.insert(clStorage);

    }



    //查询签约的回访单
    @RequestMapping("findBy-ClStorage")
    public List<ClReturnVist> findByClStorage(){
        return clStorageService.findByClStorage();
    }

    //根据签约单获取数据
    public List<ClReturnVist> findByClStorage2(String vistId){
        return clStorageService.findByClStorage2(vistId);
    }
}

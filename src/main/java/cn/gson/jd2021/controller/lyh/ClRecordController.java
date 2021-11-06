package cn.gson.jd2021.controller.lyh;

import cn.gson.jd2021.model.pojos.ClRecord;
import cn.gson.jd2021.model.service.lyh.ClRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("")
public class ClRecordController {

    @Autowired
    ClRecordService clRecordService;


    @RequestMapping("/find-clRecord")
    public List<ClRecord> findByClRecord(){
        return clRecordService.findByClRecord();
    }

}

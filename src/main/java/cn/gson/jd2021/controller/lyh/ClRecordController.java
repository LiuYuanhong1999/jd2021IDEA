package cn.gson.jd2021.controller.lyh;

import cn.gson.jd2021.model.pojos.ClRecord;
import cn.gson.jd2021.model.pojos.GgBrand;
import cn.gson.jd2021.model.pojos.GgColor;
import cn.gson.jd2021.model.pojos.GgDesign;
import cn.gson.jd2021.model.service.lyh.ClRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("")
public class ClRecordController {

    @Autowired
    ClRecordService clRecordService;

    //查询收车登记记录
    @RequestMapping("/find-clRecord")
    public List<ClRecord> findByClRecord(ClRecord clRecord){
        return clRecordService.findByClRecord(clRecord);
    }


    //增加收车登记
    @PostMapping("add-clRecord")
    public void addClRecord(@RequestBody ClRecord clRecord){
        clRecordService.insertRecord(clRecord);

    }


    //根据编号查询所有登记信息
    @RequestMapping("find-clRecordId")
    public List<ClRecord> findClRecordId(String recordId){
        return clRecordService.findClRecordId(recordId);
    }


    //查询品牌
    @RequestMapping("find-clGgBrand")
    public List<GgBrand> findGgBrand(){
        return clRecordService.findByBrand();
    }

    //根据品牌查询款式
    @RequestMapping("find-clGgDesign")
    public List<GgDesign> findByGgDesign(Integer brandId){

        return clRecordService.find(brandId);
    }

    //查询颜色
    @RequestMapping("find-clColor")
    public List<GgColor> findGgColor(){
        return clRecordService.findByColor();
    }


}

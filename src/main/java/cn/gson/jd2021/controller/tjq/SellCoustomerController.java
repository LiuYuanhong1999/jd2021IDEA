package cn.gson.jd2021.controller.tjq;

import cn.gson.jd2021.model.mapper.tjq.SellCoustomerMapper;
import cn.gson.jd2021.model.pojos.SellCoustomer;
import cn.gson.jd2021.model.pojos.vo.SellCoustomerVo;
import cn.gson.jd2021.model.service.tjq.SellCoustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/coustomer")
public class SellCoustomerController {
    @Autowired
    private SellCoustomerService sellCoustomerService;
    //新增
    @PostMapping
    public Integer put(@RequestBody SellCoustomer sellCoustomer){
        sellCoustomer.setCusTime(new Date());//建档日期
        sellCoustomer.setCusNo(getno());
        //本应该前端传送过来
        sellCoustomer.setListNum(1);//销售顾问
        return sellCoustomerService.doInsert(sellCoustomer);
    }
    //修改
    @PostMapping("update")
    public Integer update(@RequestBody SellCoustomer sellCoustomer){
        return sellCoustomerService.doUpdate(sellCoustomer);
    }
    //查询
    @PostMapping("show")
    public List<SellCoustomer> show(@RequestBody SellCoustomerVo vo){
        return sellCoustomerService.selectall(vo);
    }
    public String getno(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        String s=sdf.format(date);
        int rnd=(int)(Math.random()*(999999-100000+1))+100000;
        return s+rnd;
    }
}

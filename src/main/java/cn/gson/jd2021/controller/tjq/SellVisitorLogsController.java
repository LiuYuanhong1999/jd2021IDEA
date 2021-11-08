package cn.gson.jd2021.controller.tjq;

import cn.gson.jd2021.model.pojos.SellVisitorlogs;
import cn.gson.jd2021.model.pojos.vo.SellVisitorlogsVo;
import cn.gson.jd2021.model.service.tjq.SellVisitorlogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("logs")
public class SellVisitorLogsController {
    @Autowired
    private SellVisitorlogsService sellVisitorlogsService;
    //新增  接待人没有使用
    ////当状态为0 成交失败 ，直接新增
    //    //当状态为1 成功下单 将客户的状态改为 下单中
    @PostMapping
    public Integer put(@RequestBody SellVisitorlogs sellVisitorlogs){
        sellVisitorlogs.setLogTime(new Date());
        return sellVisitorlogsService.add(sellVisitorlogs);
    }
    //修改
    @PostMapping("update")
    public Integer update(@RequestBody SellVisitorlogs sellVisitorlogs){
        return sellVisitorlogsService.doUpdate(sellVisitorlogs);
    }
    //查询
    @PostMapping("show")
    public List<SellVisitorlogs> show(@RequestBody SellVisitorlogsVo vo){
        return sellVisitorlogsService.selectall(vo);
    }
}

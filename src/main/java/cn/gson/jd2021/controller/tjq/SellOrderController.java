package cn.gson.jd2021.controller.tjq;

import cn.gson.jd2021.model.pojos.ClInventory;
import cn.gson.jd2021.model.pojos.SellOrder;
import cn.gson.jd2021.model.pojos.vo.SellOrderVo;
import cn.gson.jd2021.model.service.tjq.SellOrderService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/order")
public class SellOrderController {
    @Autowired
    private SellOrderService sellOrderService;
    //新增
    @PostMapping
    public Integer put(@RequestBody SellOrder sellOrder){
        sellOrder.setOrderId("G"+getno());
        sellOrder.setOrderTime(new Date());
        sellOrder.setOrderBillno("F"+getno());
        return sellOrderService.add(sellOrder);
    }
    //修改
    @PostMapping("/update")
    public Integer update(@RequestBody SellOrder sellOrder){
        sellOrder.setOrderFordate(new Date());
        return sellOrderService.update(sellOrder);
    }
    //查询所有
    @PostMapping("show")
    public List<SellOrder> select(@RequestBody SellOrderVo vo ){
        return sellOrderService.selectall(vo);
    }
    @GetMapping("storage")
    public List<ClInventory> storage(Integer op){
        return sellOrderService.selectByOp(op);
    }
    //单号
    public String getno(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        String s=sdf.format(date);
        int rnd=(int)(Math.random()*(999999-100000+1))+100000;
        return s+rnd;

    }
    //查询
    @GetMapping("/slelctDebt")
    public PageInfo<SellOrder> slelctDebt(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize, @RequestParam(value = "value",required = false) String value, @RequestParam(value = "input",required = false) String input) {
        return sellOrderService.selectSellOrderByQk(currentPage,pagesize,value,input);
    }

    //修改欠款金额
    @PutMapping("/updDebt")
    public int updDebt(@RequestBody SellOrder sellOrder) {
        return sellOrderService.updSellOrderByQk(sellOrder);
    }
}


package cn.gson.jd2021.controller.tjq;

import cn.gson.jd2021.model.pojos.SellOrder;
import cn.gson.jd2021.model.service.tjq.SellOrderService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 贺罗金
 * @version 1.0
 * @date 2021-11-07 16:40
 */
@RestController
public class SellOderController {

    @Resource
    SellOrderService sellOrderService;

    //查询
    @GetMapping("/slelctDebt")
        public PageInfo<SellOrder> slelctDebt(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize, @RequestParam(value = "value",required = false) String value, @RequestParam(value = "input",required = false) String input) {
            return sellOrderService.selectSellOrderByQk(currentPage,pagesize,value,input);
    }
}

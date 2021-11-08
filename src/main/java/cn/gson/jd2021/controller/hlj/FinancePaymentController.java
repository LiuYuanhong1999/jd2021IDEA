package cn.gson.jd2021.controller.hlj;

import cn.gson.jd2021.model.pojos.FinancePayment;
import cn.gson.jd2021.model.service.hlj.FinancePaymentService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author 贺罗金
 * @version 1.0
 * @date 2021-11-07 8:59
 */
@RestController
public class FinancePaymentController {
    @Resource
    FinancePaymentService financePaymentService;

    @GetMapping("/selectAllFinancePayment")
    public PageInfo<FinancePayment> selectAllFinancePayment(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize, @RequestParam(value = "value",required = false) String value, @RequestParam(value = "input",required = false) String input) {
        return financePaymentService.selectAllFinancePayment(currentPage,pagesize,value,input);
    }

    @PostMapping("/addFinancePayment")
    public FinancePayment addFinancePayment(@RequestBody FinancePayment financePayment){
        financePaymentService.addFinancePayment(financePayment);
        return financePayment;
    }

    @PutMapping("/updFinancePayment")
    public FinancePayment updFinancePayment(@RequestBody FinancePayment financePayment){
        financePaymentService.updFinancePayment(financePayment);
        return financePayment;
    }

    @DeleteMapping("/delFinancePayment")
    public FinancePayment delFinancePayment(@RequestBody FinancePayment financePayment){
        financePaymentService.delFinancePayment(financePayment);
        return financePayment;
    }
}

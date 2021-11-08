package cn.gson.jd2021.model.service.hlj;

import cn.gson.jd2021.model.pojos.FinancePayment;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 贺罗金
 * @version 1.0
 * @date 2021-11-07 8:42
 */
public interface FinancePaymentService {
    //多条件查询
    PageInfo<FinancePayment> selectAllFinancePayment(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize, @RequestParam(value = "value",required = false) String value, @RequestParam(value = "input",required = false) String input);

    //新增其他收支记录
    FinancePayment addFinancePayment(FinancePayment financePayment);

    //修改其他收支记录
    FinancePayment updFinancePayment(FinancePayment financePayment);

    //删除其他收支记录
    FinancePayment delFinancePayment(FinancePayment financePayment);
}

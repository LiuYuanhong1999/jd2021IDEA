package cn.gson.jd2021.model.service.hlj;

import cn.gson.jd2021.model.pojos.CustomerRecord;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 贺罗金
 * @version 1.0
 * @date 2021-11-07 10:45
 */
public interface CustomerRecordService {
    //多条件查询
    PageInfo<CustomerRecord> selectAllCustomerRecord(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize, @RequestParam(value = "value",required = false) String value, @RequestParam(value = "input",required = false) String input);

    //新增其他收支记录
    CustomerRecord addCustomerRecord(CustomerRecord customerRecord);

    //修改其他收支记录
    CustomerRecord updCustomerRecord(CustomerRecord customerRecord);

    //删除其他收支记录
    CustomerRecord delCustomerRecord(CustomerRecord customerRecord);
}

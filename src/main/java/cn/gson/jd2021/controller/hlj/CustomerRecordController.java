package cn.gson.jd2021.controller.hlj;

import cn.gson.jd2021.model.pojos.CustomerRecord;
import cn.gson.jd2021.model.service.hlj.CustomerRecordService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 贺罗金
 * @version 1.0
 * @date 2021-11-07 11:12
 */
@RestController
public class CustomerRecordController {
    @Resource
    CustomerRecordService customerRecordService;

    @GetMapping("/selectAllCustomerRecord")
    public PageInfo<CustomerRecord> selectAllCustomerRecord(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize, @RequestParam(value = "value",required = false) String value, @RequestParam(value = "input",required = false) String input) {
        return customerRecordService.selectAllCustomerRecord(currentPage,pagesize,value,input);
    }

    @PostMapping("/addCustomerRecord")
    public CustomerRecord addCustomerRecord(@RequestBody CustomerRecord customerRecord){
        customerRecordService.addCustomerRecord(customerRecord);
        return customerRecord;
    }

    @PutMapping("/updCustomerRecord")
    public CustomerRecord updCustomerRecord(@RequestBody CustomerRecord customerRecord){
        customerRecordService.updCustomerRecord(customerRecord);
        return customerRecord;
    }

    @DeleteMapping("/delCustomerRecord")
    public CustomerRecord delCustomerRecord(@RequestBody CustomerRecord customerRecord){
        customerRecordService.delCustomerRecord(customerRecord);
        return customerRecord;
    }

    @GetMapping("/selectByKey")
    public List<CustomerRecord> selectByKey(@RequestParam("customerId") Integer customerId){
        List<CustomerRecord> entityPage =customerRecordService.selectByKey(customerId);
        return entityPage;
    }
}

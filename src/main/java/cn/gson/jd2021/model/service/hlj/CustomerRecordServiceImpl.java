package cn.gson.jd2021.model.service.hlj;

import cn.gson.jd2021.model.mapper.hlj.CustomerRecordDao;
import cn.gson.jd2021.model.pojos.CustomerRecord;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author 贺罗金
 * @version 1.0
 * @date 2021-11-07 10:46
 */
@Service
@Transactional
public class CustomerRecordServiceImpl implements CustomerRecordService {
    @Resource
    CustomerRecordDao customerRecordDao;


    //多条件分页查询
    @Override
    public PageInfo<CustomerRecord> selectAllCustomerRecord(int currentPage, int pagesize, String value, String input) {
        PageHelper.startPage(currentPage, pagesize);
        List<CustomerRecord> customerRecords = customerRecordDao.selectAllCustomer(value, input);
        PageInfo<CustomerRecord> customerRecordPageInfo = new PageInfo<>(customerRecords);
        return customerRecordPageInfo;
    }


    //新增销售记录
    @Override
    public CustomerRecord addCustomerRecord(CustomerRecord customerRecord) {
        customerRecord.setCustomerPaydate(new Date());
        customerRecordDao.insertSelective(customerRecord);
        return customerRecord;
    }

    //修改销售记录
    @Override
    public CustomerRecord updCustomerRecord(CustomerRecord customerRecord) {
        customerRecordDao.updateByPrimaryKeySelective(customerRecord);
        return customerRecord;
    }

    //删除销售记录
    @Override
    public CustomerRecord delCustomerRecord(CustomerRecord customerRecord) {
        customerRecordDao.deleteByPrimaryKey(customerRecord.getCustomerId());
        return customerRecord;
    }
}

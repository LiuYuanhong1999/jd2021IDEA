package cn.gson.jd2021.model.service.hlj;

import cn.gson.jd2021.model.mapper.hlj.FinancePaymentDao;
import cn.gson.jd2021.model.pojos.FinancePayment;
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
 * @date 2021-11-07 8:43
 */

@Service
//启用事务
@Transactional
public class FinancePaymentServiceImpl implements FinancePaymentService {
    @Resource
    FinancePaymentDao financePaymentDao;

    //多条件分页查询
    @Override
    public PageInfo<FinancePayment> selectAllFinancePayment(int currentPage, int pagesize, String value, String input) {
        PageHelper.startPage(currentPage, pagesize);
        List<FinancePayment> financePayments = financePaymentDao.selectAllFince(value, input);
        PageInfo<FinancePayment> financePaymentPageInfo = new PageInfo<>(financePayments);
        return financePaymentPageInfo;
    }

    //新增收车付款记录
    @Override
    public FinancePayment addFinancePayment(FinancePayment financePayment) {
        financePayment.setFinancePaydate(new Date());
        financePaymentDao.insertSelective(financePayment);
        return financePayment;
    }

    //修改收车付款记录
    @Override
    public FinancePayment updFinancePayment(FinancePayment financePayment) {
        financePaymentDao.updateByPrimaryKeySelective(financePayment);
        return financePayment;
    }

    //删除收车付款记录
    @Override
    public FinancePayment delFinancePayment(FinancePayment financePayment) {
        financePaymentDao.deleteByPrimaryKey(financePayment.getFinanceId());
        return financePayment;
    }
}

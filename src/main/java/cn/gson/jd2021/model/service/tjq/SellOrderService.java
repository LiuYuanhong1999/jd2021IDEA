package cn.gson.jd2021.model.service.tjq;

import cn.gson.jd2021.model.mapper.tjq.SellOrderMapper;
import cn.gson.jd2021.model.pojos.CustomerRecord;
import cn.gson.jd2021.model.pojos.SellOrder;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.print.attribute.standard.SheetCollate;
import java.util.List;

/**
 * @author 贺罗金
 * @version 1.0
 * @date 2021-11-07 16:38
 */
@Service
@Transactional
public class SellOrderService {
    @Resource
    SellOrderMapper sellOrderMapper;

    //查询欠款记录多条件分页查询
    public PageInfo<SellOrder> selectSellOrderByQk(int currentPage, int pagesize, String value, String input) {
        PageHelper.startPage(currentPage, pagesize);
        List<SellOrder> sellOrders = sellOrderMapper.slelctDebt(value, input);
        PageInfo<SellOrder> sellOrderPageInfo = new PageInfo<>(sellOrders);
        return sellOrderPageInfo;
    }
}

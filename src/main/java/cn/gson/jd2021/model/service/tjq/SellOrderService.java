package cn.gson.jd2021.model.service.tjq;

import cn.gson.jd2021.model.mapper.lyh.ClInventoryMapper;
import cn.gson.jd2021.model.mapper.tjq.SellOrderMapper;
import cn.gson.jd2021.model.pojos.ClInventory;
import cn.gson.jd2021.model.pojos.SellCoustomer;
import cn.gson.jd2021.model.pojos.SellOrder;
import cn.gson.jd2021.model.pojos.vo.SellOrderVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SellOrderService {
    @Autowired
    private ClInventoryMapper clInventoryMapper;
    @Autowired
    private SellOrderMapper sellOrderMapper;
    @Autowired
    private SellCoustomerService sellCoustomerService;

    //新增
    //新增一条订单记录
    //将客户状态改 交割中 改库存状态改为 1
    public Integer add(SellOrder sellOrder){
        SellCoustomer coustomer=new SellCoustomer();
        coustomer.setAcId(sellOrder.getCusId());
        coustomer.setCusState("交割中");
        sellCoustomerService.doUpdate(coustomer);
        clInventoryMapper.doUpdateByOp(sellOrder.getStorageId(),1);
        return doInsert(sellOrder);
    }

    //修改
    //修改订单记录
    //将客户状态改为  完成/欠款中 订单状态为2欠款中中则客户状态也为欠款中
    //                          订单状态为完成，则该客户的状态也为完成
    public Integer update(SellOrder sellOrder){
        SellCoustomer coustomer=new SellCoustomer();
        coustomer.setAcId(sellOrder.getCusId());
        if(sellOrder.getOrderState()==2){
           coustomer.setCusState("欠款中");
        }
        if(sellOrder.getOrderState()==3){
            coustomer.setCusState("完成");
        }
        sellCoustomerService.doUpdate(coustomer);
        return doUpdate(sellOrder);
    }

    //查询欠款记录多条件分页查询
    public PageInfo<SellOrder> selectSellOrderByQk(int currentPage, int pagesize, String value, String input) {
        PageHelper.startPage(currentPage, pagesize);
        List<SellOrder> sellOrders = sellOrderMapper.slelctDebt(value, input);
        PageInfo<SellOrder> sellOrderPageInfo = new PageInfo<>(sellOrders);
        return sellOrderPageInfo;
    }

    //修改欠款金额
    public int updSellOrderByQk(SellOrder sellOrder) {
        if (sellOrder.getOrderDebt().equals(0)) {
            sellOrderMapper.updateOrderDebtByPrimaryKey(sellOrder);
            sellOrderMapper.updateOrderStateByPrimaryKey(sellOrder);
            return 1;
        } else {
            return sellOrderMapper.updateOrderDebtByPrimaryKey(sellOrder);
        }

    }

    //新增
    public Integer doInsert(SellOrder sellOrder){
        return sellOrderMapper.insert(sellOrder);
    }
    //修改
    public Integer doUpdate(SellOrder sellOrder){
        return sellOrderMapper.updateByPrimaryKeySelective(sellOrder);
    }
    //查询所有 外键查询
    public List<SellOrder> selectall(SellOrderVo vo){
        return sellOrderMapper.select(vo);
    }

    //查询 未卖出的库存
    public List<ClInventory> selectByOp(Integer op){
        return clInventoryMapper.selectByOP(op);
    }
}

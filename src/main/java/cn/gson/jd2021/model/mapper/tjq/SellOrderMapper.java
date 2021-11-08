package cn.gson.jd2021.model.mapper.tjq;

import cn.gson.jd2021.model.pojos.SellOrder;
import cn.gson.jd2021.model.pojos.vo.SellOrderVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SellOrderMapper {
    //查询所有 +外键
    List<SellOrder> select(SellOrderVo vo);

    int deleteByPrimaryKey(String orderId);

    int insert(SellOrder record);

    int insertSelective(SellOrder record);

    SellOrder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(SellOrder record);

    int updateByPrimaryKey(SellOrder record);

    int updateOrderDebtByPrimaryKey(SellOrder sellOrder);

    int updateOrderStateByPrimaryKey(SellOrder sellOrder);

    //分页多条件查询欠款用户
    List<SellOrder> slelctDebt(@Param("value")String value, @Param("input") String input);
}
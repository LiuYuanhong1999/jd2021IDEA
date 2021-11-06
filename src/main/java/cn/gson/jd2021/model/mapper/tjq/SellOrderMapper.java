package cn.gson.jd2021.model.mapper.tjq;

import cn.gson.jd2021.model.pojos.SellOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SellOrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(SellOrder record);

    int insertSelective(SellOrder record);

    SellOrder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(SellOrder record);

    int updateByPrimaryKey(SellOrder record);
}
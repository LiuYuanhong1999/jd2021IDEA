package cn.gson.jd2021.model.mapper.tjq;

import cn.gson.jd2021.model.pojos.SellOrder;
import cn.gson.jd2021.model.pojos.vo.SellOrderVo;
import org.apache.ibatis.annotations.Mapper;

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
}
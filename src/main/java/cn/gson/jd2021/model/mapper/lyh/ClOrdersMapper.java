package cn.gson.jd2021.model.mapper.lyh;

import cn.gson.jd2021.model.pojos.ClOrders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClOrdersMapper {
    int deleteByPrimaryKey(String ordersId);

    //增加预约记录
    int insert(ClOrders record);

    int insertSelective(ClOrders record);

    ClOrders selectByPrimaryKey(String ordersId);

    int updateByPrimaryKeySelective(ClOrders record);

    int updateByPrimaryKey(ClOrders record);

    //查询预约记录
    List<ClOrders> findClOrders();

    //车辆评估查询已预约客户
    List<ClOrders> findClOrdersState(String ordersId);


    //根据预约编号查询具体信息
    List<ClOrders> findClOrdersState2(String recordId);
}
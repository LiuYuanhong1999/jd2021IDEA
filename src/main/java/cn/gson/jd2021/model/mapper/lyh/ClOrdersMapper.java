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

    //查询预约成功记录
    List<ClOrders> findClOrders();

    //查询所有记录
    List<ClOrders> findClOrders2(String ordersId);


    //车辆评估查询已预约客户
    List<ClOrders> findClOrdersState();


    //根据预约编号查询具体信息
    List<ClOrders> findClOrdersState2(String recordId);


    //根据编号查询信息
    List<ClOrders> findClOrdersState3(String ordersId);

}
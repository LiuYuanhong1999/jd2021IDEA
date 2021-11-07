package cn.gson.jd2021.model.service.lyh;

import cn.gson.jd2021.model.mapper.lyh.ClAssessMapper;
import cn.gson.jd2021.model.mapper.lyh.ClOrdersMapper;
import cn.gson.jd2021.model.pojos.ClAssess;
import cn.gson.jd2021.model.pojos.ClOrders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClAssessService {

    @Autowired
    ClOrdersMapper clOrdersMapper;//客户预约


    @Autowired
    ClAssessMapper clAssessMapper;//车辆评估


    //查询评估记录
    public List<ClAssess> findClAssess(){
        return clAssessMapper.findClAssess();
    }


    //增加评估记录
    public void insert(ClAssess clAssess){
        clAssessMapper.insert(clAssess);
    }



    //查询客户预约已预约的客户
    public List<ClOrders> findClOrdersState(String ordersId){
       return clOrdersMapper.findClOrdersState(ordersId);
    }


}

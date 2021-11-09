package cn.gson.jd2021.model.service.lyh;

import cn.gson.jd2021.model.mapper.lyh.ClAssessMapper;
import cn.gson.jd2021.model.mapper.lyh.ClOrdersMapper;
import cn.gson.jd2021.model.pojos.ClAssess;
import cn.gson.jd2021.model.pojos.ClOrders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class ClAssessService {

    @Autowired
    ClOrdersMapper clOrdersMapper;//客户预约


    @Autowired
    ClAssessMapper clAssessMapper;//车辆评估


    //查询评估记录
    public List<ClAssess> findClAssess(String assessId){
        return clAssessMapper.findClAssess(assessId);
    }


    //增加评估记录
    public void insert(ClAssess clAssess){
        clAssessMapper.insert(clAssess);
    }



    //查询客户预约已预约的客户
    public List<ClOrders> findClOrdersState(){
       return clOrdersMapper.findClOrdersState();
    }

    //根据编号查询信息
    public List<ClOrders> findClOrdersState3(String ordersId){return clOrdersMapper.findClOrdersState3(ordersId);}
}

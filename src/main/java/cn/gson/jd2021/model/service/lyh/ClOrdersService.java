package cn.gson.jd2021.model.service.lyh;


import cn.gson.jd2021.model.mapper.lyh.ClOrdersMapper;
import cn.gson.jd2021.model.mapper.tjq.GgArchiveMapper;
import cn.gson.jd2021.model.pojos.ClOrders;
import cn.gson.jd2021.model.pojos.GgArchive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClOrdersService {


    @Resource
    ClOrdersMapper clOrdersMapper;  //客户预约


    @Resource
    GgArchiveMapper ggArchiveMapper;//归档类型


    //客户预约成功的记录

    public List<ClOrders> findClOrders(){
        return clOrdersMapper.findClOrders();
    }

    //所有预约记录
    public List<ClOrders> findClOrders2(){return clOrdersMapper.findClOrders2();}


    //增加预约记录

    public void insert(ClOrders clOrders){

        clOrdersMapper.insert(clOrders);

    }


    //客户预约的归档类型
    public List<GgArchive> findClOrdersType(){
        return ggArchiveMapper.findClOrders();
    }


}

package cn.gson.jd2021.model.service.lyh;

import cn.gson.jd2021.model.mapper.lyh.ClInventoryMapper;
import cn.gson.jd2021.model.mapper.lyh.ClReturnVistMapper;
import cn.gson.jd2021.model.mapper.lyh.ClStorageMapper;
import cn.gson.jd2021.model.pojos.ClInventory;
import cn.gson.jd2021.model.pojos.ClReturnVist;
import cn.gson.jd2021.model.pojos.ClStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class ClStorageService {


    @Autowired
    ClReturnVistMapper clReturnVistMapper;//回访

    @Autowired
    ClStorageMapper clStorageMapper;//收车记录

    @Autowired
    ClInventoryMapper clInventoryMapper;//车辆库存





    //查询库存记录
    public List<ClStorage> selectClStorageAll(String storageId){
        return clStorageMapper.selectClStorageAll(storageId);
    }



    //增加库存记录
    public void insert(ClStorage clStorage){
        clStorageMapper.insert(clStorage);
    }

    //增加初始入库库存记录
    public void insertInitial(ClStorage clStorage){
        clStorageMapper.insertInitial(clStorage);
    }


    //增加库存数量
    public void insertClInventory(ClInventory clInventory){

        clInventoryMapper.insert(clInventory);

    }


    //增加初始库存
    public void insertInventory(ClInventory clInventory){

        clInventoryMapper.insertInventory(clInventory);
    }

    //查询签约的回访单
    public List<ClReturnVist> findByClStorage(){
        return clReturnVistMapper.findByClStorage();
    }

    //根据签约单获取数据
    public List<ClReturnVist> findByClStorage2(String vistId){
        return clReturnVistMapper.findByClStorage2(vistId);
    }


    //查询所有记录
    public List<ClStorage> selectClStorageAll2(){
        return clStorageMapper.selectClStorageAll2();
    }


}

package cn.gson.jd2021.model.service.lyh;

import cn.gson.jd2021.model.mapper.lyh.ClInventoryMapper;
import cn.gson.jd2021.model.pojos.ClInventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class ClInventoryService {

    @Autowired
    ClInventoryMapper clInventoryMapper;


    //查询库存记录
    public List<ClInventory> findAll(String storageId){
        return clInventoryMapper.findAll(storageId);
    }

}

package cn.gson.jd2021.model.mapper.lyh;

import cn.gson.jd2021.model.pojos.ClInventory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClInventoryMapper {
    int deleteByPrimaryKey(String storageId);

    //库存查询
    List<ClInventory> findAll();

    //增加库存数量
    int insert(ClInventory record);

    //初始入库库存
    void insertInventory(ClInventory clInventory);

    int insertSelective(ClInventory record);

    ClInventory selectByPrimaryKey(String storageId);

    int updateByPrimaryKeySelective(ClInventory record);

    int updateByPrimaryKey(ClInventory record);


}
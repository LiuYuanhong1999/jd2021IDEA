package cn.gson.jd2021.model.mapper.lyh;

import cn.gson.jd2021.model.pojos.ClInventory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

import java.util.List;

@Mapper
public interface ClInventoryMapper {
    //根据状态进行查询 0未卖出 1已卖出
    List<ClInventory> selectByOP(Integer storageOp);
    //根据主键 修改状态
    Integer doUpdateByOp(@Param("id") String storageId,
                         @Param("op") Integer storageOp);

    int deleteByPrimaryKey(String storageId);

    //库存查询
    List<ClInventory> findAll(String storageId);

    //增加库存数量
    int insert(ClInventory record);

    //初始入库库存
    void insertInventory(ClInventory clInventory);

    int insertSelective(ClInventory record);

    ClInventory selectByPrimaryKey(String storageId);

    int updateByPrimaryKeySelective(ClInventory record);

    int updateByPrimaryKey(ClInventory record);


}
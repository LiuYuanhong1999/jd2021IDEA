package cn.gson.jd2021.model.mapper.lyh;

import cn.gson.jd2021.model.pojos.ClInventory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClInventoryMapper {
    int deleteByPrimaryKey(String storageId);

    int insert(ClInventory record);

    int insertSelective(ClInventory record);

    ClInventory selectByPrimaryKey(String storageId);

    int updateByPrimaryKeySelective(ClInventory record);

    int updateByPrimaryKey(ClInventory record);
}
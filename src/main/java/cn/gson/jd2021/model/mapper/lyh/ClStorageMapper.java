package cn.gson.jd2021.model.mapper.lyh;

import cn.gson.jd2021.model.pojos.ClStorage;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClStorageMapper {
    int deleteByPrimaryKey(String storageId);

    int insert(ClStorage record);

    int insertSelective(ClStorage record);

    ClStorage selectByPrimaryKey(String storageId);

    int updateByPrimaryKeySelective(ClStorage record);

    int updateByPrimaryKey(ClStorage record);
}
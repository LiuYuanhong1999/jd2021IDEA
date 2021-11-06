package cn.gson.jd2021.model.mapper.tjq;

import cn.gson.jd2021.model.pojos.SellVisitorlogs;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SellVisitorlogsMapper {
    int deleteByPrimaryKey(Integer logId);

    int insert(SellVisitorlogs record);

    int insertSelective(SellVisitorlogs record);

    SellVisitorlogs selectByPrimaryKey(Integer logId);

    int updateByPrimaryKeySelective(SellVisitorlogs record);

    int updateByPrimaryKey(SellVisitorlogs record);
}
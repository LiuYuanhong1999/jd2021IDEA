package cn.gson.jd2021.model.mapper.tjq;

import cn.gson.jd2021.model.pojos.SellVisitorlogs;
import cn.gson.jd2021.model.pojos.vo.SellVisitorlogsVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SellVisitorlogsMapper {
    //根据客户主键进行查询 访问记录表
    List<SellVisitorlogs> select(SellVisitorlogsVo vo);

    int deleteByPrimaryKey(Integer logId);

    int insert(SellVisitorlogs record);

    int insertSelective(SellVisitorlogs record);

    SellVisitorlogs selectByPrimaryKey(Integer logId);

    int updateByPrimaryKeySelective(SellVisitorlogs record);

    int updateByPrimaryKey(SellVisitorlogs record);
}
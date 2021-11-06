package cn.gson.jd2021.model.mapper.tjq;

import cn.gson.jd2021.model.pojos.GgArchive;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GgArchiveMapper {
    //多条件查询 根据归档原因、归档类型 进行查询
    //归档原因表
    public List<GgArchive> selectall(GgArchive ggArchive);
    int deleteByPrimaryKey(Integer acId);

    int insert(GgArchive record);

    int insertSelective(GgArchive record);

    GgArchive selectByPrimaryKey(Integer acId);

    int updateByPrimaryKeySelective(GgArchive record);

    int updateByPrimaryKey(GgArchive record);
}
package cn.gson.jd2021.model.mapper.tjq;

import cn.gson.jd2021.model.pojos.GgArchive;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GgArchiveMapper {
    //多条件 查询所有
    List<GgArchive> selectall(GgArchive ggArchive);

    int deleteByPrimaryKey(Integer acId);

    int insert(GgArchive record);

    int insertSelective(GgArchive record);

    GgArchive selectByPrimaryKey(Integer acId);

    int updateByPrimaryKeySelective(GgArchive record);

    int updateByPrimaryKey(GgArchive record);


    //查询类型为收车归档原因的信息
    List<GgArchive> findClOrders();

}
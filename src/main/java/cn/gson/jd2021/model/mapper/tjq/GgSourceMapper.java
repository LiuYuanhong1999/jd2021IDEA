package cn.gson.jd2021.model.mapper.tjq;

import cn.gson.jd2021.model.pojos.GgSource;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GgSourceMapper {
    //删除信息来源表 根据主键进行删除
    Integer doDelete(Integer id);
    //查询所有 信息来源表
    List<GgSource> selectall(GgSource ggSource);
    int deleteByPrimaryKey(Integer sourceId);

    int insert(GgSource record);

    int insertSelective(GgSource record);

    GgSource selectByPrimaryKey(Integer sourceId);

    int updateByPrimaryKeySelective(GgSource record);

    int updateByPrimaryKey(GgSource record);
}
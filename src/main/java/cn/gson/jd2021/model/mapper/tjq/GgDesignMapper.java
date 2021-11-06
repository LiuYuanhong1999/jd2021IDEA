package cn.gson.jd2021.model.mapper.tjq;

import cn.gson.jd2021.model.pojos.GgDesign;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GgDesignMapper {
    int deleteByPrimaryKey(Integer designId);

    int insert(GgDesign record);

    int insertSelective(GgDesign record);

    GgDesign selectByPrimaryKey(Integer designId);

    int updateByPrimaryKeySelective(GgDesign record);

    int updateByPrimaryKey(GgDesign record);
}
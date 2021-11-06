package cn.gson.jd2021.model.mapper.tjq;

import cn.gson.jd2021.model.pojos.GgBrand;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GgBrandMapper {
    int deleteByPrimaryKey(Integer brandId);

    int insert(GgBrand record);

    int insertSelective(GgBrand record);

    GgBrand selectByPrimaryKey(Integer brandId);

    int updateByPrimaryKeySelective(GgBrand record);

    int updateByPrimaryKey(GgBrand record);
}
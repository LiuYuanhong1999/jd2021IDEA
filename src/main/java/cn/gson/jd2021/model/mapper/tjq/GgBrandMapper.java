package cn.gson.jd2021.model.mapper.tjq;

import cn.gson.jd2021.model.pojos.GgBrand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GgBrandMapper {
    //根据主键删除 汽车品牌表的一条数据
    Integer doDelete(Integer id);

    //查询所有品牌 汽车品牌表
    List<GgBrand> select(GgBrand ggBrand);

    int deleteByPrimaryKey(Integer brandId);

    int insert(GgBrand record);

    int insertSelective(GgBrand record);

    GgBrand selectByPrimaryKey(Integer brandId);

    int updateByPrimaryKeySelective(GgBrand record);

    int updateByPrimaryKey(GgBrand record);
}
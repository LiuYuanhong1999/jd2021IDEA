package cn.gson.jd2021.model.mapper.tjq;

import cn.gson.jd2021.model.pojos.GgDesign;
import cn.gson.jd2021.model.pojos.vo.GgDesignVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GgDesignMapper {
    //根据汽车品牌表主键 查询 汽车款式
    List<GgDesign> selectBybrandId(Integer brandId);

    //查询所有 汽车款式表、汽车品牌表、汽车厂商表
    //根据 款式名字、汽车品牌名称、汽车厂商名称 等进行查询
    List<GgDesign> selectall(GgDesignVo vo);
    int deleteByPrimaryKey(Integer designId);

    int insert(GgDesign record);

    int insertSelective(GgDesign record);

    GgDesign selectByPrimaryKey(Integer designId);

    int updateByPrimaryKeySelective(GgDesign record);

    int updateByPrimaryKey(GgDesign record);
}
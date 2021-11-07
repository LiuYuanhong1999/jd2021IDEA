package cn.gson.jd2021.model.mapper.tjq;

import cn.gson.jd2021.model.pojos.SellCoustomer;
import cn.gson.jd2021.model.pojos.vo.SellCoustomerVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SellCoustomerMapper {
    //查询所有 多条件查询
    List<SellCoustomer> selectall(SellCoustomerVo vo);

    int deleteByPrimaryKey(Integer acId);

    int insert(SellCoustomer record);

    int insertSelective(SellCoustomer record);

    SellCoustomer selectByPrimaryKey(Integer acId);

    int updateByPrimaryKeySelective(SellCoustomer record);

    int updateByPrimaryKey(SellCoustomer record);
}
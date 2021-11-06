package cn.gson.jd2021.model.mapper.tjq;

import cn.gson.jd2021.model.pojos.SellCoustomer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SellCoustomerMapper {
    int deleteByPrimaryKey(Integer acId);

    int insert(SellCoustomer record);

    int insertSelective(SellCoustomer record);

    SellCoustomer selectByPrimaryKey(Integer acId);

    int updateByPrimaryKeySelective(SellCoustomer record);

    int updateByPrimaryKey(SellCoustomer record);
}
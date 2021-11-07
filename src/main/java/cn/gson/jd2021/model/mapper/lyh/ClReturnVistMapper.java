package cn.gson.jd2021.model.mapper.lyh;

import cn.gson.jd2021.model.pojos.ClReturnVist;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClReturnVistMapper {
    int deleteByPrimaryKey(String vistId);

    //增加回访记录
    int insert(ClReturnVist record);

    //查询回访记录

    List<ClReturnVist> findClReturnVist();


    //查询签约成功的回访单
    List<ClReturnVist> findByClStorage();


    //根据签约的回访单查询数据
    List<ClReturnVist> findByClStorage2(String vistId);

    int insertSelective(ClReturnVist record);

    ClReturnVist selectByPrimaryKey(String vistId);

    int updateByPrimaryKeySelective(ClReturnVist record);

    int updateByPrimaryKey(ClReturnVist record);
}
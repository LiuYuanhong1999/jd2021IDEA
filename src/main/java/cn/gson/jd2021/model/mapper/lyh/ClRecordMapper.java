package cn.gson.jd2021.model.mapper.lyh;

import cn.gson.jd2021.model.pojos.ClRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ClRecordMapper {
    int deleteByPrimaryKey(String recordId);

    int insert(ClRecord record);

    int insertSelective(ClRecord record);

    ClRecord selectByPrimaryKey(String recordId);

    int updateByPrimaryKeySelective(ClRecord record);

    int updateByPrimaryKey(ClRecord record);


    //查询所有信息
    List<ClRecord> findByClRecord(ClRecord clRecord);

    //根据编号查询登记信息
    List<ClRecord> findClRecordId(String recordId);

}
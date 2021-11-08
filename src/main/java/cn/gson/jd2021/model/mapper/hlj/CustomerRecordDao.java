package cn.gson.jd2021.model.mapper.hlj;

import cn.gson.jd2021.model.pojos.CustomerRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CustomerRecordDao {
    int deleteByPrimaryKey(Integer customerId);

    int insert(CustomerRecord record);

    int insertSelective(CustomerRecord record);

    List<CustomerRecord> selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(CustomerRecord record);

    int updateByPrimaryKey(CustomerRecord record);

    List<CustomerRecord> selectAllCustomer(@Param("value")String value, @Param("input") String input);
}
package cn.gson.jd2021.model.mapper.hlj;

import cn.gson.jd2021.model.pojos.FinancePayment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FinancePaymentDao {
    int deleteByPrimaryKey(Integer financeId);

    int insert(FinancePayment record);

    int insertSelective(FinancePayment record);

    FinancePayment selectByPrimaryKey(Integer financeId);

    int updateByPrimaryKeySelective(FinancePayment record);

    int updateByPrimaryKey(FinancePayment record);

    List<FinancePayment> selectAllFince(@Param("value")String value, @Param("input") String input);
}
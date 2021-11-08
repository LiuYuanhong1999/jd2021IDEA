package cn.gson.jd2021.model.mapper.jl;

import cn.gson.jd2021.model.pojos.BgExpenseAccount;
import cn.gson.jd2021.model.pojos.SellOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BgExpenseAccountMapper {
    int deleteByPrimaryKey(Integer bgetId);

    void insert(BgExpenseAccount bgExpenseAccount);

    /**
     * 新增报销单
     * @param bgExpenseAccount
     */
    void insertSelective(BgExpenseAccount bgExpenseAccount);

//    BgExpenseAccount selectByPrimaryKey(Integer bgetId);

    int updateByPrimaryKeySelective(BgExpenseAccount record);

    int updateByPrimaryKey(BgExpenseAccount record);

    /**
     * 查询报销单
     * @param bgExpenseAccount
     */
    List<BgExpenseAccount> selectBgExpen(BgExpenseAccount bgExpenseAccount);

     int updateBgExpenByPrimaryKey(BgExpenseAccount bgExpenseAccount);
    List<BgExpenseAccount> selectBgExpenByPrimaryKey();

}
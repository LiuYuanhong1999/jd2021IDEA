package cn.gson.jd2021.model.service.jl;

import cn.gson.jd2021.model.mapper.jl.BgApprovalProcessMapper;
import cn.gson.jd2021.model.mapper.jl.BgCourseMapper;
import cn.gson.jd2021.model.mapper.jl.BgExpenseAccountMapper;
import cn.gson.jd2021.model.pojos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BgExpenseAccountService {
    @Autowired
    BgExpenseAccountMapper bgexpeMap;

    @Autowired
    BgApprovalProcessMapper bgapproMap;

    @Autowired
    BgCourseMapper bgcourMap;



    public void insertSelective(BgExpenseAccount bgExpenseAccount){
        bgexpeMap.insertSelective(bgExpenseAccount);
    }

    /**
     * 查询报销单
     * @param bgExpenseAccount
     * @return
     */
    public List<BgExpenseAccount> selectBgExpen(BgExpenseAccount bgExpenseAccount){
        return bgexpeMap.selectBgExpen(bgExpenseAccount);
    }
    /**
     * 新增报销单
     * @param bgExpenseAccount
     */
    public void insert(BgExpenseAccount bgExpenseAccount){
        bgexpeMap.insert(bgExpenseAccount);
    }
}

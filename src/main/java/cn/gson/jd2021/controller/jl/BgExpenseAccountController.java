package cn.gson.jd2021.controller.jl;

import cn.gson.jd2021.model.pojos.BgExpenseAccount;
import cn.gson.jd2021.model.service.jl.BgExpenseAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BgExpenseAccountController {
    @Autowired
    BgExpenseAccountService bgexpeser;


    public void insertSelective(BgExpenseAccount bgExpenseAccount){
        bgexpeser.insertSelective(bgExpenseAccount);
    }

    /**
     * 查询报销单
     * @param bgExpenseAccount
     * @return
     */
    @RequestMapping("select-bgexpen")

    public List<BgExpenseAccount> selectBgExpen(BgExpenseAccount bgExpenseAccount){
        return bgexpeser.selectBgExpen(bgExpenseAccount);
    }
    /**
     * 新增报销单
     * @param bgExpenseAccount
     */
    @RequestMapping("add-bgexpe")
    public void in(@RequestBody BgExpenseAccount bgExpenseAccount){
        bgexpeser.insert(bgExpenseAccount);
    }
}

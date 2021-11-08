package cn.gson.jd2021.controller.jl;

import cn.gson.jd2021.model.pojos.BgExpenseAccount;
import cn.gson.jd2021.model.pojos.CustomerRecord;
import cn.gson.jd2021.model.pojos.SellOrder;
import cn.gson.jd2021.model.service.jl.BgExpenseAccountService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //修改状态
    @PutMapping("/updByQka")
    public int updByQka(@RequestBody BgExpenseAccount bgExpenseAccount) {
        return bgexpeser.updByQka(bgExpenseAccount);
    }

    @GetMapping("/selectBgExpenByPrimaryKey")
    public PageInfo<BgExpenseAccount> selectBgExpenByPrimary(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize) {
        return bgexpeser.selectBgExpenByPrimaryKey(currentPage,pagesize);
    }
}

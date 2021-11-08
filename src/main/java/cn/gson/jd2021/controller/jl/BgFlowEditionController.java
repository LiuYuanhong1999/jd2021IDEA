package cn.gson.jd2021.controller.jl;

import cn.gson.jd2021.model.pojos.BgFlowEdition;
import cn.gson.jd2021.model.pojos.UserList;
import cn.gson.jd2021.model.service.jl.BgFlowEditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BgFlowEditionController {
    @Autowired
    BgFlowEditionService bgFledSer;

    /**
     * 查询子节点
     * @param bgfnBgflowid
     * @return
     */
    @RequestMapping("all-bgFlowEdition")
    public List<BgFlowEdition> selectBybgflow(Integer bgfnBgflowid){
        return bgFledSer.selectBybgflow(bgfnBgflowid);
    }

    /**
     * 新增子节点
     * @param bgFlowEdition
     */
    @RequestMapping("add-bgfled")
    public void insert(@RequestBody BgFlowEdition bgFlowEdition){
        bgFledSer.insert(bgFlowEdition);
    }

    /**
     * 查询员工
     * @return
     */
    @RequestMapping("all-user")
    public List<UserList> selectuser(){
        return bgFledSer.selectuser();
    }

    /**
     * 根据id删除
     * @param bgfnId
     * @return
     */
    @RequestMapping("dele-bgfnid")
    public int deleteByPrimaryKey(Integer bgfnId){
        return bgFledSer.deleteByPrimaryKey(bgfnId);
    }
}

package cn.gson.jd2021.model.service.jl;

import cn.gson.jd2021.model.mapper.jl.BgFlowEditionMapper;
import cn.gson.jd2021.model.pojos.BgFlowEdition;
import cn.gson.jd2021.model.pojos.UserList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class BgFlowEditionService {
    @Autowired
    BgFlowEditionMapper bgFledMap;

    /**
     * 查询流程子节点
     * @param bgfnBgflowid
     * @return
     */
    public List<BgFlowEdition> selectBybgflow(Integer bgfnBgflowid){
        return bgFledMap.selectBybgflow(bgfnBgflowid);
    }

    /**
     * 新增子节点
     * @param bgFlowEdition
     * @return
     */
    public String insert(BgFlowEdition bgFlowEdition){
        try {
            if(bgFlowEdition.getBgfnId()==null){
                bgFledMap.insert(bgFlowEdition);
            }else {
                 bgFledMap.updateByPrimaryKeySelective(bgFlowEdition);
            }
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    /**
     * 查询员工
     * @return
     */
    public List<UserList> selectuser(){
        return bgFledMap.selectuser();
    }

    /**
     * 根据id删除
     * @param bgfnId
     * @return
     */
    public int deleteByPrimaryKey(Integer bgfnId){
        return bgFledMap.deleteByPrimaryKey(bgfnId);
    }
}

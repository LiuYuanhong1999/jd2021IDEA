package cn.gson.jd2021.model.service.jl;

import cn.gson.jd2021.model.mapper.jl.BgFlowMapper;
import cn.gson.jd2021.model.pojos.BgFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BgFlowService {
    @Autowired
    BgFlowMapper bgFlMap;

    /**
     * 查询所有流程
     * @return
     */
    public List<BgFlow> selectbgflow (){
        return bgFlMap.selectbgflow();
    }

    /**
     * 新增流程
     * @param bgFlow
     * @return
     */
    public void insert (BgFlow bgFlow){
         bgFlMap.insert(bgFlow);
    }
}

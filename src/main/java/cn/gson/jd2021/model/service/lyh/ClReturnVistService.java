package cn.gson.jd2021.model.service.lyh;

import cn.gson.jd2021.model.mapper.lyh.ClAssessMapper;
import cn.gson.jd2021.model.mapper.lyh.ClReturnVistMapper;
import cn.gson.jd2021.model.pojos.ClAssess;
import cn.gson.jd2021.model.pojos.ClReturnVist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class ClReturnVistService {

    @Autowired
    ClAssessMapper clAssessMapper;//车辆评估

    @Autowired
    ClReturnVistMapper clReturnVistMapper;//客户回访


    //查询回访记录
    public List<ClReturnVist> findClReturnVist(){
        return clReturnVistMapper.findClReturnVist();
    }

    //增加回访记录
    public void insert(ClReturnVist clReturnVist){
        clReturnVistMapper.insert(clReturnVist);

    }

    //所有记录
    public List<ClReturnVist> findClReturnVist2(String vistId){
        return clReturnVistMapper.findClReturnVist2(vistId);
    }


    //根据评估编号查找对于信息
    public List<ClAssess> findClReturnVist(String assessId){
        return clAssessMapper.findClReturnVist(assessId);
    }


}

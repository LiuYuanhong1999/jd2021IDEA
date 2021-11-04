package cn.gson.jd2021.model.service.lyh;

import cn.gson.jd2021.model.mapper.lyh.SsMapper;
import cn.gson.jd2021.model.pojos.S;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SsService {
    @Resource
    SsMapper s;

    public Integer doInsert(S ss){
        return s.doInsert(ss);
    }

    public List<S> findAll(){
        return s.findAll();
    }

}

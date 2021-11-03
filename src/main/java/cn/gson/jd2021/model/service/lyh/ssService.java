package cn.gson.jd2021.model.service.lyh;

import cn.gson.jd2021.model.mapper.lyh.ssMapper;
import cn.gson.jd2021.model.pojos.S;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ssService {
    @Resource
    ssMapper s;


    public List<S> findAll(){
        return s.findAll();
    }

}

package cn.gson.jd2021.model.service.lyh;

import cn.gson.jd2021.model.mapper.lyh.ClRecordMapper;
import cn.gson.jd2021.model.pojos.ClRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClRecordService {
    @Autowired
    ClRecordMapper clRecordMapper;



    //查询登记记录
    public List<ClRecord> findByClRecord(){
        return clRecordMapper.findByClRecord();
    }
}

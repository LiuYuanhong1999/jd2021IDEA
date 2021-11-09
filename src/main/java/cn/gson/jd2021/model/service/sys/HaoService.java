package cn.gson.jd2021.model.service.sys;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@Transactional(rollbackFor = Exception.class)
public class HaoService {
    public String hao(String num){
        SimpleDateFormat myFmt = new SimpleDateFormat("HHmmssSSS");
        Date date = new Date();
        String a=myFmt.format(date);
        String b=num+a;
        return b;

    }
}

package cn.gson.jd2021.model.service.sys;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class HaoService {
    public String hao(String num){
        SimpleDateFormat myFmt = new SimpleDateFormat("HHmmssSSS");
        Date date = new Date();
        String a=myFmt.format(date);
        String b=num+a;
        return b;

    }
}

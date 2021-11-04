package cn.gson.jd2021.controller.lyh;

import cn.gson.jd2021.model.pojos.S;
import cn.gson.jd2021.model.service.lyh.SsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ssController {
    @Resource
    SsService s;

    public void dd(){}

    public void ee(){}

    public void rr(){}

    @RequestMapping("find-all")
    public List<S>  findAll(){
        return s.findAll();
    }


}

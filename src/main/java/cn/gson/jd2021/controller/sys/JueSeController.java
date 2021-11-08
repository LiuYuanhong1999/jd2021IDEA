package cn.gson.jd2021.controller.sys;

import cn.gson.jd2021.model.pojos.UserJuese;
import cn.gson.jd2021.model.service.sys.JueSeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("sys")
public class JueSeController {
    @Resource
    JueSeService jueSeService;

    @RequestMapping("/del-juese")
    public void delJueSe(Integer jsId){
        jueSeService.delJueSe(jsId);
    }

    @PostMapping("/add-juese")
    public Integer addJueSe(@RequestBody UserJuese userJuese){
        jueSeService.addJueSe(userJuese);
        return 1;
    }
}

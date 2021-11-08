package cn.gson.jd2021.controller.sys;

import cn.gson.jd2021.model.pojos.LoginRizhi;
import cn.gson.jd2021.model.service.sys.LoginRizhiService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("sys")
public class LoginRizhiController {
    @Resource
    LoginRizhiService loginRizhiService;

    @RequestMapping("/find-loginrizhi")
    public List<LoginRizhi> findLoginRizhi(String userName,String loginIp){
        return loginRizhiService.findLoginRizhi(userName,loginIp);
    }

    @PostMapping("/del-loginrizhi")
    public void delLoginRizhi(@RequestBody LoginRizhi loginRizhi){
        loginRizhiService.delLoginRizhi(loginRizhi);
    }
}

package cn.gson.jd2021.model.service.sys;

import cn.gson.jd2021.model.mapper.sys.LoginRizhiMapper;
import cn.gson.jd2021.model.pojos.LoginRizhi;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginRizhiService {
    @Resource
    LoginRizhiMapper loginRizhiMapper;

    public List<LoginRizhi> findLoginRizhi(String userName, String loginIp){
        return loginRizhiMapper.findLoginRizhi(userName,loginIp);
    }

    public void delLoginRizhi(LoginRizhi loginRizhi) {
        loginRizhi.setUserList(null);
        loginRizhiMapper.deleteById(loginRizhi.getRizhiId());
    }
}

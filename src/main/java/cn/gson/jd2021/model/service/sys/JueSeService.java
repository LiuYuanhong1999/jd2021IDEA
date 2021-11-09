package cn.gson.jd2021.model.service.sys;

import cn.gson.jd2021.model.mapper.sys.UserJueseMapper;
import cn.gson.jd2021.model.pojos.UserJuese;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional(rollbackFor = Exception.class)
public class JueSeService {
    @Resource
    UserJueseMapper userJueseMapper;

    public void delJueSe(Integer jsId) {
        userJueseMapper.deleteById(jsId);
    }

    public Integer addJueSe(UserJuese userJuese) {
        if (userJuese.getJsId()==0){
            userJueseMapper.insert(userJuese);
            return 1;
        }else {
            userJueseMapper.updateById(userJuese);
            return 2;
        }
    }
}

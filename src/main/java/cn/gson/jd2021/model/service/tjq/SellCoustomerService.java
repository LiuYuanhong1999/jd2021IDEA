package cn.gson.jd2021.model.service.tjq;

import cn.gson.jd2021.model.mapper.tjq.SellCoustomerMapper;
import cn.gson.jd2021.model.pojos.SellCoustomer;
import cn.gson.jd2021.model.pojos.vo.SellCoustomerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SellCoustomerService {
    @Autowired
    private SellCoustomerMapper sellCoustomerMapper;
    //新增 客户表
    public Integer doInsert(SellCoustomer sellCoustomer){
        return sellCoustomerMapper.insert(sellCoustomer);
    }
    //修改
    public Integer doUpdate(SellCoustomer sellCoustomer){
        return sellCoustomerMapper.updateByPrimaryKeySelective(sellCoustomer);
    }
    //查询
    public List<SellCoustomer> selectall(SellCoustomerVo vo){
        return sellCoustomerMapper.selectall(vo);
    }
}

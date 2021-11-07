package cn.gson.jd2021.model.service.tjq;

import cn.gson.jd2021.model.mapper.tjq.SellVisitorlogsMapper;
import cn.gson.jd2021.model.pojos.SellCoustomer;
import cn.gson.jd2021.model.pojos.SellVisitorlogs;
import cn.gson.jd2021.model.pojos.vo.SellVisitorlogsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SellVisitorlogsService {
    @Autowired
    private SellVisitorlogsMapper sellVisitorlogsMapper;
    @Autowired SellCoustomerService sellCoustomerService;
    //新增 记录
    //当状态为0 成交失败 ，直接新增
    //当状态为1 成功下单 将客户的状态改为 下单中
    public Integer add(SellVisitorlogs sellVisitorlogs){
        if(sellVisitorlogs.getLogState()==1){
            SellCoustomer coustomer=new SellCoustomer();
            coustomer.setAcId(sellVisitorlogs.getCusId());
            coustomer.setCusState("下单中");
            sellCoustomerService.doUpdate(coustomer);
        }
        return doInsert(sellVisitorlogs);
    }
    //新增
    public Integer doInsert(SellVisitorlogs sellVisitorlogs){
        return sellVisitorlogsMapper.insert(sellVisitorlogs);
    }
    //修改
    public Integer doUpdate(SellVisitorlogs sellVisitorlogs){
        return sellVisitorlogsMapper.updateByPrimaryKeySelective(sellVisitorlogs);
    }
    //多条件查询 查询所有
    public List<SellVisitorlogs> selectall(SellVisitorlogsVo vo){
        return sellVisitorlogsMapper.select(vo);
    }
}

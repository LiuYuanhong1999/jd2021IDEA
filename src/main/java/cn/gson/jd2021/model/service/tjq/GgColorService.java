package cn.gson.jd2021.model.service.tjq;

import cn.gson.jd2021.model.mapper.tjq.GgColorMapper;
import cn.gson.jd2021.model.pojos.GgColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class GgColorService {
    @Autowired
    private GgColorMapper ggColorMapper;
    //新增
    public Integer doInsert(GgColor ggColor){
        return ggColorMapper.insert(ggColor);
    }
    //修改
    public Integer doUpdate(GgColor ggColor){
        return ggColorMapper.updateByPrimaryKeySelective(ggColor);
    }
    //查询所有 多条件查询
    public List<GgColor> selectall(GgColor ggColor){
        return ggColorMapper.select(ggColor);
    }
}

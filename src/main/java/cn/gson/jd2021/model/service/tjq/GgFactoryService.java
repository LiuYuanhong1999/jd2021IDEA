package cn.gson.jd2021.model.service.tjq;

import cn.gson.jd2021.model.mapper.tjq.GgFactoryMapper;
import cn.gson.jd2021.model.pojos.GgFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GgFactoryService {
    @Autowired
    GgFactoryMapper ggFactoryMapper;
    //新增 汽车厂商表
    public Integer doInsert(GgFactory ggFactory){
        return ggFactoryMapper.insert(ggFactory);
    }
    //修改 汽车厂商表
    public Integer doUpdate(GgFactory ggFactory){
        return ggFactoryMapper.updateByPrimaryKeySelective(ggFactory);
    }
    //查询 汽车厂商表
    public List<GgFactory> select(GgFactory ggFactory){
        return ggFactoryMapper.selectall(ggFactory);
    }
    //删除
    public Integer doDelete(Integer id){
        return ggFactoryMapper.doDelete(id);
    }
}

package cn.gson.jd2021.model.service.tjq;

import cn.gson.jd2021.model.mapper.tjq.GgCoustomertypeMapper;
import cn.gson.jd2021.model.pojos.GgCoustomertype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class GgCoustomerTypeService {
    @Autowired
    private GgCoustomertypeMapper ggCoustomertypeMapper;
    //新增 客户类别表
    public Integer doInsert(GgCoustomertype ggCoustomertype){
        return ggCoustomertypeMapper.insert(ggCoustomertype);
    }
    //根据主键修改 类别表
    public Integer doUpdate(GgCoustomertype ggCoustomertype){
        return ggCoustomertypeMapper.updateByPrimaryKeySelective(ggCoustomertype);
    }
    //多条件查询 查询所有 客户类别表
    public List<GgCoustomertype> selectall(GgCoustomertype ggCoustomertype){
        return ggCoustomertypeMapper.selectall(ggCoustomertype);
    }
    //根据主键进行查询 客户类别表
    public GgCoustomertype selectByid(Integer id){
        return ggCoustomertypeMapper.selectByPrimaryKey(id);
    }
}

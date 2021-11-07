package cn.gson.jd2021.model.service.tjq;

import cn.gson.jd2021.model.mapper.tjq.GgSourceMapper;
import cn.gson.jd2021.model.pojos.GgSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//信息来源
@Service
@Transactional(rollbackFor = Exception.class)
public class GgSourceService {
    @Autowired
    private GgSourceMapper ggSourceMapper;
    //新增 信息来源表
    public Integer doInsert(GgSource ggSource){
        return ggSourceMapper.insert(ggSource);
    }
    //修改 信息来源表
    public Integer doUpdate(GgSource ggSource){
        return ggSourceMapper.updateByPrimaryKeySelective(ggSource);
    }
    //查询所有 信息来源表 多条件查询
    public List<GgSource> selectall(GgSource ggSource){
        return ggSourceMapper.selectall(ggSource);
    }
    //根据主键删除一条信息源表数据
    public Integer doDelete(Integer id){
        return ggSourceMapper.doDelete(id);
    }
}

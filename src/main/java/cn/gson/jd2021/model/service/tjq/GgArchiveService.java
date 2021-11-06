package cn.gson.jd2021.model.service.tjq;

import cn.gson.jd2021.model.mapper.tjq.GgArchiveMapper;
import cn.gson.jd2021.model.pojos.GgArchive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GgArchiveService {
    @Autowired
    private GgArchiveMapper ggArchiveMapper;
    //新增 归档
    public Integer doInsert(GgArchive ggArchive){
        return ggArchiveMapper.insert(ggArchive);
    }
    //修改归档
    public Integer doUpdate(GgArchive ggArchive){
        return ggArchiveMapper.updateByPrimaryKeySelective(ggArchive);
    }
    //查询
    public List<GgArchive> selectall(GgArchive ggArchive){
        return ggArchiveMapper.selectall(ggArchive);
    }



}

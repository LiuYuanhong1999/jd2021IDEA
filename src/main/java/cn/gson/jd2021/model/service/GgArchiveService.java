package cn.gson.jd2021.model.service;

import cn.gson.jd2021.model.mapper.tjq.GgArchiveMapper;
import cn.gson.jd2021.model.pojos.GgArchive;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * 归档
 */
@Service
public class GgArchiveService {
    @Autowired private GgArchiveMapper ggArchiveMapper;
    //新增 归档原因表
    public Integer doInsert(GgArchive ggArchive){
        return ggArchiveMapper.insert(ggArchive);
    }
    //查询所有 归档原因表
    public List<GgArchive> selectall(GgArchive ggArchive){
        return ggArchiveMapper.selectall(ggArchive);
    }
}

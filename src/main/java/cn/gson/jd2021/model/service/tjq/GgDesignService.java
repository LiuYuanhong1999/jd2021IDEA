package cn.gson.jd2021.model.service.tjq;

import cn.gson.jd2021.model.mapper.tjq.GgDesignMapper;
import cn.gson.jd2021.model.mapper.tjq.GgFactoryMapper;
import cn.gson.jd2021.model.pojos.GgDesign;
import cn.gson.jd2021.model.pojos.vo.GgDesignVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class GgDesignService {
    @Autowired
    private GgDesignMapper ggDesignMapper;
    //新增
    public Integer doInset(GgDesign ggDesign){
        return ggDesignMapper.insert(ggDesign);
    }
    //修改
    public Integer doUpdate(GgDesign ggDesign){
        return ggDesignMapper.updateByPrimaryKeySelective(ggDesign);
    }
    //查询所有 汽车设计表、汽车品牌表、汽车厂商表
    public List<GgDesign> selectall(GgDesignVo vo){
        return ggDesignMapper.selectall(vo);
    }

}

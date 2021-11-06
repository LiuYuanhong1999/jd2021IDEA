package cn.gson.jd2021.model.service.lyh;

import cn.gson.jd2021.model.mapper.lyh.ClRecordMapper;
import cn.gson.jd2021.model.mapper.tjq.GgBrandMapper;
import cn.gson.jd2021.model.mapper.tjq.GgColorMapper;
import cn.gson.jd2021.model.mapper.tjq.GgDesignMapper;
import cn.gson.jd2021.model.pojos.ClRecord;
import cn.gson.jd2021.model.pojos.GgBrand;
import cn.gson.jd2021.model.pojos.GgColor;
import cn.gson.jd2021.model.pojos.GgDesign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClRecordService {
    @Autowired
    ClRecordMapper clRecordMapper;

    @Autowired
    GgBrandMapper ggBrandMapper;//品牌

    @Autowired
    GgColorMapper ggColorMapper;//颜色

    @Autowired
    GgDesignMapper ggDesignMapper;//款式

    //查询登记记录
    public List<ClRecord> findByClRecord(){
        return clRecordMapper.findByClRecord();
    }

    //品牌显示
    public List<GgBrand> findByBrand(){
        return ggBrandMapper.findBrand();
    }


    //款式选择
    public List<GgDesign> find(Integer brandId){
        return ggDesignMapper.findDesign(brandId);
    }

    //颜色选择
    public List<GgColor> findByColor(){
        return ggColorMapper.findColor();
    }



}

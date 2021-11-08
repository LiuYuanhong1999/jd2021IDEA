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
    ClRecordMapper clRecordMapper;//收车登记

    @Autowired
    GgBrandMapper ggBrandMapper;//品牌

    @Autowired
    GgColorMapper ggColorMapper;//颜色

    @Autowired
    GgDesignMapper ggDesignMapper;//款式

    //查询登记记录
    public List<ClRecord> findByClRecord(ClRecord clRecord){
        return clRecordMapper.findByClRecord(clRecord);
    }

    //增加登记
    public void insertRecord(ClRecord clRecord){

        if (clRecord.getRecordId()==null || clRecord.getRecordId()==""){

            //增加登记记录
            clRecordMapper.insert(clRecord);

        }else {


            //修改登记记录
            clRecordMapper.updateByPrimaryKeySelective(clRecord);
        }
    }

    //根据编号查询所有信息
    public List<ClRecord> findClRecordId(String recordId){
        return clRecordMapper.findClRecordId(recordId);
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

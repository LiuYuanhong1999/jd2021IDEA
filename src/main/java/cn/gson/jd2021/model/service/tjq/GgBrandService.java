package cn.gson.jd2021.model.service.tjq;

import cn.gson.jd2021.model.mapper.tjq.GgBrandMapper;
import cn.gson.jd2021.model.pojos.GgBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class GgBrandService {
    @Autowired
    private GgBrandMapper ggBrandMapper;
    //新增 车辆品牌表
    public Integer doInsert(GgBrand ggBrand){
        return ggBrandMapper.insert(ggBrand);
    }
    //修改 车辆品牌表
    public Integer doUpdate(GgBrand ggBrand){
        return ggBrandMapper.updateByPrimaryKeySelective(ggBrand);
    }
    //查询所有 车辆品牌表
    public List<GgBrand> selectall(GgBrand ggBrand){
        return ggBrandMapper.select(ggBrand);
    }
    //根据主键 删除车辆品牌表
    public Integer doDelete(Integer id){
        return ggBrandMapper.doDelete(id);
    }
}

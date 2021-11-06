package cn.gson.jd2021.controller.tjq;

import cn.gson.jd2021.model.pojos.GgBrand;
import cn.gson.jd2021.model.service.tjq.GgBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class GgBrandController {
    @Autowired private GgBrandService ggBrandService;
    //新增 车辆品牌表
    @PostMapping
    public Integer put(@RequestBody GgBrand ggBrand){
        return ggBrandService.doInsert(ggBrand);
    }
    //修改 车辆品牌表
    @PostMapping("update")
    public Integer update(@RequestBody GgBrand ggBrand){
        return ggBrandService.doUpdate(ggBrand);
    }
    //查询所有 车辆品牌表
    @PostMapping("show")
    public List<GgBrand> show(@RequestBody GgBrand ggBrand){
        return ggBrandService.selectall(ggBrand);
    }
}

package cn.gson.jd2021.controller.tjq;

import cn.gson.jd2021.model.pojos.GgBrand;
import cn.gson.jd2021.model.service.tjq.GgBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    //查询所有车辆品牌
    @GetMapping
    public List<GgBrand> get(){
        return ggBrandService.selectall(null);
    }
}

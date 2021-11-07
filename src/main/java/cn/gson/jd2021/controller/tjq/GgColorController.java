package cn.gson.jd2021.controller.tjq;

import cn.gson.jd2021.model.pojos.GgColor;
import cn.gson.jd2021.model.service.tjq.GgColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/color")
public class GgColorController {
    @Autowired
    private GgColorService ggColorService;
    //新增
    @PostMapping
    public Integer put(@RequestBody GgColor ggColor){
        return ggColorService.doInsert(ggColor);
    }
    //修改
    @PostMapping("update")
    public Integer update(@RequestBody GgColor ggColor){
        return ggColorService.doUpdate(ggColor);
    }
    //查询所有 多条件查询
    @PostMapping("show")
    public List<GgColor> show(@RequestBody GgColor ggColor){
        return ggColorService.selectall(ggColor);
    }
    //查询所有 单表查询
    @GetMapping
    public List<GgColor> all(){
        return ggColorService.selectall(null);
    }
}

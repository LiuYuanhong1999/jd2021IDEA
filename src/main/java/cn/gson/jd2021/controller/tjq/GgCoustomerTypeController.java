package cn.gson.jd2021.controller.tjq;

import cn.gson.jd2021.model.pojos.GgCoustomertype;
import cn.gson.jd2021.model.service.tjq.GgCoustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coustomertype")
public class GgCoustomerTypeController {
    @Autowired
    private GgCoustomerTypeService ggCoustomerTypeService;
    //新增 客户类别表
    @PostMapping
    public Integer put(@RequestBody GgCoustomertype ggCoustomertype){
        return ggCoustomerTypeService.doInsert(ggCoustomertype);
    }
    //修改 客户类别表
    @PostMapping("update")
    public Integer update(@RequestBody GgCoustomertype ggCoustomertype){
        return ggCoustomerTypeService.doUpdate(ggCoustomertype);
    }
    //查询所有 多条件查询 客户类别表
    @PostMapping("show")
    public List<GgCoustomertype> show(@RequestBody GgCoustomertype ggCoustomertype){
        return ggCoustomerTypeService.selectall(ggCoustomertype);
    }
    //没有多条件 查询所有 客户类别表
    @GetMapping
    public List<GgCoustomertype> get(){
        return ggCoustomerTypeService.selectall(null);
    }
}

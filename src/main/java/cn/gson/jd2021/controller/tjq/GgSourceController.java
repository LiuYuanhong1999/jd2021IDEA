package cn.gson.jd2021.controller.tjq;

import cn.gson.jd2021.model.mapper.tjq.GgSourceMapper;
import cn.gson.jd2021.model.pojos.GgSource;
import cn.gson.jd2021.model.service.tjq.GgSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/source")
public class GgSourceController {
    //信息源表
    @Autowired
    private GgSourceService ggSourceService;
    //新增 信息源表
    @PostMapping
    public Integer put(@RequestBody GgSource ggSource){
        System.out.println("请输出指"+ggSource.getSourceName());
        return ggSourceService.doInsert(ggSource);
    }
    //修改 信息源表
    @PostMapping("update")
    public Integer update(@RequestBody GgSource ggSource){
        return ggSourceService.doUpdate(ggSource);
    }
    //查询所有 信息源
    @PostMapping("show")
    public List<GgSource> select(@RequestBody GgSource ggSource){
        return ggSourceService.selectall(ggSource);
    }
}

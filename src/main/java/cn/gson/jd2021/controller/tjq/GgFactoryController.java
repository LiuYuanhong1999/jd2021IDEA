package cn.gson.jd2021.controller.tjq;

import cn.gson.jd2021.model.mapper.tjq.GgFactoryMapper;
import cn.gson.jd2021.model.pojos.GgFactory;
import cn.gson.jd2021.model.service.tjq.GgFactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/factory")
public class GgFactoryController {
    @Autowired
    GgFactoryService ggFactoryService;

    @PostMapping
    public Integer put(@RequestBody GgFactory ggFactory){
        return ggFactoryService.doInsert(ggFactory);
    }
    @PostMapping("update")
    public Integer update(@RequestBody GgFactory ggFactory){
        return ggFactoryService.doUpdate(ggFactory);
    }
    @PostMapping("show")
    public List<GgFactory> show(@RequestBody GgFactory ggFactory){
        return ggFactoryService.select(ggFactory);
    }
}

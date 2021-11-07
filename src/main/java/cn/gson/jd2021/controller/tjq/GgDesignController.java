package cn.gson.jd2021.controller.tjq;

import cn.gson.jd2021.model.pojos.GgDesign;
import cn.gson.jd2021.model.pojos.vo.GgDesignVo;
import cn.gson.jd2021.model.service.tjq.GgDesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/design")
public class GgDesignController {
    @Autowired
    private GgDesignService ggDesignService;
    //新增
    @PostMapping
    public Integer put(@RequestBody GgDesign ggDesign){
        return ggDesignService.doInset(ggDesign);
    }
    //修改
    @PostMapping("update")
    public Integer update(@RequestBody GgDesign ggDesign){
        return ggDesignService.doUpdate(ggDesign);
    }
    @PostMapping("show")
    public List<GgDesign> show(@RequestBody GgDesignVo vo){
        return ggDesignService.selectall(vo);
    }
}

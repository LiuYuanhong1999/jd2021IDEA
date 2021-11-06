package cn.gson.jd2021.controller.tjq;

import cn.gson.jd2021.model.pojos.GgArchive;
import cn.gson.jd2021.model.service.tjq.GgArchiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 归档
 */
@RestController
@RequestMapping("/ggarchive")
public class GgArchiveController {
    @Autowired
    private GgArchiveService ggArchiveService;
    //查询归档 归档原因表
   @PostMapping("show")
    public List<GgArchive> post(@RequestBody GgArchive ggArchive){
        return ggArchiveService.selectall(ggArchive);
    }
    //新增归档
    @PostMapping
    public Integer put(@RequestBody GgArchive ggArchive){
        return ggArchiveService.doInsert(ggArchive);
    }
    //修改 归档表
    @PostMapping("update")
    public Integer update(@RequestBody GgArchive ggArchive){
        return ggArchiveService.doUpdate(ggArchive);
    }

}

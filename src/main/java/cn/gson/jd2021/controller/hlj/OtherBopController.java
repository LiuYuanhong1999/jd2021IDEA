package cn.gson.jd2021.controller.hlj;


import cn.gson.jd2021.model.pojos.OtherBop;
import cn.gson.jd2021.model.service.hlj.OtherBopService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author 贺罗金
 * @version 1.0
 * @date 2021-11-06 15:26
 */
//@RestController=@RequestBody+@Controller组合注解
@RestController
public class OtherBopController {
    @Resource
    OtherBopService service;

    @GetMapping("/selectAllOtherBop")
    public PageInfo<OtherBop> selectAllOtherBop(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize, @RequestParam(value = "value",required = false) String value, @RequestParam(value = "input",required = false) String input) {
        return service.selectAllOtherBop(currentPage,pagesize,value,input);
    }

    @PostMapping("/addOtherBop")
    public OtherBop addOtherBop(@RequestBody OtherBop otherBop){
        service.addOtherBop(otherBop);
        return otherBop;
    }

    @PutMapping("/updOtherBop")
    public OtherBop updOtherBop(@RequestBody OtherBop otherBop){
        service.updOtherBop(otherBop);
        return otherBop;
    }

    @DeleteMapping("/delOtherBop")
    public OtherBop delOtherBop(@RequestBody OtherBop otherBop){
        service.delOtherBop(otherBop);
        return otherBop;
    }
}

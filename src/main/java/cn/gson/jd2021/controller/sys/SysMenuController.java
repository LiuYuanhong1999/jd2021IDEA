package cn.gson.jd2021.controller.sys;

import cn.gson.jd2021.model.pojos.SysMenu;
import cn.gson.jd2021.model.pojos.SysRolemenu;
import cn.gson.jd2021.model.service.sys.SysMenuService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("sys")
public class SysMenuController {
    @Resource
    SysMenuService sysMenuService;

    @RequestMapping("/find-menu")
    public List<SysMenu> findMenu(){
        return sysMenuService.findMenu();
    }

    @PostMapping("/add-jm")
    public void addJm(String grant){
        JSONObject o = JSONObject.parseObject(grant);
        Integer roleId = Integer.parseInt(o.get("jsId").toString());
        List<Integer> funs = JSONArray.parseArray(o.get("funs").toString(),Integer.TYPE);

        sysMenuService.addJm(roleId,funs);
    }

    @RequestMapping("/fun-listrm")
    public List<Integer> funListRm(Integer jsId){
        return sysMenuService.funListRm(jsId);
    }

    @RequestMapping("/home-menu")
    public List<SysMenu> homeMenu(String listNum){
        return sysMenuService.homeMenu(listNum);
    }

    @RequestMapping("/findall-menu")
    public List<SysMenu> findAllMenu(){
        return sysMenuService.findAllMenu();
    }

    @PostMapping("/add-menu")
    public Integer addMent(@RequestBody SysMenu sysMenu){
        return sysMenuService.addMenu(sysMenu);
    }
}

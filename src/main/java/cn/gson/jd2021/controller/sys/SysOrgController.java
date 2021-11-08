package cn.gson.jd2021.controller.sys;

import cn.gson.jd2021.model.pojos.SysOrg;
import cn.gson.jd2021.model.service.sys.SysOrgService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("sys")
public class SysOrgController {
    @Resource
    SysOrgService sysOrgService;

    @RequestMapping("/find-dept")
    public List<SysOrg> findDept(){
        return sysOrgService.findDept();
    }

    @PostMapping("/add-dept")
    public Integer addDept(@RequestBody SysOrg sysOrg){
        return sysOrgService.addDept(sysOrg);
    }
}

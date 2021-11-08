package cn.gson.jd2021.model.service.sys;

import cn.gson.jd2021.model.mapper.sys.SysOrgMapper;
import cn.gson.jd2021.model.pojos.SysOrg;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysOrgService {
    @Resource
    SysOrgMapper sysOrgMapper;

    public List<SysOrg> findDept(String deptName){
        return sysOrgMapper.findDept(deptName);
    }

    public Integer addDept(SysOrg sysOrg) {
        if (sysOrg.getOrgId()==0){
            sysOrgMapper.insert(sysOrg);
            return 1;
        }else{
            sysOrgMapper.updateById(sysOrg);
            return 2;
        }
    }
}

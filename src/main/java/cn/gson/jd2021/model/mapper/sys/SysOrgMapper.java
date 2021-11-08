package cn.gson.jd2021.model.mapper.sys;

import cn.gson.jd2021.model.pojos.SysOrg;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysOrgMapper extends BaseMapper<SysOrg> {
    //新增用户时查询部门
    List<SysOrg> findUo();

    List<SysOrg> findDept(String deptName);
}

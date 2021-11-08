package cn.gson.jd2021.model.mapper.sys;

import cn.gson.jd2021.model.pojos.SysRolemenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysRoleMenuMapper extends BaseMapper<SysRolemenu> {
    void delMenu(Integer roleId);

    List<Integer> funListRm(Integer jsId);
}

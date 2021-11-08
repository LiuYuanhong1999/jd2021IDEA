package cn.gson.jd2021.model.mapper.sys;

import cn.gson.jd2021.model.pojos.SysMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenu> {
    List<SysMenu> findMenu();

    List<SysMenu> homeMenu(String listNum);

    List<SysMenu> findAllMenu();
}

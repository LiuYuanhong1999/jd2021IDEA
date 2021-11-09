package cn.gson.jd2021.model.service.sys;

import cn.gson.jd2021.model.mapper.sys.SysMenuMapper;
import cn.gson.jd2021.model.mapper.sys.SysRoleMenuMapper;
import cn.gson.jd2021.model.pojos.SysMenu;
import cn.gson.jd2021.model.pojos.SysRolemenu;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SysMenuService {
    @Resource
    SysMenuMapper sysMenuMapper;

    @Resource
    SysRoleMenuMapper sysRoleMenuMapper;


    public List<SysMenu> findMenu(){
        return sysMenuMapper.findMenu();
    }

    public void addJm(Integer roleId, List<Integer> funs) {
        sysRoleMenuMapper.delMenu(roleId);
        for (Integer fun : funs) {
            SysRolemenu sysRolemenu = new SysRolemenu();
            sysRolemenu.setMenuId(fun);
            sysRolemenu.setRoldId(roleId);
            sysRoleMenuMapper.insert(sysRolemenu);
        }
    }

    public List<Integer> funListRm(Integer jsId){
        return sysRoleMenuMapper.funListRm(jsId);
    }

    public List<SysMenu> homeMenu(String listNum){
        return sysMenuMapper.homeMenu(listNum);
    }

    public List<SysMenu> findAllMenu(){
        return sysMenuMapper.findAllMenu();
    }

    public Integer addMenu(SysMenu sysMenu) {
        if (sysMenu.getMenuId()==0){
            sysMenuMapper.insert(sysMenu);
            return 1;
        }else {
            sysMenuMapper.updateById(sysMenu);
            return 2;
        }
    }
}

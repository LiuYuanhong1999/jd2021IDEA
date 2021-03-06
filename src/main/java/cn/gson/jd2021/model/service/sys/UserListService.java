package cn.gson.jd2021.model.service.sys;

import cn.gson.jd2021.model.mapper.sys.*;
import cn.gson.jd2021.model.pojos.*;
import cn.gson.jd2021.model.pojos.vo.Login;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserListService {
    @Resource
    UserListMapper userListMapper;

    @Resource
    UserJueseMapper userJueseMapper;

    @Resource
    SysOrgMapper sysOrgMapper;

    @Resource
    HaoService haoService;

    @Resource
    SysRoleuserMapper sysRoleuserMapper;

    @Resource
    LoginRizhiMapper loginRizhiMapper;

    //查询用户列表
    public List<UserList> findUserList(Integer jsId, String userName, Integer orgId, Integer listSex){
        return userListMapper.findUserList(jsId,userName,orgId,listSex);
    }

    //新增用户时查询角色组
    public List<UserJuese> findUj(Integer jsId, String jsName){
        return userJueseMapper.findUj(jsId,jsName);
    }

    //新增用户时查询部门
    public List<SysOrg> findUo(){
        return sysOrgMapper.findUo();
    }

    //新增用户列表
    public void addUser(UserList userList) {
        userList.setListNum(haoService.hao("Y"));
        userList.getSysRoleuser().setListNum(userList.getListNum());
        userListMapper.addUsers(userList);
        sysRoleuserMapper.insert(userList.getSysRoleuser());
    }

    //注销用户
    public void delUser(UserList userList) {
        userListMapper.delUser(userList);
    }

    //修改用户信息
    public void updateUser(UserList userList) {
        SysRoleuser sysRoleuser = userList.getSysRoleuser();
        userList.setSysRoleuser(null);
        userListMapper.updateById(userList);
        sysRoleuserMapper.updateById(sysRoleuser);
    }

    public void suoUser(UserList userList) {
        userList.setSysRoleuser(null);
        userListMapper.updateById(userList);
    }

    public UserList Login(Login login) {
        UserList login1 = userListMapper.Login(login);

            try {
                if (login1!=null) {
                    InetAddress ip4 = Inet4Address.getLocalHost();
                    String a = String.valueOf(ip4);
                    String result = a.substring(a.length()-14);
                    LoginRizhi loginRizhi = new LoginRizhi();
                    System.out.println(result);
                    loginRizhi.setListNum(login1.getListNum());
                    loginRizhi.setRizhiIp(result);
                    loginRizhiMapper.insert(loginRizhi);
                    return login1;
                }
            } catch(Exception e){
                e.printStackTrace();
            }
            return null;
    }

    public UserList findUserId(String listNum) {
        return userListMapper.findUserId(listNum);
    }
}

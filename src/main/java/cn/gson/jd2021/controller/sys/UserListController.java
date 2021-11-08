package cn.gson.jd2021.controller.sys;

import cn.gson.jd2021.model.pojos.SysOrg;
import cn.gson.jd2021.model.pojos.SysRoleuser;
import cn.gson.jd2021.model.pojos.UserJuese;
import cn.gson.jd2021.model.pojos.UserList;
import cn.gson.jd2021.model.pojos.vo.Login;
import cn.gson.jd2021.model.service.sys.UserListService;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("sys")
public class UserListController {
    @Resource
    UserListService userListService;

    //查询用户列表
    @RequestMapping("/find-userlist")
    public List<UserList> findUserList(){
        return userListService.findUserList();
    }

    //新增用户时查询角色组
    @RequestMapping("/find-uj")
    public List<UserJuese> findUj(){
        return userListService.findUj();
    }

    //新增用户时查询部门
    @RequestMapping("/find-uo")
    public List<SysOrg> findUo(){
        return userListService.findUo();
    }

    //新增用户列表
    @PostMapping("/add-user")
    public void addUser(@RequestBody UserList userList){
        userListService.addUser(userList);
    }

    @PostMapping("/del-user")
    public void delUser(@RequestBody UserList userList){
        userListService.delUser(userList);
    }

    @PostMapping("/update-user")
    public void updateUser(@RequestBody UserList userList){
        userListService.updateUser(userList);
    }

    @PostMapping("/suo-user")
    public void suoUser(@RequestBody UserList userList){
        userListService.suoUser(userList);
    }

    @PostMapping("/login")
    public UserList Login(@RequestBody Login login){
        return userListService.Login(login);
    }

    @RequestMapping("/find-userId")
    public UserList findUserId(String listNum){
        return userListService.findUserId(listNum);
    }
}

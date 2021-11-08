package cn.gson.jd2021.model.mapper.sys;

import cn.gson.jd2021.model.pojos.SysRoleuser;
import cn.gson.jd2021.model.pojos.UserList;
import cn.gson.jd2021.model.pojos.vo.Login;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserListMapper extends BaseMapper<UserList> {
    //查询用户列表
    List<UserList> findUserList();

    void addUser(SysRoleuser sysRoleuser);

    void delUser(UserList userList);

    UserList Login(Login login);

    @Insert("INSERT INTO user_list" +
            " (list_num, user_name, user_paw, list_name, list_sex, list_old, list_card, list_salary, list_ipone, list_zt, org_id ) " +
            "VALUES (#{listNum},#{userName},#{userPaw},#{listName},#{listSex},#{listOld},#{listCard},#{listSalary},#{listIpone},#{listZt},#{orgId} )")
    void addUsers(UserList userList);

    UserList findUserId(String listNum);
}

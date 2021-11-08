package cn.gson.jd2021.model.pojos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;


public class SysRoleuser {

  @TableId(type= IdType.AUTO)
  private Integer sruId;
  private long roldId;
  private String listNum;

  private UserList userList;
  private UserJuese userJuese;

  public long getSruId() {
    return sruId;
  }


  public long getRoldId() {
    return roldId;
  }

  public void setRoldId(long roldId) {
    this.roldId = roldId;
  }

  public void setSruId(Integer sruId) {
    this.sruId = sruId;
  }

  public String getListNum() {
    return listNum;
  }

  public void setListNum(String listNum) {
    this.listNum = listNum;
  }

  public UserList getUserList() {
    return userList;
  }

  public void setUserList(UserList userList) {
    this.userList = userList;
  }

  public UserJuese getUserJuese() {
    return userJuese;
  }

  public void setUserJuese(UserJuese userJuese) {
    this.userJuese = userJuese;
  }

  @Override
  public String toString() {
    return "SysRoleuser{" +
            "sruId=" + sruId +
            ", roldId=" + roldId +
            ", listNum='" + listNum + '\'' +
            ", userList=" + userList +
            ", userJuese=" + userJuese +
            '}';
  }
}

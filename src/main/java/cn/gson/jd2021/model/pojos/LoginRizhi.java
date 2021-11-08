package cn.gson.jd2021.model.pojos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class LoginRizhi {

  @TableId(type = IdType.AUTO)
  private long rizhiId;
  private String rizhiIp;
  private java.sql.Timestamp rizhiTime;
  private String listNum;

  private UserList userList;


  public long getRizhiId() {
    return rizhiId;
  }

  public void setRizhiId(long rizhiId) {
    this.rizhiId = rizhiId;
  }

  public String getRizhiIp() {
    return rizhiIp;
  }

  public void setRizhiIp(String rizhiIp) {
    this.rizhiIp = rizhiIp;
  }

  public Timestamp getRizhiTime() {
    return rizhiTime;
  }

  public void setRizhiTime(Timestamp rizhiTime) {
    this.rizhiTime = rizhiTime;
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


}

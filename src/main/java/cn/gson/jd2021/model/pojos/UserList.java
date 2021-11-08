package cn.gson.jd2021.model.pojos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class UserList {
  @TableId(type = IdType.AUTO)
  private String listNum;
  private String userName;
  private String userPaw;
  private String listName;
  private long listSex;
  private long listOld;
  private String listCard;
  private double listSalary;
  private String listIpone;
  private long listZt;
  private long orgId;

  private SysOrg sysOrg;
  private SysRoleuser sysRoleuser;
  private LoginRizhi loginRizhi;

  public LoginRizhi getLoginRizhi() {
    return loginRizhi;
  }

  public void setLoginRizhi(LoginRizhi loginRizhi) {
    this.loginRizhi = loginRizhi;
  }

  public String getListNum() {
    return listNum;
  }

  public void setListNum(String listNum) {
    this.listNum = listNum;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserPaw() {
    return userPaw;
  }

  public void setUserPaw(String userPaw) {
    this.userPaw = userPaw;
  }

  public String getListName() {
    return listName;
  }

  public void setListName(String listName) {
    this.listName = listName;
  }

  public long getListSex() {
    return listSex;
  }

  public void setListSex(long listSex) {
    this.listSex = listSex;
  }

  public long getListOld() {
    return listOld;
  }

  public void setListOld(long listOld) {
    this.listOld = listOld;
  }

  public String getListCard() {
    return listCard;
  }

  public void setListCard(String listCard) {
    this.listCard = listCard;
  }

  public double getListSalary() {
    return listSalary;
  }

  public void setListSalary(double listSalary) {
    this.listSalary = listSalary;
  }

  public String getListIpone() {
    return listIpone;
  }

  public void setListIpone(String listIpone) {
    this.listIpone = listIpone;
  }

  public long getListZt() {
    return listZt;
  }

  public void setListZt(long listZt) {
    this.listZt = listZt;
  }

  public long getOrgId() {
    return orgId;
  }

  public void setOrgId(long orgId) {
    this.orgId = orgId;
  }

  public SysOrg getSysOrg() {
    return sysOrg;
  }

  public void setSysOrg(SysOrg sysOrg) {
    this.sysOrg = sysOrg;
  }

  public SysRoleuser getSysRoleuser() {
    return sysRoleuser;
  }

  public void setSysRoleuser(SysRoleuser sysRoleuser) {
    this.sysRoleuser = sysRoleuser;
  }

  @Override
  public String toString() {
    return "UserList{" +
            "listNum='" + listNum + '\'' +
            ", userName='" + userName + '\'' +
            ", userPaw='" + userPaw + '\'' +
            ", listName='" + listName + '\'' +
            ", listSex=" + listSex +
            ", listOld=" + listOld +
            ", listCard='" + listCard + '\'' +
            ", listSalary=" + listSalary +
            ", listIpone='" + listIpone + '\'' +
            ", listZt=" + listZt +
            ", orgId=" + orgId +
            ", sysOrg=" + sysOrg +
            ", sysRoleuser=" + sysRoleuser +
            '}';
  }
}

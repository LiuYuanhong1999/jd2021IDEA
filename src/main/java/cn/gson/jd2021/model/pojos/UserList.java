package cn.gson.jd2021.model.pojos;

import lombok.Data;

@Data
public class UserList {

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

}

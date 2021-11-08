package cn.gson.jd2021.model.pojos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;

@Data
public class SysOrg {

  @TableId(type = IdType.AUTO)
  private long orgId;
  private long orgPid;
  private String orgPids;
  private String orgName;

  public List<SysOrg> getChildren() {
    return children;
  }

  public void setChildren(List<SysOrg> children) {
    this.children = children;
  }

  private List<SysOrg> children;

  private UserList userList;

  public long getOrgId() {
    return orgId;
  }

  public void setOrgId(long orgId) {
    this.orgId = orgId;
  }

  public long getOrgPid() {
    return orgPid;
  }

  public void setOrgPid(long orgPid) {
    this.orgPid = orgPid;
  }

  public String getOrgPids() {
    return orgPids;
  }

  public void setOrgPids(String orgPids) {
    this.orgPids = orgPids;
  }

  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public UserList getUserList() {
    return userList;
  }

  public void setUserList(UserList userList) {
    this.userList = userList;
  }
}

package cn.gson.jd2021.model.pojos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class UserJuese {

  @TableId(type = IdType.AUTO)
  private long jsId;
  private long jsSj;
  private String jsName;
  private java.sql.Timestamp jsTime;

  private SysRoleuser sysRoleuser;
  private SysRolemenu sysRolemenu;

  public SysRolemenu getSysRolemenu() {
    return sysRolemenu;
  }

  public void setSysRolemenu(SysRolemenu sysRolemenu) {
    this.sysRolemenu = sysRolemenu;
  }

  public long getJsId() {
    return jsId;
  }

  public void setJsId(long jsId) {
    this.jsId = jsId;
  }

  public long getJsSj() {
    return jsSj;
  }

  public void setJsSj(long jsSj) {
    this.jsSj = jsSj;
  }

  public String getJsName() {
    return jsName;
  }

  public void setJsName(String jsName) {
    this.jsName = jsName;
  }

  public Timestamp getJsTime() {
    return jsTime;
  }

  public void setJsTime(Timestamp jsTime) {
    this.jsTime = jsTime;
  }

  public SysRoleuser getSysRoleuser() {
    return sysRoleuser;
  }

  public void setSysRoleuser(SysRoleuser sysRoleuser) {
    this.sysRoleuser = sysRoleuser;
  }
}

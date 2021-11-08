package cn.gson.jd2021.model.pojos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class SysRolemenu {
  @TableId(type = IdType.AUTO)
  private long srlId;
  private long roldId;
  private long menuId;

  private SysMenu sysMenu;
  private UserJuese userJuese;

  public SysMenu getSysMenu() {
    return sysMenu;
  }

  public void setSysMenu(SysMenu sysMenu) {
    this.sysMenu = sysMenu;
  }

  public UserJuese getUserJuese() {
    return userJuese;
  }

  public void setUserJuese(UserJuese userJuese) {
    this.userJuese = userJuese;
  }

  public long getSrlId() {
    return srlId;
  }

  public void setSrlId(long srlId) {
    this.srlId = srlId;
  }

  public long getRoldId() {
    return roldId;
  }

  public void setRoldId(long roldId) {
    this.roldId = roldId;
  }

  public long getMenuId() {
    return menuId;
  }

  public void setMenuId(long menuId) {
    this.menuId = menuId;
  }
}

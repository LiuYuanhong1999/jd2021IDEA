package cn.gson.jd2021.model.pojos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;

@Data
public class SysMenu {
  @TableId(type = IdType.AUTO)
  private long menuId;
  private long menuPid;
  private String menuPids;
  private String menuName;
  private String menuMethod;
  private String menuUrl;
  private String compoentName;
  private String compoentPath;
  private String icon;

  private SysRolemenu sysRolemenu;

  public SysRolemenu getSysRolemenu() {
    return sysRolemenu;
  }

  public void setSysRolemenu(SysRolemenu sysRolemenu) {
    this.sysRolemenu = sysRolemenu;
  }

  private List<SysMenu> children;

  public List<SysMenu> getChildren() {
    return children;
  }

  public void setChildren(List<SysMenu> children) {
    this.children = children;
  }

  public long getMenuId() {
    return menuId;
  }

  public void setMenuId(long menuId) {
    this.menuId = menuId;
  }

  public long getMenuPid() {
    return menuPid;
  }

  public void setMenuPid(long menuPid) {
    this.menuPid = menuPid;
  }

  public String getMenuPids() {
    return menuPids;
  }

  public void setMenuPids(String menuPids) {
    this.menuPids = menuPids;
  }

  public String getMenuName() {
    return menuName;
  }

  public void setMenuName(String menuName) {
    this.menuName = menuName;
  }

  public String getMenuMethod() {
    return menuMethod;
  }

  public void setMenuMethod(String menuMethod) {
    this.menuMethod = menuMethod;
  }

  public String getMenuUrl() {
    return menuUrl;
  }

  public void setMenuUrl(String menuUrl) {
    this.menuUrl = menuUrl;
  }

  public String getCompoentName() {
    return compoentName;
  }

  public void setCompoentName(String compoentName) {
    this.compoentName = compoentName;
  }

  public String getCompoentPath() {
    return compoentPath;
  }

  public void setCompoentPath(String compoentPath) {
    this.compoentPath = compoentPath;
  }

  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }
}

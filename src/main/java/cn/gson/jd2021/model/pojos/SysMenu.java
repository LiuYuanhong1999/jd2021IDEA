package cn.gson.jd2021.model.pojos;

import lombok.Data;

@Data
public class SysMenu {

  private long menuId;
  private long menuPid;
  private String menuPids;
  private String menuName;
  private String menuMethod;
  private String menuUrl;
  private String compoentName;
  private String compoentPath;
  private String icon;

}

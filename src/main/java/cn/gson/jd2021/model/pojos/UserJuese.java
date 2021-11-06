package cn.gson.jd2021.model.pojos;

import lombok.Data;

import java.util.List;

@Data
public class UserJuese {

  private long jsId;
  private long jsSj;
  private String jsName;
  private java.sql.Timestamp jsTime;

  private List<UserJuese> userJueses;
}

package cn.gson.jd2021.model.pojos.vo;

import java.util.Date;

public class SellVisitorlogsVo {
    private Integer logId;//访问记录
    private Date startlogTime;//开始访问日期
    private Date endlogTime;//结束时间
    private Integer logState;//访问状态  交易成功、交易失败
    private String logContext;//访问内容
    private String logType;//访问类别 电话、面聊、QQ、
    private Integer listNum;//接待人外键员工表
    private Integer acId;//分类归档 外键
    private Integer cusId;//外键 客户表

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Date getStartlogTime() {
        return startlogTime;
    }

    public void setStartlogTime(Date startlogTime) {
        this.startlogTime = startlogTime;
    }

    public Date getEndlogTime() {
        return endlogTime;
    }

    public void setEndlogTime(Date endlogTime) {
        this.endlogTime = endlogTime;
    }

    public Integer getLogState() {
        return logState;
    }

    public void setLogState(Integer logState) {
        this.logState = logState;
    }

    public String getLogContext() {
        return logContext;
    }

    public void setLogContext(String logContext) {
        this.logContext = logContext;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public Integer getListNum() {
        return listNum;
    }

    public void setListNum(Integer listNum) {
        this.listNum = listNum;
    }

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }
}

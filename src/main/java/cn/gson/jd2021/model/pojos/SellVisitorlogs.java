package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sell_visitorlogs
 * @author 
 */
@Data
public class SellVisitorlogs implements Serializable {
    private GgArchive ggArchive;//归档
    private SellCoustomer sellCoustomer;//客户外键
    private UserList userList;//员工

    public GgArchive getGgArchive() {
        return ggArchive;
    }

    public void setGgArchive(GgArchive ggArchive) {
        this.ggArchive = ggArchive;
    }

    public SellCoustomer getSellCoustomer() {
        return sellCoustomer;
    }

    public void setSellCoustomer(SellCoustomer sellCoustomer) {
        this.sellCoustomer = sellCoustomer;
    }

    public UserList getUserList() {
        return userList;
    }

    public void setUserList(UserList userList) {
        this.userList = userList;
    }

    /**
     * 访问记录
     */
    private Integer logId;

    /**
     * 访问日期
     */
    private Date logTime;

    /**
     * 访问状态
     */
    private Integer logState;

    /**
     * 访问内容
     */
    private String logContext;

    /**
     * 访问类别
     */
    private String logType;

    /**
     * 接待人外键员工表
     */
    private Integer listNum;

    /**
     * 分类归档 外键
     */
    private Integer acId;

    /**
     * 外键 客户表
     */
    private Integer cusId;

    private static final long serialVersionUID = 1L;

    public SellVisitorlogs() {
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public SellVisitorlogs(Integer logId, Date logTime, Integer logState, String logContext, String logType, Integer listNum, Integer acId, Integer cusId) {
        this.logId = logId;
        this.logTime = logTime;
        this.logState = logState;
        this.logContext = logContext;
        this.logType = logType;
        this.listNum = listNum;
        this.acId = acId;
        this.cusId = cusId;
    }
}
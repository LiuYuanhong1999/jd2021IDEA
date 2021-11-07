package cn.gson.jd2021.model.pojos.vo;

import java.math.BigDecimal;
import java.util.Date;

public class SellCoustomerVo {
    /**
     * 客户主键
     */
    private Integer acId;

    /**
     * 客户编号
     */
    private String cusNo;

    /**
     * 客户名称
     */
    private String cusName;

    /**
     * 客户电话
     */
    private String cusCellphone;

    /**
     * 客户qq
     */
    private String cusQq;

    /**
     * 客户地址
     */
    private String cusPost;

    /**
     * 开始时间
     */
    private Date startcusTime;

    //结束时间
    private Date endcusTime;

    /**
     * 客户状态
     */
    private String cusState;

    /**
     * 备注
     */
    private String cusReamrk;

    /**
     * 销售顾问 外键 用户
     */
    private Integer listNum;

    /**
     * 客户类别 外键 客户类别表
     */
    private Integer ctId;

    /**
     * 信息来源 外键 信息来源表
     */
    private Integer sourceId;

    /**
     * 意向厂商 外键 厂商表
     */
    private Integer factoryId;

    /**
     * 意向品牌 外键 品牌表
     */
    private Integer brandId;

    /**
     * 意向颜色 外键 颜色
     */
    private Integer ggColor;

    /**
     * 考虑因素
     */
    private String cusFactor;

    /**
     * 预算
     */
    private BigDecimal cusBudget;

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public String getCusNo() {
        return cusNo;
    }

    public void setCusNo(String cusNo) {
        this.cusNo = cusNo;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusCellphone() {
        return cusCellphone;
    }

    public void setCusCellphone(String cusCellphone) {
        this.cusCellphone = cusCellphone;
    }

    public String getCusQq() {
        return cusQq;
    }

    public void setCusQq(String cusQq) {
        this.cusQq = cusQq;
    }

    public String getCusPost() {
        return cusPost;
    }

    public void setCusPost(String cusPost) {
        this.cusPost = cusPost;
    }

    public Date getStartcusTime() {
        return startcusTime;
    }

    public void setStartcusTime(Date startcusTime) {
        this.startcusTime = startcusTime;
    }

    public Date getEndcusTime() {
        return endcusTime;
    }

    public void setEndcusTime(Date endcusTime) {
        this.endcusTime = endcusTime;
    }

    public String getCusState() {
        return cusState;
    }

    public void setCusState(String cusState) {
        this.cusState = cusState;
    }

    public String getCusReamrk() {
        return cusReamrk;
    }

    public void setCusReamrk(String cusReamrk) {
        this.cusReamrk = cusReamrk;
    }

    public Integer getListNum() {
        return listNum;
    }

    public void setListNum(Integer listNum) {
        this.listNum = listNum;
    }

    public Integer getCtId() {
        return ctId;
    }

    public void setCtId(Integer ctId) {
        this.ctId = ctId;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getGgColor() {
        return ggColor;
    }

    public void setGgColor(Integer ggColor) {
        this.ggColor = ggColor;
    }

    public String getCusFactor() {
        return cusFactor;
    }

    public void setCusFactor(String cusFactor) {
        this.cusFactor = cusFactor;
    }

    public BigDecimal getCusBudget() {
        return cusBudget;
    }

    public void setCusBudget(BigDecimal cusBudget) {
        this.cusBudget = cusBudget;
    }
}

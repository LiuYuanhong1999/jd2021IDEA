package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * sell_coustomer
 * @author 
 */
@Data
public class SellCoustomer implements Serializable {
    //客户类别
     private GgCoustomertype ggCoustomertype;
     //信息来源
    private GgSource ggSource;

    //意向厂商
    private GgFactory ggFactory;
    //意向品牌
    private GgBrand ggBrand;
    //意向颜色
    private GgColor ggColors;
    //销售顾问
    private UserList userList;
    //客户跟踪 数据
    private List<SellVisitorlogs> sellVisitorlogs;

    public GgCoustomertype getGgCoustomertype() {
        return ggCoustomertype;
    }

    public void setGgCoustomertype(GgCoustomertype ggCoustomertype) {
        this.ggCoustomertype = ggCoustomertype;
    }

    public GgSource getGgSource() {
        return ggSource;
    }

    public void setGgSource(GgSource ggSource) {
        this.ggSource = ggSource;
    }

    public GgFactory getGgFactory() {
        return ggFactory;
    }

    public void setGgFactory(GgFactory ggFactory) {
        this.ggFactory = ggFactory;
    }

    public GgBrand getGgBrand() {
        return ggBrand;
    }

    public void setGgBrand(GgBrand ggBrand) {
        this.ggBrand = ggBrand;
    }

    public GgColor getGgColors() {
        return ggColors;
    }

    public void setGgColors(GgColor ggColors) {
        this.ggColors = ggColors;
    }

    public UserList getUserList() {
        return userList;
    }

    public void setUserList(UserList userList) {
        this.userList = userList;
    }

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
     * 时间
     */
    private Date cusTime;

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

    private static final long serialVersionUID = 1L;

    public SellCoustomer(Integer acId, String cusNo, String cusName, String cusCellphone, String cusQq, String cusPost, Date cusTime, String cusState, String cusReamrk, Integer listNum, Integer ctId, Integer sourceId, Integer factoryId, Integer brandId, Integer ggColor, String cusFactor, BigDecimal cusBudget) {
        this.acId = acId;
        this.cusNo = cusNo;
        this.cusName = cusName;
        this.cusCellphone = cusCellphone;
        this.cusQq = cusQq;
        this.cusPost = cusPost;
        this.cusTime = cusTime;
        this.cusState = cusState;
        this.cusReamrk = cusReamrk;
        this.listNum = listNum;
        this.ctId = ctId;
        this.sourceId = sourceId;
        this.factoryId = factoryId;
        this.brandId = brandId;
        this.ggColor = ggColor;
        this.cusFactor = cusFactor;
        this.cusBudget = cusBudget;
    }

    public SellCoustomer() {
    }

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

    public Date getCusTime() {
        return cusTime;
    }

    public void setCusTime(Date cusTime) {
        this.cusTime = cusTime;
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
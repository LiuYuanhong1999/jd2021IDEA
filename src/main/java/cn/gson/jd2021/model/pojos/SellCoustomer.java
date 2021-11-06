package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * sell_coustomer
 * @author 
 */
@Data
public class SellCoustomer implements Serializable {
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
}
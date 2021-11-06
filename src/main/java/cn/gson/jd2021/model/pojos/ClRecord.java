package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * cl_record
 * @author 
 */
@Data
public class ClRecord implements Serializable {
    /**
     * 登记编号
     */
    private String recordId;

    /**
     * 厂商编号
     */
    private Integer factoryId;

    /**
     * 品牌编号
     */
    private Integer brandId;

    /**
     * 款式编号
     */
    private Integer designId;

    /**
     * 颜色编号
     */
    private Integer colorId;

    /**
     * 出厂时间
     */
    private Date recordLeaveTime;

    /**
     * 变速器
     */
    private String recordVariator;

    /**
     * 排量
     */
    private String recordDisplacement;

    /**
     * 行驶里程
     */
    private Integer recordMileage;

    /**
     * 初登时间
     */
    private Date recordBegain;

    /**
     * 车主姓名
     */
    private String recordName;

    /**
     * 联系人姓名
     */
    private String contactName;

    /**
     * 联系人号码
     */
    private String contactPhone;

    /**
     * 联系人邮箱
（可选）
     */
    private String contactEmail;

    /**
     * 预售价格
     */
    private BigDecimal recordPrice;

    /**
     * 咨询时间
(如果字段时间那么就会使用当前默认时间)
     */
    private Date recordTime;

    /**
     * 咨询方式
     */
    private String recordWay;

    /**
     * 备注
     */
    private String recordNote;

    private static final long serialVersionUID = 1L;
}
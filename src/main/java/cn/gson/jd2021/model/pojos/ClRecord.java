package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

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

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
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

    public Integer getDesignId() {
        return designId;
    }

    public void setDesignId(Integer designId) {
        this.designId = designId;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date getRecordLeaveTime() {
        return recordLeaveTime;
    }

    public void setRecordLeaveTime(Date recordLeaveTime) {
        this.recordLeaveTime = recordLeaveTime;
    }

    public String getRecordVariator() {
        return recordVariator;
    }

    public void setRecordVariator(String recordVariator) {
        this.recordVariator = recordVariator;
    }

    public String getRecordDisplacement() {
        return recordDisplacement;
    }

    public void setRecordDisplacement(String recordDisplacement) {
        this.recordDisplacement = recordDisplacement;
    }

    public Integer getRecordMileage() {
        return recordMileage;
    }

    public void setRecordMileage(Integer recordMileage) {
        this.recordMileage = recordMileage;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date getRecordBegain() {
        return recordBegain;
    }

    public void setRecordBegain(Date recordBegain) {
        this.recordBegain = recordBegain;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public BigDecimal getRecordPrice() {
        return recordPrice;
    }

    public void setRecordPrice(BigDecimal recordPrice) {
        this.recordPrice = recordPrice;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public String getRecordWay() {
        return recordWay;
    }

    public void setRecordWay(String recordWay) {
        this.recordWay = recordWay;
    }

    public String getRecordNote() {
        return recordNote;
    }

    public void setRecordNote(String recordNote) {
        this.recordNote = recordNote;
    }

    //汽车品牌
    private GgBrand ggBrand;

    public GgBrand getGgBrand() {
        return ggBrand;
    }

    public void setGgBrand(GgBrand ggBrand) {
        this.ggBrand = ggBrand;
    }

    //汽车款式
    private GgDesign ggDesign;

    public GgDesign getGgDesign() {
        return ggDesign;
    }

    public void setGgDesign(GgDesign ggDesign) {
        this.ggDesign = ggDesign;
    }

    //汽车颜色
    private GgColor ggColor;

    public GgColor getGgColor() {
        return ggColor;
    }

    public void setGgColor(GgColor ggColor) {
        this.ggColor = ggColor;
    }
}
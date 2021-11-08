package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * cl_assess
 * @author 
 */
@Data
public class ClAssess implements Serializable {
    /**
     * 评估主键编号
     */
    private String assessId;

    /**
     * 预约编号
     */
    private String ordersId;

    /**
     * 车牌号
     */
    private String assessCard;

    /**
     * 燃油种类
     */
    private String assessType;

    /**
     * 是否四轮驱动
     */
    private String assessDrive;

    /**
     * 发动机
     */
    private String assessEngine;

    /**
     * 档位形式
     */
    private String assessTap;

    /**
     * 过户次数
     */
    private Integer assessTransferTimes;

    /**
     * 行驶证
     */
    private String assessLicense;

    /**
     * 总体评价
     */
    private String assessAppraise;

    /**
     * 新车市场价
     */
    private BigDecimal assessNewcarPrice;

    /**
     * 评估人报价
     */
    private BigDecimal assessOffice;


    /**
     * 定价中心
     */
    private BigDecimal assessPrice;

    /**
     * 最终定价
     */
    private BigDecimal assessFinalPrice;


    /**
     * 评估人
     */
    private String assessUser;

    /**
     * 复核人员
     */
    private String assessReview;

    /**
     * 备注
     */
    private String assessNote;

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
     * 变速器
     */
    private String assessVariator;

    /**
     * 颜色编号
     */
    private Integer colorId;

    /**
         * 排量
     */
    private String assessDisplacement;

    /**
     * 行驶里程
     */
    private Integer assessMileage;

    /**
     * 初登时间
     */
    private Date assessBegain;


    /**
     * 出厂时间
     */
    private Date assessLeaveTime;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date getAssessLeaveTime() {
        return assessLeaveTime;
    }

    public void setAssessLeaveTime(Date assessLeaveTime) {
        this.assessLeaveTime = assessLeaveTime;
    }

    public String getAssessId() {
        return assessId;
    }

    public void setAssessId(String assessId) {
        this.assessId = assessId;
    }


    public BigDecimal getAssessPrice() {
        return assessPrice;
    }

    public void setAssessPrice(BigDecimal assessPrice) {
        this.assessPrice = assessPrice;
    }

    public BigDecimal getAssessFinalPrice() {
        return assessFinalPrice;
    }

    public void setAssessFinalPrice(BigDecimal assessFinalPrice) {
        this.assessFinalPrice = assessFinalPrice;
    }

    public String getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId;
    }

    public String getAssessCard() {
        return assessCard;
    }

    public void setAssessCard(String assessCard) {
        this.assessCard = assessCard;
    }

    public String getAssessType() {
        return assessType;
    }

    public void setAssessType(String assessType) {
        this.assessType = assessType;
    }

    public String getAssessDrive() {
        return assessDrive;
    }

    public void setAssessDrive(String assessDrive) {
        this.assessDrive = assessDrive;
    }

    public String getAssessEngine() {
        return assessEngine;
    }

    public void setAssessEngine(String assessEngine) {
        this.assessEngine = assessEngine;
    }

    public String getAssessTap() {
        return assessTap;
    }

    public void setAssessTap(String assessTap) {
        this.assessTap = assessTap;
    }

    public Integer getAssessTransferTimes() {
        return assessTransferTimes;
    }

    public void setAssessTransferTimes(Integer assessTransferTimes) {
        this.assessTransferTimes = assessTransferTimes;
    }

    public String getAssessLicense() {
        return assessLicense;
    }

    public void setAssessLicense(String assessLicense) {
        this.assessLicense = assessLicense;
    }

    public String getAssessAppraise() {
        return assessAppraise;
    }

    public void setAssessAppraise(String assessAppraise) {
        this.assessAppraise = assessAppraise;
    }

    public BigDecimal getAssessNewcarPrice() {
        return assessNewcarPrice;
    }

    public void setAssessNewcarPrice(BigDecimal assessNewcarPrice) {
        this.assessNewcarPrice = assessNewcarPrice;
    }

    public BigDecimal getAssessOffice() {
        return assessOffice;
    }

    public void setAssessOffice(BigDecimal assessOffice) {
        this.assessOffice = assessOffice;
    }

    public String getAssessUser() {
        return assessUser;
    }

    public void setAssessUser(String assessUser) {
        this.assessUser = assessUser;
    }

    public String getAssessReview() {
        return assessReview;
    }

    public void setAssessReview(String assessReview) {
        this.assessReview = assessReview;
    }

    public String getAssessNote() {
        return assessNote;
    }

    public void setAssessNote(String assessNote) {
        this.assessNote = assessNote;
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

    public String getAssessVariator() {
        return assessVariator;
    }

    public void setAssessVariator(String assessVariator) {
        this.assessVariator = assessVariator;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public String getAssessDisplacement() {
        return assessDisplacement;
    }

    public void setAssessDisplacement(String assessDisplacement) {
        this.assessDisplacement = assessDisplacement;
    }

    public Integer getAssessMileage() {
        return assessMileage;
    }

    public void setAssessMileage(Integer assessMileage) {
        this.assessMileage = assessMileage;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date getAssessBegain() {
        return assessBegain;
    }

    public void setAssessBegain(Date assessBegain) {
        this.assessBegain = assessBegain;
    }



    private ClOrders clOrders;//预约

    public ClOrders getClOrders() {
        return clOrders;
    }

    public void setClOrders(ClOrders clOrders) {
        this.clOrders = clOrders;
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
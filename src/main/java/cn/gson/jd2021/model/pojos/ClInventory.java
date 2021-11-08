package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * cl_inventory
 * @author 
 */
@Data
public class ClInventory implements Serializable {
    /**
     * 入库编号
     */
    private String storageId;

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
    private Date storageLeaveTime;

    /**
     * 变速器
     */
    private String storageVariator;

    /**
     * 排量
     */
    private String storageDisplacement;

    /**
     * 行驶里程
     */
    private Integer storageMileage;

    /**
     * 初登时间
     */
    private Date storageBegain;

    /**
     * 车牌
     */
    private String storageCard;

    /**
     * 燃油种类
     */
    private String storageType;

    /**
     * 是否四轮驱动
     */
    private String storageDrive;

    /**
     * 发动机
     */
    private String storageEngine;

    /**
     * 档位形式
     */
    private String storageTap;

    /**
     * 过户次数
     */
    private Integer storageTransferTimes;

    /**
     * 行驶证
     */
    private String storageLicense;

    /**
     * 销售价格
     */
    private BigDecimal storagePrcie;

    /**
     * 操作员
     */
    private String storageUser;

    /**
     * 入库时间
     */
    private Date storageTime;

    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId;
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

    public Date getStorageLeaveTime() {
        return storageLeaveTime;
    }

    public void setStorageLeaveTime(Date storageLeaveTime) {
        this.storageLeaveTime = storageLeaveTime;
    }

    public String getStorageVariator() {
        return storageVariator;
    }

    public void setStorageVariator(String storageVariator) {
        this.storageVariator = storageVariator;
    }

    public String getStorageDisplacement() {
        return storageDisplacement;
    }

    public void setStorageDisplacement(String storageDisplacement) {
        this.storageDisplacement = storageDisplacement;
    }

    public Integer getStorageMileage() {
        return storageMileage;
    }

    public void setStorageMileage(Integer storageMileage) {
        this.storageMileage = storageMileage;
    }

    public Date getStorageBegain() {
        return storageBegain;
    }

    public void setStorageBegain(Date storageBegain) {
        this.storageBegain = storageBegain;
    }

    public String getStorageCard() {
        return storageCard;
    }

    public void setStorageCard(String storageCard) {
        this.storageCard = storageCard;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public String getStorageDrive() {
        return storageDrive;
    }

    public void setStorageDrive(String storageDrive) {
        this.storageDrive = storageDrive;
    }

    public String getStorageEngine() {
        return storageEngine;
    }

    public void setStorageEngine(String storageEngine) {
        this.storageEngine = storageEngine;
    }

    public String getStorageTap() {
        return storageTap;
    }

    public void setStorageTap(String storageTap) {
        this.storageTap = storageTap;
    }

    public Integer getStorageTransferTimes() {
        return storageTransferTimes;
    }

    public void setStorageTransferTimes(Integer storageTransferTimes) {
        this.storageTransferTimes = storageTransferTimes;
    }

    public String getStorageLicense() {
        return storageLicense;
    }

    public void setStorageLicense(String storageLicense) {
        this.storageLicense = storageLicense;
    }

    public BigDecimal getStoragePrcie() {
        return storagePrcie;
    }

    public void setStoragePrcie(BigDecimal storagePrcie) {
        this.storagePrcie = storagePrcie;
    }

    public String getStorageUser() {
        return storageUser;
    }

    public void setStorageUser(String storageUser) {
        this.storageUser = storageUser;
    }

    public Date getStorageTime() {
        return storageTime;
    }

    public void setStorageTime(Date storageTime) {
        this.storageTime = storageTime;
    }


    //回访记录
    ClReturnVist clReturnVist;

    public ClReturnVist getClReturnVist() {
        return clReturnVist;
    }

    public void setClReturnVist(ClReturnVist clReturnVist) {
        this.clReturnVist = clReturnVist;
    }
}
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

    private static final long serialVersionUID = 1L;
}
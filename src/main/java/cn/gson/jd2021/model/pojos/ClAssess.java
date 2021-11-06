package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

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
    private String orderId;

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

    private static final long serialVersionUID = 1L;
}
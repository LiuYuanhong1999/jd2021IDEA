package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * sell_order
 * @author 
 */
@Data
public class SellOrder implements Serializable {
    /**
     * 订单表主键 yyyymmdd6位随机数
     */
    private String orderId;

    /**
     * 0全款，1分期付款
     */
    private Integer orderBuytype;

    /**
     * 1普通发票 2增值税发票
     */
    private Integer orderBill;

    /**
     * 发票号
     */
    private String orderBillno;

    /**
     * 售期时间
     */
    private Date orderTime;

    /**
     * 销售价格
     */
    private BigDecimal orderPrice;

    /**
     * 让利
     */
    private BigDecimal orderLet;

    /**
     * 成交金额
     */
    private BigDecimal orderTotal;

    /**
     * 后付款金额
     */
    private BigDecimal orderPaylater;

    /**
     * 欠款金额
     */
    private BigDecimal orderDebt;

    /**
     * 预算定金
     */
    private BigDecimal orderPricing;

    /**
     * 状态
     */
    private Integer orderState;

    /**
     * 交车时间
     */
    private Date orderFordate;

    /**
     * 交车手续
     */
    private Integer orderProcedure;

    /**
     * 交车人
     */
    private String orderForcar;

    /**
     * 领车人
     */
    private String orderGetcar;

    /**
     * 外键 客户表
     */
    private Integer cusId;

    /**
     * 外键 员工表
     */
    private Integer listNum;

    /**
     * 外键 库存表
     */
    private String storageId;

    private static final long serialVersionUID = 1L;
}
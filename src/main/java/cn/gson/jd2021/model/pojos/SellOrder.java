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
    //库存外键 storageId
    private ClInventory clInventory;
    //员工外键 listNum
    private UserList userList;
    //客户外键 cusId
    private SellCoustomer sellCoustomer;


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
    //交车地点
    private String orderPost;
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

    public SellOrder(String orderId, Integer orderBuytype, Integer orderBill, String orderBillno, Date orderTime, BigDecimal orderPrice, BigDecimal orderLet, BigDecimal orderTotal, BigDecimal orderPaylater, BigDecimal orderDebt, BigDecimal orderPricing, Integer orderState, Date orderFordate, Integer orderProcedure, String orderForcar, String orderGetcar, Integer cusId, Integer listNum, String storageId) {
        this.orderId = orderId;
        this.orderBuytype = orderBuytype;
        this.orderBill = orderBill;
        this.orderBillno = orderBillno;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.orderLet = orderLet;
        this.orderTotal = orderTotal;
        this.orderPaylater = orderPaylater;
        this.orderDebt = orderDebt;
        this.orderPricing = orderPricing;
        this.orderState = orderState;
        this.orderFordate = orderFordate;
        this.orderProcedure = orderProcedure;
        this.orderForcar = orderForcar;
        this.orderGetcar = orderGetcar;
        this.cusId = cusId;
        this.listNum = listNum;
        this.storageId = storageId;
    }

    public SellOrder() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderBuytype() {
        return orderBuytype;
    }

    public void setOrderBuytype(Integer orderBuytype) {
        this.orderBuytype = orderBuytype;
    }

    public Integer getOrderBill() {
        return orderBill;
    }

    public void setOrderBill(Integer orderBill) {
        this.orderBill = orderBill;
    }

    public String getOrderBillno() {
        return orderBillno;
    }

    public void setOrderBillno(String orderBillno) {
        this.orderBillno = orderBillno;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public BigDecimal getOrderLet() {
        return orderLet;
    }

    public void setOrderLet(BigDecimal orderLet) {
        this.orderLet = orderLet;
    }

    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }

    public BigDecimal getOrderPaylater() {
        return orderPaylater;
    }

    public void setOrderPaylater(BigDecimal orderPaylater) {
        this.orderPaylater = orderPaylater;
    }

    public BigDecimal getOrderDebt() {
        return orderDebt;
    }

    public void setOrderDebt(BigDecimal orderDebt) {
        this.orderDebt = orderDebt;
    }

    public BigDecimal getOrderPricing() {
        return orderPricing;
    }

    public void setOrderPricing(BigDecimal orderPricing) {
        this.orderPricing = orderPricing;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Date getOrderFordate() {
        return orderFordate;
    }

    public void setOrderFordate(Date orderFordate) {
        this.orderFordate = orderFordate;
    }

    public Integer getOrderProcedure() {
        return orderProcedure;
    }

    public void setOrderProcedure(Integer orderProcedure) {
        this.orderProcedure = orderProcedure;
    }

    public String getOrderForcar() {
        return orderForcar;
    }

    public void setOrderForcar(String orderForcar) {
        this.orderForcar = orderForcar;
    }

    public String getOrderGetcar() {
        return orderGetcar;
    }

    public void setOrderGetcar(String orderGetcar) {
        this.orderGetcar = orderGetcar;
    }

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    public Integer getListNum() {
        return listNum;
    }

    public void setListNum(Integer listNum) {
        this.listNum = listNum;
    }

    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
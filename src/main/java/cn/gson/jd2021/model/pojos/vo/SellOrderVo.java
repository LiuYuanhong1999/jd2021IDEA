package cn.gson.jd2021.model.pojos.vo;

import java.math.BigDecimal;
import java.util.Date;

public class SellOrderVo {
    private String orderId;//订单表主键 yyyymmdd6位随机数
    private Integer orderBuytype;//0全款，1分期付款
    private Integer orderBill;//1普通发票 2增值税发票
    private String orderBillno;//发票号
    private Date orderTime;//售期时间
    private BigDecimal orderPrice;//销售价格
    private BigDecimal orderLet;//让利
    private BigDecimal orderTotal;//成交金额
    private BigDecimal orderPaylater;//后付款金额
    private BigDecimal orderDebt;//欠款金额
    private BigDecimal orderPricing;//预算定金
    private Integer orderState;//状态
    private Date orderFordate;//交车时间
    private Integer orderProcedure;//交车手续
    private String orderForcar;//交车人
    private String orderPost;//交车地点
    private String orderGetcar;//领车人
    private Integer cusId;//外键 客户表
    private Integer listNum;//外键 员工表
    private String storageId;//外键 库存表

    private String coustomerName;//客户名称

    public String getCoustomerName() {
        return coustomerName;
    }

    public void setCoustomerName(String coustomerName) {
        this.coustomerName = coustomerName;
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

    public String getOrderPost() {
        return orderPost;
    }

    public void setOrderPost(String orderPost) {
        this.orderPost = orderPost;
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
}

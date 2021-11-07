package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * cl_orders
 * @author 
 */
@Data
public class ClOrders implements Serializable {
    /**
     * 预约主键
     */
    private String ordersId;

    /**
     * 登记编号
     */
    private String recordId;

    /**
     * 预约日期
     */
    private Date ordersTime;

    /**
     * 接待人（默认当前登录人）
     */
    private String ordersUser;

    /**
     * 预约状态
     */
    private Integer ordersState;

    /**
     * 归档原因
     */
    private Integer acId;

    /**
     * 沟通内容
     */
    private String ordersNote;

    /**
     * 沟通类型（默认评估前预约）
     */
    private String ordersType;

    /**
     * 评估方式
     */
    private String ordersMethdo;




    public String getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public Date getOrdersTime() {
        return ordersTime;
    }

    public void setOrdersTime(Date ordersTime) {
        this.ordersTime = ordersTime;
    }

    public String getOrdersUser() {
        return ordersUser;
    }

    public void setOrdersUser(String ordersUser) {
        this.ordersUser = ordersUser;
    }

    public Integer getOrdersState() {
        return ordersState;
    }

    public void setOrdersState(Integer ordersState) {
        this.ordersState = ordersState;
    }

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public String getOrdersNote() {
        return ordersNote;
    }

    public void setOrdersNote(String ordersNote) {
        this.ordersNote = ordersNote;
    }

    public String getOrdersType() {
        return ordersType;
    }

    public void setOrdersType(String ordersType) {
        this.ordersType = ordersType;
    }

    public String getOrdersMethdo() {
        return ordersMethdo;
    }

    public void setOrdersMethdo(String ordersMethdo) {
        this.ordersMethdo = ordersMethdo;
    }


    //收车登记
    private ClRecord clRecord;

    public ClRecord getClRecord() {
        return clRecord;
    }

    public void setClRecord(ClRecord clRecord) {
        this.clRecord = clRecord;
    }
}
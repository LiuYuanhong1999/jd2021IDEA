package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * cl_return_vist
 * @author 
 */
@Data
public class ClReturnVist implements Serializable {
    /**
     * 回访编号
     */
    private String vistId;

    /**
     * 评估编号
     */
    private String assessId;

    /**
     * 评估状态（默认签约等待
     */
    private Integer vistState;

    /**
     * 最终成交价格
     */
    private BigDecimal vistPrice;

    /**
     * 回访时间
     */
    private Date vistTime;

    /**
     * 备注
     */
    private String vistNote;


    /**
     * 归档类型
     */
    private int acId;

    public String getVistId() {
        return vistId;
    }

    public void setVistId(String vistId) {
        this.vistId = vistId;
    }

    public String getAssessId() {
        return assessId;
    }

    public void setAssessId(String assessId) {
        this.assessId = assessId;
    }

    public Integer getVistState() {
        return vistState;
    }

    public void setVistState(Integer vistState) {
        this.vistState = vistState;
    }

    public BigDecimal getVistPrice() {
        return vistPrice;
    }

    public void setVistPrice(BigDecimal vistPrice) {
        this.vistPrice = vistPrice;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date getVistTime() {
        return vistTime;
    }

    public void setVistTime(Date vistTime) {
        this.vistTime = vistTime;
    }

    public String getVistNote() {
        return vistNote;
    }

    public void setVistNote(String vistNote) {
        this.vistNote = vistNote;
    }

    public int getAcId() {
        return acId;
    }

    public void setAcId(int acId) {
        this.acId = acId;
    }

    private ClAssess clAssess;//车辆评估

    public ClAssess getClAssess() {
        return clAssess;
    }

    public void setClAssess(ClAssess clAssess) {
        this.clAssess = clAssess;
    }
}
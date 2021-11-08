package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import lombok.Data;

/**
 * bg_flow_edition
 * @author 
 */
@Data
public class BgFlowEdition implements Serializable {
    private Integer bgfnId;

    /**
     * 步骤序号
     */
    private String bgfnSerial;

    /**
     * 步骤名称
     */
    private String bgfnDesignation;

    /**
     * 审批人，连接员工表
     */
    private String bgfnApprover;

    /**
     * 连接流程表
     */
    private Integer bgfnBgflowid;

    private UserList userList;//员工表
    private BgFlow bgFlow;//流程表

    private static final long serialVersionUID = 1L;

    public Integer getBgfnId() {
        return bgfnId;
    }

    public void setBgfnId(Integer bgfnId) {
        this.bgfnId = bgfnId;
    }

    public String getBgfnSerial() {
        return bgfnSerial;
    }

    public void setBgfnSerial(String bgfnSerial) {
        this.bgfnSerial = bgfnSerial;
    }

    public String getBgfnDesignation() {
        return bgfnDesignation;
    }

    public void setBgfnDesignation(String bgfnDesignation) {
        this.bgfnDesignation = bgfnDesignation;
    }

    public String getBgfnApprover() {
        return bgfnApprover;
    }

    public void setBgfnApprover(String bgfnApprover) {
        this.bgfnApprover = bgfnApprover;
    }

    public Integer getBgfnBgflowid() {
        return bgfnBgflowid;
    }

    public void setBgfnBgflowid(Integer bgfnBgflowid) {
        this.bgfnBgflowid = bgfnBgflowid;
    }
}
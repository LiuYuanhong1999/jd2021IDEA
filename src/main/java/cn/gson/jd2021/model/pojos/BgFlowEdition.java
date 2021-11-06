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
    private Integer bgfnApprover;

    private static final long serialVersionUID = 1L;
}
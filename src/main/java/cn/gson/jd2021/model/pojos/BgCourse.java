package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import lombok.Data;

/**
 * bg_course
 * @author 
 */
@Data
public class BgCourse implements Serializable {
    private Integer bgceId;

    /**
     * 连接审批流程表
     */
    private Integer bgceApid;

    /**
     * 审批人,连接员工
     */
    private Integer bgceApprover;

    /**
     * 连接流程表
     */
    private Integer bgceFlowid;

    /**
     * 连接流程详表（子节点）
     */
    private Integer bgceFloweditionid;

    /**
     * 审批状态
     */
    private Integer bgceState;

    /**
     * 审批意见
     */
    private String bgceOpinion;

    private static final long serialVersionUID = 1L;
}
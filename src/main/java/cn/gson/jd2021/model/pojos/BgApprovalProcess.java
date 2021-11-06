package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import lombok.Data;

/**
 * bg_approval_process
 * @author 
 */
@Data
public class BgApprovalProcess implements Serializable {
    private Integer bgapId;

    /**
     * 流程名（连接流程表）
     */
    private Integer bgapName;

    /**
     * 当前节点（连接流程详表—子节点）
     */
    private Integer bgapNode;

    /**
     * 审核结果（审核中、通过、驳回）
     */
    private Integer bgapResult;

    private static final long serialVersionUID = 1L;
}
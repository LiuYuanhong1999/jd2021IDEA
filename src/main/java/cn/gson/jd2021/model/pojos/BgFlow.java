package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import lombok.Data;

/**
 * bg_flow
 * @author 
 */
@Data
public class BgFlow implements Serializable {
    private Integer bgfwId;

    /**
     * 流程名称
     */
    private String bgfwName;

    private static final long serialVersionUID = 1L;
}
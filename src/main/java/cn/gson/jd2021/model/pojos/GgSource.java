package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import lombok.Data;

/**
 * gg_source
 * @author 
 */
@Data
public class GgSource implements Serializable {
    /**
     * 信息来源表
     */
    private Integer sourceId;

    /**
     * 来源
     */
    private String sourceName;

    private static final long serialVersionUID = 1L;
}
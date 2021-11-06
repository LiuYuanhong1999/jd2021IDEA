package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import lombok.Data;

/**
 * gg_coustomertype
 * @author 
 */
@Data
public class GgCoustomertype implements Serializable {
    /**
     * 客户类别表id
     */
    private Integer ctId;

    /**
     * 客户类别
     */
    private String ctName;

    private static final long serialVersionUID = 1L;
}
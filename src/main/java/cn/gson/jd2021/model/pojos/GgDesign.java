package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import lombok.Data;

/**
 * gg_design
 * @author 
 */
@Data
public class GgDesign implements Serializable {
    /**
     * 汽车款式id
     */
    private Integer designId;

    /**
     * 汽车款式表
     */
    private String designName;

    /**
     * 汽车品牌
     */
    private Integer brandId;

    private static final long serialVersionUID = 1L;
}
package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import lombok.Data;

/**
 * gg_brand
 * @author 
 */
@Data
public class GgBrand implements Serializable {
    /**
     * 汽车品牌表
     */
    private Integer brandId;

    /**
     * 品牌表
     */
    private String brandName;

    private static final long serialVersionUID = 1L;
}
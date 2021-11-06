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

    //

    private static final long serialVersionUID = 1L;

    public GgBrand() {
    }

    public GgBrand(Integer brandId, String brandName) {
        this.brandId = brandId;
        this.brandName = brandName;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
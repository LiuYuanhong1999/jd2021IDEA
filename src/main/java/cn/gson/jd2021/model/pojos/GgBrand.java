package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import java.util.List;

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
    //外键 厂商名称主键
    private Integer factoryId;

    //实体类 厂商名称
    private GgFactory ggFactory;
    //汽车 款式表 一个汽车品牌表有多个款式
    private List<GgDesign> ggDesigns;

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public GgFactory getGgFactory() {
        return ggFactory;
    }

    public void setGgFactory(GgFactory ggFactory) {
        this.ggFactory = ggFactory;
    }

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
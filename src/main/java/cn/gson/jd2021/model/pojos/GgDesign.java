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

    public GgDesign(Integer designId, String designName, Integer brandId) {
        this.designId = designId;
        this.designName = designName;
        this.brandId = brandId;
    }

    public GgDesign() {
    }

    public Integer getDesignId() {
        return designId;
    }

    public void setDesignId(Integer designId) {
        this.designId = designId;
    }

    public String getDesignName() {
        return designName;
    }

    public void setDesignName(String designName) {
        this.designName = designName;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import lombok.Data;

/**
 * gg_factory
 * @author 
 */
@Data
public class GgFactory implements Serializable {
    /**
     * 厂商表主键
     */
    private Integer factoryId;

    /**
     * 厂商名称
     */
    private String factoryName;

    private static final long serialVersionUID = 1L;

    public GgFactory(Integer factoryId, String factoryName) {
        this.factoryId = factoryId;
        this.factoryName = factoryName;
    }

    public GgFactory() {
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
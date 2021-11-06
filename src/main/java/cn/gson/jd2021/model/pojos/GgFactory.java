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
}
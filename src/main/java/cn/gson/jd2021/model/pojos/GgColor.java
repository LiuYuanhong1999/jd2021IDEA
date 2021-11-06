package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import lombok.Data;

/**
 * gg_color
 * @author 
 */
@Data
public class GgColor implements Serializable {
    /**
     * 车身颜色id
     */
    private Integer colorId;

    /**
     * 颜色
     */
    private String colorName;

    private static final long serialVersionUID = 1L;
}
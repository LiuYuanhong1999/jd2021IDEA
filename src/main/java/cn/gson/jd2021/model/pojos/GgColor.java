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

    //是否使用
    private Integer colorUse;

    public Integer getColorUse() {
        return colorUse;
    }

    public void setColorUse(Integer colorUse) {
        this.colorUse = colorUse;
    }

    private static final long serialVersionUID = 1L;

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public GgColor(Integer colorId, String colorName) {
        this.colorId = colorId;
        this.colorName = colorName;
    }

    public GgColor() {
    }
}
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
    /**
     * 是否使用过
     */
    private Integer acUse;

    private static final long serialVersionUID = 1L;

    public GgCoustomertype() {
    }

    public Integer getAcUse() {
        return acUse;
    }

    public void setAcUse(Integer acUse) {
        this.acUse = acUse;
    }

    public Integer getCtId() {
        return ctId;
    }

    public void setCtId(Integer ctId) {
        this.ctId = ctId;
    }

    public String getCtName() {
        return ctName;
    }

    public void setCtName(String ctName) {
        this.ctName = ctName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public GgCoustomertype(Integer ctId, String ctName) {
        this.ctId = ctId;
        this.ctName = ctName;
    }
}
package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import lombok.Data;

/**
 * gg_archive
 * @author 
 */
@Data
public class GgArchive implements Serializable {
    /**
     * 归档原因表id
     */
    private Integer acId;

    /**
     * 归档原因
     */
    private String acCause;

    /**
     * 归档类型 1：收车归档，2销售归档
     */
    private Integer acType;

    /**
     * 是否使用过 1：使用过 0 未使用过

     */
    private Integer acUse;

    private static final long serialVersionUID = 1L;

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public String getAcCause() {
        return acCause;
    }

    public void setAcCause(String acCause) {
        this.acCause = acCause;
    }

    public Integer getAcType() {
        return acType;
    }

    public void setAcType(Integer acType) {
        this.acType = acType;
    }

    public Integer getAcUse() {
        return acUse;
    }

    public void setAcUse(Integer acUse) {
        this.acUse = acUse;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
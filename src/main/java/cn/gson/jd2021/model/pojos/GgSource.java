package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import lombok.Data;

/**
 * gg_source
 * @author 
 */
@Data
public class GgSource implements Serializable {
    /**
     * 信息来源表
     */
    private Integer sourceId;

    /**
     * 来源sourceName
     */
    private String sourceName;

    //信息来源状态 是否使用过了
    private Integer sourceUse;

    public Integer getSourceUse() {
        return sourceUse;
    }

    public void setSourceUse(Integer sourceUse) {
        this.sourceUse = sourceUse;
    }

    private static final long serialVersionUID = 1L;

    public GgSource() {
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
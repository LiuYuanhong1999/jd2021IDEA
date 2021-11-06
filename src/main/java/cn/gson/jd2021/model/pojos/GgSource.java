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
     * 来源
     */
    private String sourceName;

    private static final long serialVersionUID = 1L;

    public GgSource() {
    }

    public GgSource(Integer sourceId, String sourceName) {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
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
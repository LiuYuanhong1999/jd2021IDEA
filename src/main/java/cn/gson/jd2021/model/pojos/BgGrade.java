package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import lombok.Data;

/**
 * bg_grade
 * @author 
 */
@Data
public class BgGrade implements Serializable {
    private Integer bggeId;

    /**
     * 级别名称
     */
    private String bggeName;

    private static final long serialVersionUID = 1L;
}
package cn.gson.jd2021.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Date;

/**
 * other_bop
 * @author 
 */
@Validated
@Data
@NonNull
@AllArgsConstructor
@NoArgsConstructor
public class OtherBop implements Serializable {
    /**
     * 其他收支记录id
     */
    private Integer otherId;

    /**
     * 日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date otherPaydate;

    /**
     * 收支类型
     */
    private String otherType;

    /**
     * 事由
     */
    private String otherSubject;

    /**
     * 金额
     */
    private Double otherMoney;

    /**
     * 经办人
     */
    private String otherPepo;

    /**
     * 备注
     */
    private String otherRemak;

    /**
     * 打印状态
     */
    private Integer otherStatic;

    private static final long serialVersionUID = 1L;
}
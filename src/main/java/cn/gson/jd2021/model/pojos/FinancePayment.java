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
 * finance_payment
 * @author 
 */
@Validated
@Data
@NonNull
@AllArgsConstructor
@NoArgsConstructor
public class FinancePayment implements Serializable {
    /**
     * 收车付款记录id
     */
    private Integer financeId;

    /**
     * 付款时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date financePaydate;

    /**
     * 收车编号
     */
    private String financeCarnumber;

    /**
     * 车主姓名
     */
    private String financeManname;

    /**
     * 汽车品牌
     */
    private String financeBrand;

    /**
     * 车架号
     */
    private String financePhone;

    /**
     * 付款人
     */
    private String financePepo;

    /**
     * 付款金额
     */
    private Double financeMoney;

    /**
     * 打印状态
     */
    private Integer financeStatic;

    private static final long serialVersionUID = 1L;
}
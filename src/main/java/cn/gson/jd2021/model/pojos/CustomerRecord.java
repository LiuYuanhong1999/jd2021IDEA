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
 * customer_record
 * @author 
 */
@Validated
@Data
@NonNull
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRecord implements Serializable {
    /**
     * 还款id
     */
    private Integer customerId;

    /**
     * 销售单号
     */
    private String customerOutnumber;

    /**
     * 日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date customerPaydate;

    /**
     * 汽车款式
     */
    private String customerType;

    /**
     * 汽车品牌
     */
    private String customerBrand;

    /**
     * 收款人
     */
    private String customerMan;

    /**
     * 金额
     */
    private Double customerMoney;

    /**
     * 制表人
     */
    private String customerPepo;

    /**
     * 备注
     */
    private String customerRemak;

    /**
     * 打印状态
     */
    private Integer customerStatic;

    private static final long serialVersionUID = 1L;
}
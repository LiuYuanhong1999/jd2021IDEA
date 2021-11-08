package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * bg_expense_account
 * @author 
 */
@Data
public class BgExpenseAccount implements Serializable {
    private Integer bgetId;

    /**
     * 申请人，连接员工表
     */
    private String bgetProposer;

    /**
     * 报销金额
     */
    private BigDecimal bgetMoney;

    /**
     * 报销文件
     */
    private String bgetInvoice;

    /**
     * 备注
     */
    private String bgetCause;

    /**
     * 申请时间
     */
    private Timestamp bgetTime;

    /**
     * 报销状态
     */
    private Integer bgetState;

    private UserList userList;

    private static final long serialVersionUID = 1L;
}
package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * sell_visitorlogs
 * @author 
 */
@Data
public class SellVisitorlogs implements Serializable {
    /**
     * 访问记录
     */
    private Integer logId;

    /**
     * 访问日期
     */
    private Date logTime;

    /**
     * 访问状态
     */
    private Integer logState;

    /**
     * 访问内容
     */
    private String logContext;

    /**
     * 访问类别
     */
    private String logType;

    /**
     * 接待人外键员工表
     */
    private Integer listNum;

    /**
     * 分类归档 外键
     */
    private Integer acId;

    /**
     * 外键 客户表
     */
    private Integer cusId;

    private static final long serialVersionUID = 1L;
}
package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * bg_leave
 * @author 
 */
@Data
public class BgLeave implements Serializable {
    private Integer bgleId;

    /**
     * 申请人，连接员工表
     */
    private Integer bgleProposer;

    /**
     * 请假天数
     */
    private Date bgleTime;

    /**
     * 请假事由
     */
    private String bgleCause;

    private static final long serialVersionUID = 1L;
}
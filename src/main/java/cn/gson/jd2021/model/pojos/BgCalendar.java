package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * bg_calendar
 * @author 
 */
@Data
public class BgCalendar implements Serializable {
    private Integer bgcrId;

    /**
     * 日程标题
     */
    private String bgcrTheme;

    /**
     * 开始时间
     */
    private Date bgcrKstime;

    /**
     * 结束时间
     */
    private Date bgcrJstime;

    /**
     * 日程内容
     */
    private String bgcrCause;

    /**
     * 日程级别，连接级别表
     */
    private Integer bgcrGrade;

    /**
     * 日程状态
     */
    private Integer bgcrState;

    private static final long serialVersionUID = 1L;
}
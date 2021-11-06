package cn.gson.jd2021.model.pojos;

import java.io.Serializable;
import lombok.Data;

/**
 * bg_mail
 * @author 
 */
@Data
public class BgMail implements Serializable {
    private Integer bgmlId;

    /**
     * 邮件主题
     */
    private String bgmlTheme;

    /**
     * 邮件等级，连接级别表
     */
    private Integer bgmlGrade;

    /**
     * 收件人，连接员工表 
     */
    private Integer bgmlRecipients;

    /**
     * 附件，文件上传
     */
    private String bgmlInvoice;

    /**
     * 邮件内容
     */
    private String bgmlCause;

    private static final long serialVersionUID = 1L;
}
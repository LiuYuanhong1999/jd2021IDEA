package cn.gson.jd2021.model.service.hlj;

import cn.gson.jd2021.model.pojos.OtherBop;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 贺罗金
 * @version 1.0
 * @date 2021-11-06 15:02
 */
public interface OtherBopService {
    //多条件查询
     PageInfo<OtherBop> selectAllOtherBop(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize, @RequestParam(value = "value",required = false) String value, @RequestParam(value = "input",required = false) String input);

    //新增其他收支记录
    OtherBop addOtherBop(OtherBop otherBop);

    //修改其他收支记录
    OtherBop updOtherBop(OtherBop otherBop);

    //删除其他收支记录
    OtherBop delOtherBop(OtherBop otherBop);

}

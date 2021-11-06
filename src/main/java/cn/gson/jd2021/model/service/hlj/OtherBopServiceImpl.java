package cn.gson.jd2021.model.service.hlj;

import cn.gson.jd2021.model.mapper.hlj.OtherBopDao;
import cn.gson.jd2021.model.pojos.OtherBop;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author 贺罗金
 * @version 1.0
 * @date 2021-11-06 15:06
 */
@Service
@Transactional
public class OtherBopServiceImpl implements OtherBopService {
    @Resource
    OtherBopDao dao;

    @Override
    //分页多条件查询
    public PageInfo<OtherBop> selectAllOtherBop(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize, @RequestParam(value = "value",required = false) String value, @RequestParam(value = "input",required = false) String input) {
        PageHelper.startPage(currentPage, pagesize);
        List<OtherBop> otherBops = dao.selectAllOtherBop(value, input);
        PageInfo<OtherBop> otherBopPageInfo = new PageInfo<>(otherBops);
        return otherBopPageInfo;
    }

    @Override
    //新增收支记录
    public OtherBop addOtherBop(OtherBop otherBop) {
        otherBop.setOtherPaydate(new Date());
        dao.insertSelective(otherBop);
        return otherBop;
    }

    @Override
    //修改收支记录
    public OtherBop updOtherBop(OtherBop otherBop) {
        dao.updateByPrimaryKeySelective(otherBop);
        return otherBop;
    }

    @Override
    //删除收支记录
    public OtherBop delOtherBop(OtherBop otherBop) {
        dao.deleteByPrimaryKey(otherBop.getOtherId());
        return otherBop;
    }
}

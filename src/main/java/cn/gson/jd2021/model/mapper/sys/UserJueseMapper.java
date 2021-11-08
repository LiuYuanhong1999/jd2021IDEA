package cn.gson.jd2021.model.mapper.sys;

import cn.gson.jd2021.model.pojos.UserJuese;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserJueseMapper extends BaseMapper<UserJuese> {
    //新增用户时查询角色组
    List<UserJuese> findUj();
}

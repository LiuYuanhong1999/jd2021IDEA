package cn.gson.jd2021.model.mapper.sys;

import cn.gson.jd2021.model.pojos.LoginRizhi;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginRizhiMapper extends BaseMapper<LoginRizhi> {
    List<LoginRizhi> findLoginRizhi();
}

package cn.gson.jd2021.model.mapper.lyh;

import cn.gson.jd2021.model.pojos.S;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SsMapper {

    List<S> findAll();
}

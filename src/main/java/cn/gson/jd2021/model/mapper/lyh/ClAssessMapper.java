package cn.gson.jd2021.model.mapper.lyh;

import cn.gson.jd2021.model.pojos.ClAssess;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.ManagedBean;
import java.util.List;

@Mapper
public interface ClAssessMapper {


    int deleteByPrimaryKey(String assessId);

    //查询评估记录
    List<ClAssess> findClAssess();


    //新增评估记录
    int insert(ClAssess record);

    //根据评估编号获取评估信息
    List<ClAssess> findClReturnVist(String assessId);


    int insertSelective(ClAssess record);

    ClAssess selectByPrimaryKey(String assessId);

    int updateByPrimaryKeySelective(ClAssess record);

    int updateByPrimaryKey(ClAssess record);
}
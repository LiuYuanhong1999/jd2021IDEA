package cn.gson.jd2021.model.mapper.jl;

import cn.gson.jd2021.model.pojos.BgFlow;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BgFlowMapper {
    int deleteByPrimaryKey(Integer bgfwId);

    /**
     * 新增流程
     * @param bgFlow
     * @return
     */
    void insert(BgFlow bgFlow);

    int insertSelective(BgFlow record);

    BgFlow selectByPrimaryKey(Integer bgfwId);

    int updateByPrimaryKeySelective(BgFlow record);

    int updateByPrimaryKey(BgFlow record);

    /**
     * 查询所有流程
     * @return
     */
    List<BgFlow> selectbgflow ();
}
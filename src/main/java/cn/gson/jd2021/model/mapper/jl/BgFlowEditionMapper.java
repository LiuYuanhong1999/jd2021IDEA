package cn.gson.jd2021.model.mapper.jl;

import cn.gson.jd2021.model.pojos.BgFlowEdition;
import cn.gson.jd2021.model.pojos.UserList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BgFlowEditionMapper {
    /**
     * 根据id删除
     * @param bgfnId
     * @return
     */
    int deleteByPrimaryKey(Integer bgfnId);

    /**
     * 新增子节点
     * @param bgFlowEdition
     * @return
     */
    void insert(BgFlowEdition bgFlowEdition);

    int insertSelective(BgFlowEdition record);

    BgFlowEdition selectByPrimaryKey(Integer bgfnId);

    /**
     * 修改
     * @param bgFlowEdition
     * @return
     */
    int updateByPrimaryKeySelective(BgFlowEdition bgFlowEdition);

    int updateByPrimaryKey(BgFlowEdition record);

    /**
     * 查询流程子节点
     * @param bgfnBgflowid
     * @return
     */
    List<BgFlowEdition> selectBybgflow(Integer bgfnBgflowid);

    /**
     * 查询员工
     * @return
     */
    List<UserList> selectuser();
}
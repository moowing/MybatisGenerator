package com.xiguaLab.ssm.mapper;

import com.xiguaLab.ssm.pojo.ProjectContract;
import com.xiguaLab.ssm.pojo.ProjectContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectContractMapper {
    int countByExample(ProjectContractExample example);

    int deleteByExample(ProjectContractExample example);

    int deleteByPrimaryKey(String contractid);

    int insert(ProjectContract record);

    int insertSelective(ProjectContract record);

    List<ProjectContract> selectByExample(ProjectContractExample example);

    ProjectContract selectByPrimaryKey(String contractid);

    int updateByExampleSelective(@Param("record") ProjectContract record, @Param("example") ProjectContractExample example);

    int updateByExample(@Param("record") ProjectContract record, @Param("example") ProjectContractExample example);

    int updateByPrimaryKeySelective(ProjectContract record);

    int updateByPrimaryKey(ProjectContract record);
}
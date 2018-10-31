package com.xiguaLab.ssm.mapper;

import com.xiguaLab.ssm.pojo.Reviewofreview;
import com.xiguaLab.ssm.pojo.ReviewofreviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReviewofreviewMapper {
    int countByExample(ReviewofreviewExample example);

    int deleteByExample(ReviewofreviewExample example);

    int deleteByPrimaryKey(String id);

    int insert(Reviewofreview record);

    int insertSelective(Reviewofreview record);

    List<Reviewofreview> selectByExample(ReviewofreviewExample example);

    Reviewofreview selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Reviewofreview record, @Param("example") ReviewofreviewExample example);

    int updateByExample(@Param("record") Reviewofreview record, @Param("example") ReviewofreviewExample example);

    int updateByPrimaryKeySelective(Reviewofreview record);

    int updateByPrimaryKey(Reviewofreview record);
}
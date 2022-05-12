package com.fc.dao;

import com.fc.entity.TJiangcheng;
import com.fc.entity.TJiangchengExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TJiangchengMapper {
    long countByExample(TJiangchengExample example);

    int deleteByExample(TJiangchengExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TJiangcheng record);

    int insertSelective(TJiangcheng record);

    List<TJiangcheng> selectByExample(TJiangchengExample example);

    TJiangcheng selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TJiangcheng record, @Param("example") TJiangchengExample example);

    int updateByExample(@Param("record") TJiangcheng record, @Param("example") TJiangchengExample example);

    int updateByPrimaryKeySelective(TJiangcheng record);

    int updateByPrimaryKey(TJiangcheng record);
}
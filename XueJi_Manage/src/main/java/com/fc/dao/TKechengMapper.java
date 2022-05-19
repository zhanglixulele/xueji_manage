package com.fc.dao;

import com.fc.entity.TKecheng;
import com.fc.entity.TKechengExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
@Mapper
public interface TKechengMapper {
    long countByExample(TKechengExample example);

    int deleteByExample(TKechengExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TKecheng record);

    int insertSelective(TKecheng record);

    List<TKecheng> selectByExample(TKechengExample example);

    TKecheng selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TKecheng record, @Param("example") TKechengExample example);

    int updateByExample(@Param("record") TKecheng record, @Param("example") TKechengExample example);

    int updateByPrimaryKeySelective(TKecheng record);

    int updateByPrimaryKey(TKecheng record);
}
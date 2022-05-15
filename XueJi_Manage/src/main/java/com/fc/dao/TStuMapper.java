package com.fc.dao;

import com.fc.entity.TStu;
import com.fc.entity.TStuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TStuMapper {
    long countByExample(TStuExample example);

    int deleteByExample(TStuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TStu record);

    int insertSelective(TStu record);

    List<TStu> selectByExample(TStuExample example);

    TStu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TStu record, @Param("example") TStuExample example);

    int updateByExample(@Param("record") TStu record, @Param("example") TStuExample example);

    int updateByPrimaryKeySelective(TStu record);

    int updateByPrimaryKey(TStu record);
}
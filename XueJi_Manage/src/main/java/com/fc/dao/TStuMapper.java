package com.fc.dao;

import com.fc.entity.TStu;
import com.fc.entity.TStuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
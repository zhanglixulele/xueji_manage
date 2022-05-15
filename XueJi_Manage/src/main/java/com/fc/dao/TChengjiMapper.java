package com.fc.dao;

import com.fc.entity.TChengji;
import com.fc.entity.TChengjiExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface TChengjiMapper {
    long countByExample(TChengjiExample example);

    int deleteByExample(TChengjiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TChengji record);

    int insertSelective(TChengji record);

    List<TChengji> selectByExample(TChengjiExample example);

    TChengji selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TChengji record, @Param("example") TChengjiExample example);

    int updateByExample(@Param("record") TChengji record, @Param("example") TChengjiExample example);

    int updateByPrimaryKeySelective(TChengji record);

    int updateByPrimaryKey(TChengji record);
}
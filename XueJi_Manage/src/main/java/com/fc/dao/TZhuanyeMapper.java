package com.fc.dao;

import com.fc.entity.TZhuanye;
import com.fc.entity.TZhuanyeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TZhuanyeMapper {
    long countByExample(TZhuanyeExample example);

    int deleteByExample(TZhuanyeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TZhuanye record);

    int insertSelective(TZhuanye record);

    List<TZhuanye> selectByExample(TZhuanyeExample example);

    TZhuanye selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TZhuanye record, @Param("example") TZhuanyeExample example);

    int updateByExample(@Param("record") TZhuanye record, @Param("example") TZhuanyeExample example);

    int updateByPrimaryKeySelective(TZhuanye record);

    int updateByPrimaryKey(TZhuanye record);
}
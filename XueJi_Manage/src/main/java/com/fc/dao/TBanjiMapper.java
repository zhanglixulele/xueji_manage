package com.fc.dao;

import com.fc.entity.TBanji;
import com.fc.entity.TBanjiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBanjiMapper {
    long countByExample(TBanjiExample example);

    int deleteByExample(TBanjiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBanji record);

    int insertSelective(TBanji record);

    List<TBanji> selectByExample(TBanjiExample example);

    TBanji selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBanji record, @Param("example") TBanjiExample example);

    int updateByExample(@Param("record") TBanji record, @Param("example") TBanjiExample example);

    int updateByPrimaryKeySelective(TBanji record);

    int updateByPrimaryKey(TBanji record);
}
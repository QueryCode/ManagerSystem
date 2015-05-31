package com.ass.common.generated.dao;

import com.ass.common.generated.model.TLog;
import com.ass.common.generated.model.TLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLogMapper {

	int countByExample(TLogExample example);

	int deleteByExample(TLogExample example);

	int deleteByPrimaryKey(Long id);

	int insert(TLog record);

	int insertSelective(TLog record);

	List<TLog> selectByExample(TLogExample example);

	TLog selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") TLog record,
			@Param("example") TLogExample example);

	int updateByExample(@Param("record") TLog record,
			@Param("example") TLogExample example);

	int updateByPrimaryKeySelective(TLog record);

	int updateByPrimaryKey(TLog record);
}
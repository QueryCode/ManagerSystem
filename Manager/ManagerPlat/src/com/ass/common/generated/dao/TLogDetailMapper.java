package com.ass.common.generated.dao;

import com.ass.common.generated.model.TLogDetail;
import com.ass.common.generated.model.TLogDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLogDetailMapper {

	int countByExample(TLogDetailExample example);

	int deleteByExample(TLogDetailExample example);

	int deleteByPrimaryKey(Long id);

	int insert(TLogDetail record);

	int insertSelective(TLogDetail record);

	List<TLogDetail> selectByExampleWithBLOBs(TLogDetailExample example);

	List<TLogDetail> selectByExample(TLogDetailExample example);

	TLogDetail selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") TLogDetail record,
			@Param("example") TLogDetailExample example);

	int updateByExampleWithBLOBs(@Param("record") TLogDetail record,
			@Param("example") TLogDetailExample example);

	int updateByExample(@Param("record") TLogDetail record,
			@Param("example") TLogDetailExample example);

	int updateByPrimaryKeySelective(TLogDetail record);

	int updateByPrimaryKeyWithBLOBs(TLogDetail record);

	int updateByPrimaryKey(TLogDetail record);
}
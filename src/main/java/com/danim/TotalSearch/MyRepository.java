package com.danim.TotalSearch;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MyRepository {
	List<Do_Option> findDoOptions();
	
	List<Si_Option> findSiOptionsByDoId(int do_id);
}

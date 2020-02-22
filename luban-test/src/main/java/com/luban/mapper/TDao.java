package com.luban.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public interface TDao {

	@Select("select * from t_order")
	public List<Map<String,Object>> list();
}

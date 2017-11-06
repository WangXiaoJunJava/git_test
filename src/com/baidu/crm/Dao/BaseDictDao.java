package com.baidu.crm.Dao;

import java.util.List;

import com.baidu.crm.pojo.BaseDict;

public interface BaseDictDao {
	List<BaseDict> showBaseDictBtCostcode(String typeCode);
}

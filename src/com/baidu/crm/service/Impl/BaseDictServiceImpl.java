package com.baidu.crm.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baidu.crm.Dao.BaseDictDao;
import com.baidu.crm.pojo.BaseDict;
import com.baidu.crm.service.BaseDictService;
@Service
public class BaseDictServiceImpl implements BaseDictService {
	@Autowired
	private BaseDictDao baseDictDao;
	@Override
	public List<BaseDict> showBaseDictBtCostcode(String typeCode) {
		List<BaseDict> BaseDictList = baseDictDao.showBaseDictBtCostcode(typeCode);
		return BaseDictList;
	}

}

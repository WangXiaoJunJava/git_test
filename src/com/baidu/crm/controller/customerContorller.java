package com.baidu.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baidu.crm.Dao.BaseDictDao;
import com.baidu.crm.pojo.BaseDict;
import com.baidu.crm.pojo.quryvo;

@Controller
public class customerContorller {
	@Autowired
	private BaseDictDao baseDictDao;
	@Value("#{typecode_source}")
	private String typecodeSource;
	@Value("#{typecode_industry}")
	private String typecodeIndustry;
	@Value("#{typecoce_level}")
	private String typecoceLevel;

	@RequestMapping("list")
	public String showBaseDictBtCostcode(quryvo qury, Model model) {
		List<BaseDict> industry = baseDictDao.showBaseDictBtCostcode(typecodeIndustry);
		List<BaseDict> source = baseDictDao.showBaseDictBtCostcode(typecodeSource);
		List<BaseDict> level = baseDictDao.showBaseDictBtCostcode(typecoceLevel);
		model.addAttribute("industryType", industry);
		model.addAttribute("fromType", source);
		model.addAttribute("custLevel", level);
		
		return "customer";
	}
}

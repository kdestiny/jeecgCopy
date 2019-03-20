package com.jeecg.destiny.income.service.impl;
import com.jeecg.destiny.income.service.YjmdIncomeServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.destiny.income.entity.YjmdIncomeEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.io.Serializable;
import org.jeecgframework.core.util.ApplicationContextUtil;
import org.jeecgframework.core.util.MyClassLoader;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.web.cgform.enhance.CgformEnhanceJavaInter;

import org.jeecgframework.minidao.util.FreemarkerParseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.jeecgframework.core.util.ResourceUtil;

@Service("yjmdIncomeService")
@Transactional
public class YjmdIncomeServiceImpl extends CommonServiceImpl implements YjmdIncomeServiceI {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
 	public void delete(YjmdIncomeEntity entity) throws Exception{
 		super.delete(entity);
 	}
 	
 	public Serializable save(YjmdIncomeEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(YjmdIncomeEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 	}
 	
}
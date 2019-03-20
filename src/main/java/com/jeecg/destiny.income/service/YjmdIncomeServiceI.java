package com.jeecg.destiny.income.service;
import com.jeecg.destiny.income.entity.YjmdIncomeEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface YjmdIncomeServiceI extends CommonService{
	
 	public void delete(YjmdIncomeEntity entity) throws Exception;
 	
 	public Serializable save(YjmdIncomeEntity entity) throws Exception;
 	
 	public void saveOrUpdate(YjmdIncomeEntity entity) throws Exception;
 	
}

package com.jeecg.destiny.income.service;
import com.jeecg.destiny.income.entity.YjmdMaterialEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface YjmdMaterialServiceI extends CommonService{
	
 	public void delete(YjmdMaterialEntity entity) throws Exception;
 	
 	public Serializable save(YjmdMaterialEntity entity) throws Exception;
 	
 	public void saveOrUpdate(YjmdMaterialEntity entity) throws Exception;
 	
}

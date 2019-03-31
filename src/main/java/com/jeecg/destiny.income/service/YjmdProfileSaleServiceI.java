package com.jeecg.destiny.income.service;
import com.jeecg.destiny.income.entity.YjmdProfileSaleEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface YjmdProfileSaleServiceI extends CommonService{
	
 	public void delete(YjmdProfileSaleEntity entity) throws Exception;
 	
 	public Serializable save(YjmdProfileSaleEntity entity) throws Exception;
 	
 	public void saveOrUpdate(YjmdProfileSaleEntity entity) throws Exception;
 	
}

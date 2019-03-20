package com.jeecg.destiny.service;
import com.jeecg.destiny.entity.WxUserEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface WxUserServiceI extends CommonService{
	
 	public void delete(WxUserEntity entity) throws Exception;
 	
 	public Serializable save(WxUserEntity entity) throws Exception;
 	
 	public void saveOrUpdate(WxUserEntity entity) throws Exception;
 	
}

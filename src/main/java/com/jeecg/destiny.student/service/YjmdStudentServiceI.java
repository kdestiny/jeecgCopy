package com.jeecg.destiny.student.service;
import com.jeecg.destiny.student.entity.YjmdStudentEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface YjmdStudentServiceI extends CommonService{
	
 	public void delete(YjmdStudentEntity entity) throws Exception;
 	
 	public Serializable save(YjmdStudentEntity entity) throws Exception;
 	
 	public void saveOrUpdate(YjmdStudentEntity entity) throws Exception;
 	
}

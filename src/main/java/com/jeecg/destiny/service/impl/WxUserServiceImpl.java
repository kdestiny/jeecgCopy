package com.jeecg.destiny.service.impl;
import com.jeecg.destiny.service.WxUserServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.destiny.entity.WxUserEntity;
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

@Service("wxUserService")
@Transactional
public class WxUserServiceImpl extends CommonServiceImpl implements WxUserServiceI {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
 	public void delete(WxUserEntity entity) throws Exception{
 		super.delete(entity);
 	}
 	
 	public Serializable save(WxUserEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(WxUserEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 	}
 	
}
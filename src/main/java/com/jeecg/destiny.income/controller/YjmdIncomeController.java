package com.jeecg.destiny.income.controller;
import com.jeecg.destiny.income.entity.YjmdIncomeEntity;
import com.jeecg.destiny.income.service.YjmdIncomeServiceI;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.common.TreeChildCount;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;

import java.io.OutputStream;
import org.jeecgframework.core.util.BrowserUtils;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.TemplateExportParams;
import org.jeecgframework.poi.excel.entity.vo.NormalExcelConstants;
import org.jeecgframework.poi.excel.entity.vo.TemplateExcelConstants;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jeecgframework.core.util.ResourceUtil;
import java.io.IOException;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import java.util.Map;
import java.util.HashMap;
import org.jeecgframework.core.util.ExceptionUtil;


/**   
 * @Title: Controller  
 * @Description: 收入表
 * @author onlineGenerator
 * @date 2019-03-20 23:28:22
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/yjmdIncomeController")
public class YjmdIncomeController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(YjmdIncomeController.class);

	@Autowired
	private YjmdIncomeServiceI yjmdIncomeService;
	@Autowired
	private SystemService systemService;
	


	/**
	 * 收入表列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/destiny.income/yjmdIncomeList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param user
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(YjmdIncomeEntity yjmdIncome,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(YjmdIncomeEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, yjmdIncome, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.yjmdIncomeService.getDataGridReturn(cq, true);

		dataGrid.setFooter("stuName:合计,teachFund,groupFund,recommendFund,salerPercentage,otherFund");
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除收入表
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(YjmdIncomeEntity yjmdIncome, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		yjmdIncome = systemService.getEntity(YjmdIncomeEntity.class, yjmdIncome.getId());
		message = "收入表删除成功";
		try{
			yjmdIncomeService.delete(yjmdIncome);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "收入表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除收入表
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "收入表删除成功";
		try{
			for(String id:ids.split(",")){
				YjmdIncomeEntity yjmdIncome = systemService.getEntity(YjmdIncomeEntity.class, 
				id
				);
				yjmdIncomeService.delete(yjmdIncome);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "收入表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加收入表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(YjmdIncomeEntity yjmdIncome, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "收入表添加成功";
		try{
			yjmdIncomeService.save(yjmdIncome);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "收入表添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新收入表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(YjmdIncomeEntity yjmdIncome, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "收入表更新成功";
		YjmdIncomeEntity t = yjmdIncomeService.get(YjmdIncomeEntity.class, yjmdIncome.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(yjmdIncome, t);
			yjmdIncomeService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "收入表更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 收入表新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(YjmdIncomeEntity yjmdIncome, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(yjmdIncome.getId())) {
			yjmdIncome = yjmdIncomeService.getEntity(YjmdIncomeEntity.class, yjmdIncome.getId());
			req.setAttribute("yjmdIncomePage", yjmdIncome);
		}
		return new ModelAndView("com/jeecg/destiny.income/yjmdIncome-add");
	}
	/**
	 * 收入表编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(YjmdIncomeEntity yjmdIncome, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(yjmdIncome.getId())) {
			yjmdIncome = yjmdIncomeService.getEntity(YjmdIncomeEntity.class, yjmdIncome.getId());
			req.setAttribute("yjmdIncomePage", yjmdIncome);
		}
		return new ModelAndView("com/jeecg/destiny.income/yjmdIncome-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","yjmdIncomeController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(YjmdIncomeEntity yjmdIncome,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(YjmdIncomeEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, yjmdIncome, request.getParameterMap());
		List<YjmdIncomeEntity> yjmdIncomes = this.yjmdIncomeService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"收入表");
		modelMap.put(NormalExcelConstants.CLASS,YjmdIncomeEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("收入表列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,yjmdIncomes);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(YjmdIncomeEntity yjmdIncome,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"收入表");
    	modelMap.put(NormalExcelConstants.CLASS,YjmdIncomeEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("收入表列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
    	"导出信息"));
    	modelMap.put(NormalExcelConstants.DATA_LIST,new ArrayList());
    	return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(params = "importExcel", method = RequestMethod.POST)
	@ResponseBody
	public AjaxJson importExcel(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson j = new AjaxJson();
		
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile file = entity.getValue();// 获取上传文件对象
			ImportParams params = new ImportParams();
			params.setTitleRows(2);
			params.setHeadRows(1);
			params.setNeedSave(true);
			try {
				List<YjmdIncomeEntity> listYjmdIncomeEntitys = ExcelImportUtil.importExcel(file.getInputStream(),YjmdIncomeEntity.class,params);
				for (YjmdIncomeEntity yjmdIncome : listYjmdIncomeEntitys) {
					yjmdIncomeService.save(yjmdIncome);
				}
				j.setMsg("文件导入成功！");
			} catch (Exception e) {
				j.setMsg("文件导入失败！");
				logger.error(e.getMessage());
			}finally{
				try {
					file.getInputStream().close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return j;
	}
	
	
}

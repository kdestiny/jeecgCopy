package com.jeecg.destiny.student.controller;
import com.jeecg.destiny.income.entity.YjmdIncomeEntity;
import com.jeecg.destiny.income.service.YjmdIncomeServiceI;
import com.jeecg.destiny.student.entity.YjmdStudentEntity;
import com.jeecg.destiny.student.service.YjmdStudentServiceI;
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
 * @Description: 报班学生表
 * @author onlineGenerator
 * @date 2019-03-20 22:38:32
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/yjmdStudentController")
public class YjmdStudentController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(YjmdStudentController.class);

	@Autowired
	private YjmdStudentServiceI yjmdStudentService;
	@Autowired
	private YjmdIncomeServiceI yjmdIncomeServiceI;
	@Autowired
	private SystemService systemService;
	


	/**
	 * 报班学生表列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/destiny.student/yjmdStudentList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(YjmdStudentEntity yjmdStudent,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(YjmdStudentEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, yjmdStudent, request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.yjmdStudentService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除报班学生表
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(YjmdStudentEntity yjmdStudent, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		yjmdStudent = systemService.getEntity(YjmdStudentEntity.class, yjmdStudent.getId());
		message = "报班学生表删除成功";
		try{
			yjmdStudentService.delete(yjmdStudent);
			YjmdIncomeEntity yjmdIncomeEntity = systemService.findUniqueByProperty(YjmdIncomeEntity.class, "stu_id", yjmdStudent.getId());
			yjmdIncomeServiceI.delete(yjmdIncomeEntity);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "报班学生表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除报班学生表
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "报班学生表删除成功";
		try{
			for(String id:ids.split(",")){
				YjmdStudentEntity yjmdStudent = systemService.getEntity(YjmdStudentEntity.class, 
				id
				);
				yjmdStudentService.delete(yjmdStudent);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "报班学生表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加报班学生表
	 * 
	 * @param
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(YjmdStudentEntity yjmdStudent, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "报班学生表添加成功";
		try{
			yjmdStudentService.save(yjmdStudent);
			YjmdIncomeEntity yjmdIncomeEntity = new YjmdIncomeEntity();
			updateIncomeWithStudent(yjmdIncomeEntity, yjmdStudent);
			yjmdIncomeServiceI.save(yjmdIncomeEntity);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "报班学生表添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新报班学生表
	 * 
	 * @param
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(YjmdStudentEntity yjmdStudent, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "报班学生表更新成功";
		YjmdStudentEntity t = yjmdStudentService.get(YjmdStudentEntity.class, yjmdStudent.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(yjmdStudent, t);
			yjmdStudentService.saveOrUpdate(t);
			YjmdIncomeEntity yjmdIncomeEntity = systemService.findUniqueByProperty(YjmdIncomeEntity.class, "stu_id", yjmdStudent.getId());
			updateIncomeWithStudent(yjmdIncomeEntity, yjmdStudent);
			yjmdIncomeServiceI.saveOrUpdate(yjmdIncomeEntity);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "报班学生表更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 报班学生表新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(YjmdStudentEntity yjmdStudent, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(yjmdStudent.getId())) {
			yjmdStudent = yjmdStudentService.getEntity(YjmdStudentEntity.class, yjmdStudent.getId());
			req.setAttribute("yjmdStudentPage", yjmdStudent);
		}
		return new ModelAndView("com/jeecg/destiny.student/yjmdStudent-add");
	}
	/**
	 * 报班学生表编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(YjmdStudentEntity yjmdStudent, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(yjmdStudent.getId())) {
			yjmdStudent = yjmdStudentService.getEntity(YjmdStudentEntity.class, yjmdStudent.getId());
			req.setAttribute("yjmdStudentPage", yjmdStudent);
		}
		return new ModelAndView("com/jeecg/destiny.student/yjmdStudent-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","yjmdStudentController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(YjmdStudentEntity yjmdStudent,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(YjmdStudentEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, yjmdStudent, request.getParameterMap());
		List<YjmdStudentEntity> yjmdStudents = this.yjmdStudentService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"报班学生表");
		modelMap.put(NormalExcelConstants.CLASS,YjmdStudentEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("报班学生表列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,yjmdStudents);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(YjmdStudentEntity yjmdStudent,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"报班学生表");
    	modelMap.put(NormalExcelConstants.CLASS,YjmdStudentEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("报班学生表列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
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
				List<YjmdStudentEntity> listYjmdStudentEntitys = ExcelImportUtil.importExcel(file.getInputStream(),YjmdStudentEntity.class,params);
				for (YjmdStudentEntity yjmdStudent : listYjmdStudentEntitys) {
					yjmdStudentService.save(yjmdStudent);
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

	private YjmdIncomeEntity updateIncomeWithStudent(YjmdIncomeEntity yjmdIncomeEntity, YjmdStudentEntity yjmdStudentEntity) {
		yjmdIncomeEntity.setStuId(yjmdStudentEntity.getId());
		yjmdIncomeEntity.setClassType(yjmdStudentEntity.getClassType());
		yjmdIncomeEntity.setQqCode(yjmdStudentEntity.getQqCode());
		yjmdIncomeEntity.setIsAbandon(yjmdStudentEntity.getIsAbandon());
		yjmdIncomeEntity.setSignUpTime(yjmdStudentEntity.getSignUpTime());
		yjmdIncomeEntity.setStuCode(yjmdStudentEntity.getStuCode());
		yjmdIncomeEntity.setStuMajor(yjmdStudentEntity.getStuMajor());
		yjmdIncomeEntity.setStuName(yjmdStudentEntity.getStuName());
		yjmdIncomeEntity.setReturnFund(yjmdStudentEntity.getReturnFund());
		return yjmdIncomeEntity;
	}
	
	
}

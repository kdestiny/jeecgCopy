<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="yjmdIncomeList" checkbox="false" pagination="true" fitColumns="true" title="收入表" sortName="createDate" actionUrl="yjmdIncomeController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人名称"  field="createName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人登录名称"  field="createBy"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建日期"  field="createDate"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人名称"  field="updateName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人登录名称"  field="updateBy"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新日期"  field="updateDate"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属部门"  field="sysOrgCode"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属公司"  field="sysCompanyCode"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="流程状态"  field="bpmStatus"  hidden="true"  queryMode="single"  dictionary="bpm_status"  width="120"></t:dgCol>
   <t:dgCol title="qq号"  field="qqCode" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="姓名"  field="stuName"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="专业"  field="stuMajor" query="true"  queryMode="single"  dictionary="stu_major"  width="120"></t:dgCol>
   <t:dgCol title="班型"  field="classType"  query="true"  queryMode="single"  dictionary="class_type"  width="120"></t:dgCol>
   <t:dgCol title="报名时间"  field="signUpTime"  hidden="true" query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="退课"  field="isAbandon"  query="true"  queryMode="single"  dictionary="yes_or_no"  width="120"></t:dgCol>
   <t:dgCol title="退还学费"  field="returnFund" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="学号"  field="stuCode" hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="电话号码"  field="phoneNum"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="授课班学费"  field="teachFund"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="社群班学费"  field="groupFund"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="推荐费"  field="recommendFund"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="推荐人"  field="recommenderName"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="销售人员"  field="salerName"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="销售提成"  field="salerPercentage"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="其他费用"  field="otherFund"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="是否分期"  field="isRepay"  queryMode="single"  dictionary="yes_or_no"  width="120"></t:dgCol>
   <t:dgCol title="分期数"  field="repayInterval"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="备注"  field="remark"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预留字段1"  field="reserveData1"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预留字段2"  field="reserveData2"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预留字段3"  field="reserveData3"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预留字段4"  field="reserveData4"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预留字段5"  field="reserveData5"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预留字段6"  field="reserveData6"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预留字段7"  field="reserveData7"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预留字段8"  field="reserveData8"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预留字段9"  field="reserveData9"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预留字段10"  field="reserveData10"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="学生id"  field="stuId" hidden="true" queryMode="single"  width="120"></t:dgCol>
	<t:dgToolBar title="编辑" icon="icon-edit" url="yjmdIncomeController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="yjmdIncomeController.do?goUpdate" funname="detail"></t:dgToolBar>
   <%--
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="yjmdIncomeController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="yjmdIncomeController.do?goAdd" funname="add"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="yjmdIncomeController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar> --%>
  </t:datagrid>
  </div>
 </div>
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'yjmdIncomeController.do?upload', "yjmdIncomeList");
}

//导出
function ExportXls() {
	JeecgExcelExport("yjmdIncomeController.do?exportXls","yjmdIncomeList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("yjmdIncomeController.do?exportXlsByT","yjmdIncomeList");
}

 </script>

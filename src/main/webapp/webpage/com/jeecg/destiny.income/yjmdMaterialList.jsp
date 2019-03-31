<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="yjmdMaterialList" checkbox="false" pagination="true" fitColumns="true" title="物资表" sortName="createDate" actionUrl="yjmdMaterialController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="主键"  field="id"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人名称"  field="createName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建人登录名称"  field="createBy"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="创建日期"  field="createDate"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人名称"  field="updateName"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新人登录名称"  field="updateBy"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="更新日期"  field="updateDate"  formatter="yyyy-MM-dd"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属部门"  field="sysOrgCode"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="所属公司"  field="sysCompanyCode"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="流程状态"  field="bpmStatus"  queryMode="single"  dictionary="bpm_status"  width="120"></t:dgCol>
   <t:dgCol title="序号"  field="sequenceNum"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="物资名称"  field="name"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="用途"  field="purpose"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="购买渠道"  field="buyWay"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="使用方式"  field="useWay"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="账户"  field="mAccount"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="密码"  field="mPassword"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="使用人"  field="usePerson"  query="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="是否多人使用"  field="isMultiPerson"  query="true"  queryMode="single"  dictionary="yes_or_no"  width="120"></t:dgCol>
   <t:dgCol title="使用期限"  field="useDate"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="费用"  field="amount"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="购买时间"  field="buyTime"  formatter="yyyy-MM-dd"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="备注"  field="remark"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预留字段1"  field="reserveData1"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预留字段2"  field="reserveData2"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预留字段3"  field="reserveData3"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预留字段4"  field="reserveData4"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预留字段5"  field="reserveData5"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预留字段6"  field="reserveData6"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预留字段7"  field="reserveData7"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="预留字段8"  field="reserveData8"  hidden="true"  queryMode="single"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="yjmdMaterialController.do?doDel&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="yjmdMaterialController.do?goAdd" funname="add"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="yjmdMaterialController.do?goUpdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="yjmdMaterialController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="yjmdMaterialController.do?goUpdate" funname="detail"></t:dgToolBar>
   <t:dgToolBar title="导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
   <t:dgToolBar title="模板下载" icon="icon-putout" funname="ExportXlsByT"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script type="text/javascript">
 $(document).ready(function(){
 });
 
   
 
//导入
function ImportXls() {
	openuploadwin('Excel导入', 'yjmdMaterialController.do?upload', "yjmdMaterialList");
}

//导出
function ExportXls() {
	JeecgExcelExport("yjmdMaterialController.do?exportXls","yjmdMaterialList");
}

//模板下载
function ExportXlsByT() {
	JeecgExcelExport("yjmdMaterialController.do?exportXlsByT","yjmdMaterialList");
}

 </script>

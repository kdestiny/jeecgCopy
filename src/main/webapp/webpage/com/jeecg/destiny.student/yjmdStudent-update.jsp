<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>报班学生表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="yjmdStudentController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${yjmdStudentPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								序号:
							</label>
						</td>
						<td class="value">
						    <input id="seqNum" name="seqNum" type="text" maxlength="36" style="width: 150px" class="inputxt"  datatype="n"  ignore="ignore"  value='${yjmdStudentPage.seqNum}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">序号</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								qq号:
							</label>
						</td>
						<td class="value">
						    <input id="qqCode" name="qqCode" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${yjmdStudentPage.qqCode}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">qq号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								姓名:
							</label>
						</td>
						<td class="value">
						    <input id="stuName" name="stuName" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="checked"  value='${yjmdStudentPage.stuName}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">姓名</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								学号:
							</label>
						</td>
						<td class="value">
						    <input id="stuCode" name="stuCode" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${yjmdStudentPage.stuCode}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">学号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								专业:
							</label>
						</td>
						<td class="value">
							<t:dictSelect field="stuMajor" type="list"  typeGroupCode="stu_major"  defaultVal="${yjmdStudentPage.stuMajor}" hasLabel="false"  title="专业" ></t:dictSelect>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">专业</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								班型:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="classType" type="list"  typeGroupCode="class_type"   defaultVal="${yjmdStudentPage.classType}" hasLabel="false"  title="班型" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">班型</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								报名时间:
							</label>
						</td>
						<td class="value">
									  <input id="signUpTime" name="signUpTime" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${yjmdStudentPage.signUpTime}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">报名时间</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								报名年份:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="signUpYear" type="list"  typeGroupCode="year_code"   defaultVal="${yjmdStudentPage.signUpYear}" hasLabel="false"  title="报名年份" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">报名年份</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								报名月份:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="signUpMonth" type="list"  typeGroupCode="month_code"   defaultVal="${yjmdStudentPage.signUpMonth}" hasLabel="false"  title="报名月份" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">报名月份</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								退课:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="isAbandon" type="list"  typeGroupCode="yes_or_no"   defaultVal="${yjmdStudentPage.isAbandon}" hasLabel="false"  title="退课" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">退课</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								退还学费:
							</label>
						</td>
						<td class="value">
						    <input id="returnFund" name="returnFund" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${yjmdStudentPage.returnFund}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">退还学费</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								备注:
							</label>
						</td>
						<td class="value">
						    <input id="remark" name="remark" type="text" maxlength="255" style="width: 150px" class="inputxt"  ignore="ignore"  value='${yjmdStudentPage.remark}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>

<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>资料售卖表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="yjmdProfileSaleController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${yjmdProfileSalePage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								序号:
							</label>
						</td>
						<td class="value">
						    <input id="sequenceNum" name="sequenceNum" type="text" maxlength="36" style="width: 150px" class="inputxt"  datatype="n"  ignore="ignore"  value='${yjmdProfileSalePage.sequenceNum}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">序号</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								qq号:
							</label>
						</td>
						<td class="value">
						    <input id="qqCode" name="qqCode" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${yjmdProfileSalePage.qqCode}'/>
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
						    <input id="name" name="name" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${yjmdProfileSalePage.name}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">姓名</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								购买时间:
							</label>
						</td>
						<td class="value">
									  <input id="buyTime" name="buyTime" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${yjmdProfileSalePage.buyTime}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">购买时间</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								年度:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="year" type="list"  typeGroupCode="year_code"   defaultVal="${yjmdProfileSalePage.year}" hasLabel="false"  title="年度" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">年度</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								月份:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="month" type="list"  typeGroupCode="month_code"   defaultVal="${yjmdProfileSalePage.month}" hasLabel="false"  title="月份" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">月份</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								专业:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="major" type="list"  typeGroupCode="stu_major"   defaultVal="${yjmdProfileSalePage.major}" hasLabel="false"  title="专业" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">专业</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								资料:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="profile" type="list"  typeGroupCode="prof_type"   defaultVal="${yjmdProfileSalePage.profile}" hasLabel="false"  title="资料" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">资料</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								金额:
							</label>
						</td>
						<td class="value">
						    <input id="amount" name="amount" type="text" maxlength="20" style="width: 150px" class="inputxt"  ignore="ignore"  value='${yjmdProfileSalePage.amount}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">金额</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								推荐人:
							</label>
						</td>
						<td class="value">
						    <input id="recommendPerson" name="recommendPerson" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${yjmdProfileSalePage.recommendPerson}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">推荐人</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								推荐费:
							</label>
						</td>
						<td class="value">
						    <input id="recommendAmount" name="recommendAmount" type="text" maxlength="20" style="width: 150px" class="inputxt"  ignore="ignore"  value='${yjmdProfileSalePage.recommendAmount}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">推荐费</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								备注:
							</label>
						</td>
						<td class="value">
						    <input id="remark" name="remark" type="text" maxlength="255" style="width: 150px" class="inputxt"  ignore="ignore"  value='${yjmdProfileSalePage.remark}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>

<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>物资表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="yjmdMaterialController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${yjmdMaterialPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								序号:
							</label>
						</td>
						<td class="value">
						    <input id="sequenceNum" name="sequenceNum" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${yjmdMaterialPage.sequenceNum}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">序号</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								物资名称:
							</label>
						</td>
						<td class="value">
						    <input id="name" name="name" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${yjmdMaterialPage.name}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">物资名称</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								用途:
							</label>
						</td>
						<td class="value">
						    <input id="purpose" name="purpose" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${yjmdMaterialPage.purpose}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">用途</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								购买渠道:
							</label>
						</td>
						<td class="value">
						    <input id="buyWay" name="buyWay" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${yjmdMaterialPage.buyWay}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">购买渠道</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								使用方式:
							</label>
						</td>
						<td class="value">
						    <input id="useWay" name="useWay" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${yjmdMaterialPage.useWay}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">使用方式</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								账户:
							</label>
						</td>
						<td class="value">
						    <input id="mAccount" name="mAccount" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${yjmdMaterialPage.mAccount}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">账户</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								密码:
							</label>
						</td>
						<td class="value">
						    <input id="mPassword" name="mPassword" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${yjmdMaterialPage.mPassword}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">密码</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								使用人:
							</label>
						</td>
						<td class="value">
						    <input id="usePerson" name="usePerson" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${yjmdMaterialPage.usePerson}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">使用人</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								是否多人使用:
							</label>
						</td>
						<td class="value">
									<t:dictSelect field="isMultiPerson" type="list"  typeGroupCode="yes_or_no"   defaultVal="${yjmdMaterialPage.isMultiPerson}" hasLabel="false"  title="是否多人使用" ></t:dictSelect>     
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">是否多人使用</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								使用期限:
							</label>
						</td>
						<td class="value">
						    <input id="useDate" name="useDate" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${yjmdMaterialPage.useDate}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">使用期限</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								费用:
							</label>
						</td>
						<td class="value">
						    <input id="amount" name="amount" type="text" maxlength="50" style="width: 150px" class="inputxt"  ignore="ignore"  value='${yjmdMaterialPage.amount}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">费用</label>
						</td>
						<td align="right">
							<label class="Validform_label">
								购买时间:
							</label>
						</td>
						<td class="value">
									  <input id="buyTime" name="buyTime" type="text" style="width: 150px"  class="Wdate" onClick="WdatePicker()"  ignore="ignore" value='<fmt:formatDate value='${yjmdMaterialPage.buyTime}' type="date" pattern="yyyy-MM-dd"/>'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">购买时间</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								备注:
							</label>
						</td>
						<td class="value">
						    <input id="remark" name="remark" type="text" maxlength="255" style="width: 150px" class="inputxt"  ignore="ignore"  value='${yjmdMaterialPage.remark}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">备注</label>
						</td>
				<td align="right">
					<label class="Validform_label">
					</label>
				</td>
				<td class="value">
				</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>

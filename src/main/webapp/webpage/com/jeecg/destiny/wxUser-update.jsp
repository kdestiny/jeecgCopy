<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>微信用户表</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //编写自定义JS代码
  </script>
 </head>
 <body>
		<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="wxUserController.do?doUpdate" >
					<input id="id" name="id" type="hidden" value="${wxUserPage.id }"/>
		<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
					<tr>
						<td align="right">
							<label class="Validform_label">
								微信号:
							</label>
						</td>
						<td class="value">
						    <input id="wxCode" name="wxCode" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${wxUserPage.wxCode}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">微信号</label>
						</td>
					</tr>
					<tr>
						<td align="right">
							<label class="Validform_label">
								qq号:
							</label>
						</td>
						<td class="value">
						    <input id="qqCode" name="qqCode" type="text" maxlength="32" style="width: 150px" class="inputxt"  ignore="ignore"  value='${wxUserPage.qqCode}'/>
							<span class="Validform_checktip"></span>
							<label class="Validform_label" style="display: none;">qq号</label>
						</td>
					</tr>
				
			</table>
		</t:formvalid>
 </body>

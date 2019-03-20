<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/context/mytags.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>收入表</title>
    <t:base type="jquery,easyui,tools,DatePicker"></t:base>
    <script type="text/javascript">
        //编写自定义JS代码
    </script>
</head>
<body>
<t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table"
             action="yjmdIncomeController.do?doUpdate">
    <input id="id" name="id" type="hidden" value="${yjmdIncomePage.id }"/>
    <table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
        <tr>
            <td align="right">
                <label class="Validform_label">
                    qq号:
                </label>
            </td>
            <td class="value">
                <input id="qqCode" name="qqCode" type="text" maxlength="50" style="width: 150px"
                       class="inputxt" ignore="ignore" readonly="readonly" value='${yjmdIncomePage.qqCode}'/>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">qq号</label>
            </td>
            <td align="right">
                <label class="Validform_label">
                    姓名:
                </label>
            </td>
            <td class="value">
                <input id="stuName" name="stuName" type="text" maxlength="50" style="width: 150px"
                       class="inputxt" ignore="ignore" readonly="readonly" value='${yjmdIncomePage.stuName}'/>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">姓名</label>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">
                    专业:
                </label>
            </td>
            <td class="value">
                <t:dictSelect field="stuMajor" type="list" readonly="readonly"  typeGroupCode="stu_major"  defaultVal="${yjmdIncomePage.stuMajor}" hasLabel="false"  title="专业" ></t:dictSelect>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">专业</label>
            </td>
            <td align="right">
                <label class="Validform_label">
                    班型:
                </label>
            </td>
            <td class="value">
                <t:dictSelect field="classType" type="list" readonly="readonly"  typeGroupCode="class_type"   defaultVal="${yjmdIncomePage.classType}" hasLabel="false"  title="班型" ></t:dictSelect>
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
                <input id="signUpTime" name="signUpTime" type="text" maxlength="20"
                       style="width: 150px" class="inputxt" ignore="ignore" readonly="readonly"
                       value='${yjmdIncomePage.signUpTime}'/>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">报名时间</label>
            </td>
            <td align="right">
                <label class="Validform_label">
                    退课:
                </label>
            </td>
            <td class="value">
                <t:dictSelect field="isAbandon" type="list"  readonly="readonly" typeGroupCode="yes_or_no"   defaultVal="${yjmdIncomePage.isAbandon}" hasLabel="false"  title="退课" ></t:dictSelect>
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
                <input id="returnFund" name="returnFund" type="text" maxlength="50"
                       style="width: 150px" class="inputxt"  readonly="readonly" ignore="ignore"
                       value='${yjmdIncomePage.returnFund}'/>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">退还学费</label>
            </td>
            <td align="right">
                <label class="Validform_label">
                    学号:
                </label>
            </td>
            <td class="value">
                <input id="stuCode" name="stuCode" type="text" maxlength="50" style="width: 150px"
                       class="inputxt" ignore="ignore" readonly="readonly" value='${yjmdIncomePage.stuCode}'/>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">学号</label>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">
                    电话号码:
                </label>
            </td>
            <td class="value">
                <input id="phoneNum" name="phoneNum" type="text" maxlength="50" style="width: 150px"
                       class="inputxt" ignore="ignore" value='${yjmdIncomePage.phoneNum}'/>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">电话号码</label>
            </td>
            <td align="right">
                <label class="Validform_label">
                    授课班学费:
                </label>
            </td>
            <td class="value">
                <input id="teachFund" name="teachFund" type="text" maxlength="16"
                       style="width: 150px" class="inputxt" ignore="ignore"
                       value='${yjmdIncomePage.teachFund}'/>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">授课班学费</label>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">
                    社群班学费:
                </label>
            </td>
            <td class="value">
                <input id="groupFund" name="groupFund" type="text" maxlength="16"
                       style="width: 150px" class="inputxt" ignore="ignore"
                       value='${yjmdIncomePage.groupFund}'/>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">社群班学费</label>
            </td>
            <td align="right">
                <label class="Validform_label">
                    推荐费:
                </label>
            </td>
            <td class="value">
                <input id="recommendFund" name="recommendFund" type="text" maxlength="16"
                       style="width: 150px" class="inputxt" ignore="ignore"
                       value='${yjmdIncomePage.recommendFund}'/>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">推荐费</label>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">
                    推荐人:
                </label>
            </td>
            <td class="value">
                <input id="recommenderName" name="recommenderName" type="text" maxlength="50"
                       style="width: 150px" class="inputxt" ignore="ignore"
                       value='${yjmdIncomePage.recommenderName}'/>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">推荐人</label>
            </td>
            <td align="right">
                <label class="Validform_label">
                    销售人员:
                </label>
            </td>
            <td class="value">
                <input id="salerName" name="salerName" type="text" maxlength="50"
                       style="width: 150px" class="inputxt" ignore="ignore"
                       value='${yjmdIncomePage.salerName}'/>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">销售人员</label>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">
                    销售提成:
                </label>
            </td>
            <td class="value">
                <input id="salerPercentage" name="salerPercentage" type="text" maxlength="16"
                       style="width: 150px" class="inputxt" ignore="ignore"
                       value='${yjmdIncomePage.salerPercentage}'/>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">销售提成</label>
            </td>
            <td align="right">
                <label class="Validform_label">
                    其他费用:
                </label>
            </td>
            <td class="value">
                <input id="otherFund" name="otherFund" type="text" maxlength="16"
                       style="width: 150px" class="inputxt" ignore="ignore"
                       value='${yjmdIncomePage.otherFund}'/>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">其他费用</label>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">
                    是否分期:
                </label>
            </td>
            <td class="value">
                <t:dictSelect field="isRepay" type="list" typeGroupCode="yes_or_no"
                              defaultVal="${yjmdIncomePage.isRepay}" hasLabel="false"
                              title="是否分期"></t:dictSelect>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">是否分期</label>
            </td>
            <td align="right">
                <label class="Validform_label">
                    分期数:
                </label>
            </td>
            <td class="value">
                <input id="repayInterval" name="repayInterval" type="text" maxlength="32"
                       style="width: 150px" class="inputxt" datatype="n" ignore="ignore"
                       value='${yjmdIncomePage.repayInterval}'/>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">分期数</label>
            </td>
        </tr>
        <tr>
            <td align="right">
                <label class="Validform_label">
                    备注:
                </label>
            </td>
            <td class="value">
                <input id="remark" name="remark" type="text" maxlength="256" style="width: 150px"
                       class="inputxt" ignore="ignore" value='${yjmdIncomePage.remark}'/>
                <span class="Validform_checktip"></span>
                <label class="Validform_label" style="display: none;">备注</label>
            </td>

        </tr>


    </table>
</t:formvalid>
</body>

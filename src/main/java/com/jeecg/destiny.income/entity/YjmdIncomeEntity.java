package com.jeecg.destiny.income.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity
 * @Description: 收入表
 * @author onlineGenerator
 * @date 2019-03-20 23:28:22
 * @version V1.0   
 *
 */
@Entity
@Table(name = "yjmd_income", schema = "")
@SuppressWarnings("serial")
public class YjmdIncomeEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**创建人名称*/
	private java.lang.String createName;
	/**创建人登录名称*/
	private java.lang.String createBy;
	/**创建日期*/
	private java.util.Date createDate;
	/**更新人名称*/
	private java.lang.String updateName;
	/**更新人登录名称*/
	private java.lang.String updateBy;
	/**更新日期*/
	private java.util.Date updateDate;
	/**所属部门*/
	private java.lang.String sysOrgCode;
	/**所属公司*/
	private java.lang.String sysCompanyCode;
	/**流程状态*/
	private java.lang.String bpmStatus;
	/**电话号码*/
	@Excel(name="电话号码",width=15)
	private java.lang.String phoneNum;
	/**授课班学费*/
	@Excel(name="授课班学费",width=15)
	private java.math.BigDecimal teachFund;
	/**社群班学费*/
	@Excel(name="社群班学费",width=15)
	private java.math.BigDecimal groupFund;
	/**推荐费*/
	@Excel(name="推荐费",width=15)
	private java.math.BigDecimal recommendFund;
	/**推荐人*/
	@Excel(name="推荐人",width=15)
	private java.lang.String recommenderName;
	/**销售人员*/
	@Excel(name="销售人员",width=15)
	private java.lang.String salerName;
	/**销售提成*/
	@Excel(name="销售提成",width=15)
	private java.math.BigDecimal salerPercentage;
	/**其他费用*/
	@Excel(name="其他费用",width=15)
	private java.math.BigDecimal otherFund;
	/**是否分期*/
	@Excel(name="是否分期",width=15,dicCode="yes_or_no")
	private java.lang.String isRepay;
	/**分期数*/
	@Excel(name="分期数",width=15)
	private java.lang.Integer repayInterval;
	/**备注*/
	@Excel(name="备注",width=15)
	private java.lang.String remark;
	/**预留字段1*/
	private java.lang.String reserveData1;
	/**预留字段2*/
	private java.lang.String reserveData2;
	/**预留字段3*/
	private java.lang.String reserveData3;
	/**预留字段4*/
	private java.lang.String reserveData4;
	/**预留字段5*/
	private java.lang.String reserveData5;
	/**预留字段6*/
	private java.lang.String reserveData6;
	/**预留字段7*/
	private java.lang.String reserveData7;
	/**预留字段8*/
	private java.lang.String reserveData8;
	/**预留字段9*/
	private java.lang.String reserveData9;
	/**预留字段10*/
	private java.lang.String reserveData10;
	/**学生id*/
	@Excel(name="学生id",width=15)
	private java.lang.String stuId;
	/**qq号*/
	@Excel(name="qq号",width=15)
	private java.lang.String qqCode;
	/**姓名*/
	@Excel(name="姓名",width=15)
	private java.lang.String stuName;
	/**专业*/
	@Excel(name="专业",width=15,dicCode="stu_major")
	private java.lang.String stuMajor;
	/**班型*/
	@Excel(name="班型",width=15,dicCode="class_type")
	private java.lang.String classType;
	/**报名时间*/
	@Excel(name="报名时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date signUpTime;
	/**退课*/
	@Excel(name="退课",width=15,dicCode="yes_or_no")
	private java.lang.String isAbandon;
	/**退还学费*/
	@Excel(name="退还学费",width=15)
	private java.lang.String returnFund;
	/**学号*/
	@Excel(name="学号",width=15)
	private java.lang.String stuCode;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")

	@Column(name ="ID",nullable=false,length=36)
	public java.lang.String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主键
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人名称
	 */

	@Column(name ="CREATE_NAME",nullable=true,length=50)
	public java.lang.String getCreateName(){
		return this.createName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人名称
	 */
	public void setCreateName(java.lang.String createName){
		this.createName = createName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人登录名称
	 */

	@Column(name ="CREATE_BY",nullable=true,length=50)
	public java.lang.String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人登录名称
	 */
	public void setCreateBy(java.lang.String createBy){
		this.createBy = createBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建日期
	 */

	@Column(name ="CREATE_DATE",nullable=true,length=20)
	public java.util.Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建日期
	 */
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人名称
	 */

	@Column(name ="UPDATE_NAME",nullable=true,length=50)
	public java.lang.String getUpdateName(){
		return this.updateName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人名称
	 */
	public void setUpdateName(java.lang.String updateName){
		this.updateName = updateName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人登录名称
	 */

	@Column(name ="UPDATE_BY",nullable=true,length=50)
	public java.lang.String getUpdateBy(){
		return this.updateBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人登录名称
	 */
	public void setUpdateBy(java.lang.String updateBy){
		this.updateBy = updateBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  更新日期
	 */

	@Column(name ="UPDATE_DATE",nullable=true,length=20)
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  更新日期
	 */
	public void setUpdateDate(java.util.Date updateDate){
		this.updateDate = updateDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属部门
	 */

	@Column(name ="SYS_ORG_CODE",nullable=true,length=50)
	public java.lang.String getSysOrgCode(){
		return this.sysOrgCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属部门
	 */
	public void setSysOrgCode(java.lang.String sysOrgCode){
		this.sysOrgCode = sysOrgCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属公司
	 */

	@Column(name ="SYS_COMPANY_CODE",nullable=true,length=50)
	public java.lang.String getSysCompanyCode(){
		return this.sysCompanyCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属公司
	 */
	public void setSysCompanyCode(java.lang.String sysCompanyCode){
		this.sysCompanyCode = sysCompanyCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  流程状态
	 */

	@Column(name ="BPM_STATUS",nullable=true,length=32)
	public java.lang.String getBpmStatus(){
		return this.bpmStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  流程状态
	 */
	public void setBpmStatus(java.lang.String bpmStatus){
		this.bpmStatus = bpmStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  电话号码
	 */

	@Column(name ="PHONE_NUM",nullable=true,length=50)
	public java.lang.String getPhoneNum(){
		return this.phoneNum;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  电话号码
	 */
	public void setPhoneNum(java.lang.String phoneNum){
		this.phoneNum = phoneNum;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  授课班学费
	 */

	@Column(name ="TEACH_FUND",nullable=true,scale=2,length=16)
	public java.math.BigDecimal getTeachFund(){
		return this.teachFund;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  授课班学费
	 */
	public void setTeachFund(java.math.BigDecimal teachFund){
		this.teachFund = teachFund;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  社群班学费
	 */

	@Column(name ="GROUP_FUND",nullable=true,scale=2,length=16)
	public java.math.BigDecimal getGroupFund(){
		return this.groupFund;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  社群班学费
	 */
	public void setGroupFund(java.math.BigDecimal groupFund){
		this.groupFund = groupFund;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  推荐费
	 */

	@Column(name ="RECOMMEND_FUND",nullable=true,scale=2,length=16)
	public java.math.BigDecimal getRecommendFund(){
		return this.recommendFund;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  推荐费
	 */
	public void setRecommendFund(java.math.BigDecimal recommendFund){
		this.recommendFund = recommendFund;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  推荐人
	 */

	@Column(name ="RECOMMENDER_NAME",nullable=true,length=50)
	public java.lang.String getRecommenderName(){
		return this.recommenderName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  推荐人
	 */
	public void setRecommenderName(java.lang.String recommenderName){
		this.recommenderName = recommenderName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  销售人员
	 */

	@Column(name ="SALER_NAME",nullable=true,length=50)
	public java.lang.String getSalerName(){
		return this.salerName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  销售人员
	 */
	public void setSalerName(java.lang.String salerName){
		this.salerName = salerName;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  销售提成
	 */

	@Column(name ="SALER_PERCENTAGE",nullable=true,scale=2,length=16)
	public java.math.BigDecimal getSalerPercentage(){
		return this.salerPercentage;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  销售提成
	 */
	public void setSalerPercentage(java.math.BigDecimal salerPercentage){
		this.salerPercentage = salerPercentage;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  其他费用
	 */

	@Column(name ="OTHER_FUND",nullable=true,scale=2,length=16)
	public java.math.BigDecimal getOtherFund(){
		return this.otherFund;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  其他费用
	 */
	public void setOtherFund(java.math.BigDecimal otherFund){
		this.otherFund = otherFund;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否分期
	 */

	@Column(name ="IS_REPAY",nullable=true,length=32)
	public java.lang.String getIsRepay(){
		return this.isRepay;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否分期
	 */
	public void setIsRepay(java.lang.String isRepay){
		this.isRepay = isRepay;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  分期数
	 */

	@Column(name ="REPAY_INTERVAL",nullable=true,length=32)
	public java.lang.Integer getRepayInterval(){
		return this.repayInterval;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  分期数
	 */
	public void setRepayInterval(java.lang.Integer repayInterval){
		this.repayInterval = repayInterval;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	@Column(name ="REMARK",nullable=true,length=256)
	public java.lang.String getRemark(){
		return this.remark;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setRemark(java.lang.String remark){
		this.remark = remark;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  预留字段1
	 */

	@Column(name ="RESERVE_DATA1",nullable=true,length=50)
	public java.lang.String getReserveData1(){
		return this.reserveData1;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  预留字段1
	 */
	public void setReserveData1(java.lang.String reserveData1){
		this.reserveData1 = reserveData1;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  预留字段2
	 */

	@Column(name ="RESERVE_DATA2",nullable=true,length=50)
	public java.lang.String getReserveData2(){
		return this.reserveData2;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  预留字段2
	 */
	public void setReserveData2(java.lang.String reserveData2){
		this.reserveData2 = reserveData2;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  预留字段3
	 */

	@Column(name ="RESERVE_DATA3",nullable=true,length=50)
	public java.lang.String getReserveData3(){
		return this.reserveData3;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  预留字段3
	 */
	public void setReserveData3(java.lang.String reserveData3){
		this.reserveData3 = reserveData3;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  预留字段4
	 */

	@Column(name ="RESERVE_DATA4",nullable=true,length=50)
	public java.lang.String getReserveData4(){
		return this.reserveData4;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  预留字段4
	 */
	public void setReserveData4(java.lang.String reserveData4){
		this.reserveData4 = reserveData4;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  预留字段5
	 */

	@Column(name ="RESERVE_DATA5",nullable=true,length=50)
	public java.lang.String getReserveData5(){
		return this.reserveData5;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  预留字段5
	 */
	public void setReserveData5(java.lang.String reserveData5){
		this.reserveData5 = reserveData5;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  预留字段6
	 */

	@Column(name ="RESERVE_DATA6",nullable=true,length=50)
	public java.lang.String getReserveData6(){
		return this.reserveData6;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  预留字段6
	 */
	public void setReserveData6(java.lang.String reserveData6){
		this.reserveData6 = reserveData6;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  预留字段7
	 */

	@Column(name ="RESERVE_DATA7",nullable=true,length=50)
	public java.lang.String getReserveData7(){
		return this.reserveData7;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  预留字段7
	 */
	public void setReserveData7(java.lang.String reserveData7){
		this.reserveData7 = reserveData7;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  预留字段8
	 */

	@Column(name ="RESERVE_DATA8",nullable=true,length=50)
	public java.lang.String getReserveData8(){
		return this.reserveData8;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  预留字段8
	 */
	public void setReserveData8(java.lang.String reserveData8){
		this.reserveData8 = reserveData8;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  预留字段9
	 */

	@Column(name ="RESERVE_DATA9",nullable=true,length=50)
	public java.lang.String getReserveData9(){
		return this.reserveData9;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  预留字段9
	 */
	public void setReserveData9(java.lang.String reserveData9){
		this.reserveData9 = reserveData9;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  预留字段10
	 */

	@Column(name ="RESERVE_DATA10",nullable=true,length=50)
	public java.lang.String getReserveData10(){
		return this.reserveData10;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  预留字段10
	 */
	public void setReserveData10(java.lang.String reserveData10){
		this.reserveData10 = reserveData10;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  学生id
	 */

	@Column(name ="STU_ID",nullable=true,length=36)
	public java.lang.String getStuId(){
		return this.stuId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  学生id
	 */
	public void setStuId(java.lang.String stuId){
		this.stuId = stuId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  qq号
	 */

	@Column(name ="QQ_CODE",nullable=true,length=50)
	public java.lang.String getQqCode(){
		return this.qqCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  qq号
	 */
	public void setQqCode(java.lang.String qqCode){
		this.qqCode = qqCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  姓名
	 */

	@Column(name ="STU_NAME",nullable=true,length=50)
	public java.lang.String getStuName(){
		return this.stuName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  姓名
	 */
	public void setStuName(java.lang.String stuName){
		this.stuName = stuName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  专业
	 */

	@Column(name ="STU_MAJOR",nullable=true,length=50)
	public java.lang.String getStuMajor(){
		return this.stuMajor;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  专业
	 */
	public void setStuMajor(java.lang.String stuMajor){
		this.stuMajor = stuMajor;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  班型
	 */

	@Column(name ="CLASS_TYPE",nullable=true,length=50)
	public java.lang.String getClassType(){
		return this.classType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  班型
	 */
	public void setClassType(java.lang.String classType){
		this.classType = classType;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  报名时间
	 */

	@Column(name ="SIGN_UP_TIME",nullable=true,length=20)
	public java.util.Date getSignUpTime(){
		return this.signUpTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  报名时间
	 */
	public void setSignUpTime(java.util.Date signUpTime){
		this.signUpTime = signUpTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  退课
	 */

	@Column(name ="IS_ABANDON",nullable=true,length=50)
	public java.lang.String getIsAbandon(){
		return this.isAbandon;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  退课
	 */
	public void setIsAbandon(java.lang.String isAbandon){
		this.isAbandon = isAbandon;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  退还学费
	 */

	@Column(name ="RETURN_FUND",nullable=true,length=50)
	public java.lang.String getReturnFund(){
		return this.returnFund;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  退还学费
	 */
	public void setReturnFund(java.lang.String returnFund){
		this.returnFund = returnFund;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  学号
	 */

	@Column(name ="STU_CODE",nullable=true,length=50)
	public java.lang.String getStuCode(){
		return this.stuCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  学号
	 */
	public void setStuCode(java.lang.String stuCode){
		this.stuCode = stuCode;
	}
}

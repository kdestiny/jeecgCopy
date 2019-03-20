package com.jeecg.destiny.student.entity;

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
 * @Description: 报班学生表
 * @author onlineGenerator
 * @date 2019-03-20 22:38:32
 * @version V1.0   
 *
 */
@Entity
@Table(name = "yjmd_student", schema = "")
@SuppressWarnings("serial")
public class YjmdStudentEntity implements java.io.Serializable {
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
	/**序号*/
	@Excel(name="序号",width=15)
	private java.lang.Integer seqNum;
	/**qq号*/
	@Excel(name="qq号",width=15)
	private java.lang.String qqCode;
	/**姓名*/
	@Excel(name="姓名",width=15)
	private java.lang.String stuName;
	/**学号*/
	@Excel(name="学号",width=15)
	private java.lang.String stuCode;
	/**专业*/
	@Excel(name="专业",width=15,dicCode="stu_major")
	private java.lang.String stuMajor;
	/**班型*/
	@Excel(name="班型",width=15,dicCode="class_type")
	private java.lang.String classType;
	/**报名时间*/
	@Excel(name="报名时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date signUpTime;
	/**报名年份*/
	@Excel(name="报名年份",width=15,dicCode="year_code")
	private java.lang.String signUpYear;
	/**报名月份*/
	@Excel(name="报名月份",width=15,dicCode="month_code")
	private java.lang.String signUpMonth;
	/**退课*/
	@Excel(name="退课",width=15,dicCode="yes_or_no")
	private java.lang.String isAbandon;
	/**退还学费*/
	@Excel(name="退还学费",width=15)
	private java.lang.String returnFund;
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
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  序号
	 */

	@Column(name ="SEQ_NUM",nullable=true,length=36)
	public java.lang.Integer getSeqNum(){
		return this.seqNum;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  序号
	 */
	public void setSeqNum(java.lang.Integer seqNum){
		this.seqNum = seqNum;
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
	 *@return: java.lang.String  报名年份
	 */

	@Column(name ="SIGN_UP_YEAR",nullable=true,length=50)
	public java.lang.String getSignUpYear(){
		return this.signUpYear;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  报名年份
	 */
	public void setSignUpYear(java.lang.String signUpYear){
		this.signUpYear = signUpYear;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  报名月份
	 */

	@Column(name ="SIGN_UP_MONTH",nullable=true,length=50)
	public java.lang.String getSignUpMonth(){
		return this.signUpMonth;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  报名月份
	 */
	public void setSignUpMonth(java.lang.String signUpMonth){
		this.signUpMonth = signUpMonth;
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
	 *@return: java.lang.String  备注
	 */

	@Column(name ="REMARK",nullable=true,length=255)
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
}

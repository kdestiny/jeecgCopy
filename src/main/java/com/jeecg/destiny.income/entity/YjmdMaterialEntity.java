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
 * @Description: 物资表
 * @author onlineGenerator
 * @date 2019-03-31 16:20:56
 * @version V1.0   
 *
 */
@Entity
@Table(name = "yjmd_material", schema = "")
@SuppressWarnings("serial")
public class YjmdMaterialEntity implements java.io.Serializable {
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
	private java.lang.String sequenceNum;
	/**物资名称*/
	@Excel(name="物资名称",width=15)
	private java.lang.String name;
	/**用途*/
	@Excel(name="用途",width=15)
	private java.lang.String purpose;
	/**购买渠道*/
	@Excel(name="购买渠道",width=15)
	private java.lang.String buyWay;
	/**使用方式*/
	@Excel(name="使用方式",width=15)
	private java.lang.String useWay;
	/**账户*/
	@Excel(name="账户",width=15)
	private java.lang.String mAccount;
	/**密码*/
	@Excel(name="密码",width=15)
	private java.lang.String mPassword;
	/**使用人*/
	@Excel(name="使用人",width=15)
	private java.lang.String usePerson;
	/**是否多人使用*/
	@Excel(name="是否多人使用",width=15,dicCode="yes_or_no")
	private java.lang.String isMultiPerson;
	/**使用期限*/
	@Excel(name="使用期限",width=15)
	private java.lang.String useDate;
	/**费用*/
	@Excel(name="费用",width=15)
	private java.math.BigDecimal amount;
	/**购买时间*/
	@Excel(name="购买时间",width=15,format = "yyyy-MM-dd")
	private java.util.Date buyTime;
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
	 *@return: java.lang.String  序号
	 */

	@Column(name ="SEQUENCE_NUM",nullable=true,length=50)
	public java.lang.String getSequenceNum(){
		return this.sequenceNum;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  序号
	 */
	public void setSequenceNum(java.lang.String sequenceNum){
		this.sequenceNum = sequenceNum;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  物资名称
	 */

	@Column(name ="NAME",nullable=true,length=50)
	public java.lang.String getName(){
		return this.name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  物资名称
	 */
	public void setName(java.lang.String name){
		this.name = name;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  用途
	 */

	@Column(name ="PURPOSE",nullable=true,length=50)
	public java.lang.String getPurpose(){
		return this.purpose;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  用途
	 */
	public void setPurpose(java.lang.String purpose){
		this.purpose = purpose;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  购买渠道
	 */

	@Column(name ="BUY_WAY",nullable=true,length=50)
	public java.lang.String getBuyWay(){
		return this.buyWay;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  购买渠道
	 */
	public void setBuyWay(java.lang.String buyWay){
		this.buyWay = buyWay;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  使用方式
	 */

	@Column(name ="USE_WAY",nullable=true,length=50)
	public java.lang.String getUseWay(){
		return this.useWay;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  使用方式
	 */
	public void setUseWay(java.lang.String useWay){
		this.useWay = useWay;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  账户
	 */

	@Column(name ="M_ACCOUNT",nullable=true,length=50)
	public java.lang.String getMAccount(){
		return this.mAccount;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  账户
	 */
	public void setMAccount(java.lang.String mAccount){
		this.mAccount = mAccount;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  密码
	 */

	@Column(name ="M_PASSWORD",nullable=true,length=50)
	public java.lang.String getMPassword(){
		return this.mPassword;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  密码
	 */
	public void setMPassword(java.lang.String mPassword){
		this.mPassword = mPassword;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  使用人
	 */

	@Column(name ="USE_PERSON",nullable=true,length=50)
	public java.lang.String getUsePerson(){
		return this.usePerson;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  使用人
	 */
	public void setUsePerson(java.lang.String usePerson){
		this.usePerson = usePerson;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否多人使用
	 */

	@Column(name ="IS_MULTI_PERSON",nullable=true,length=32)
	public java.lang.String getIsMultiPerson(){
		return this.isMultiPerson;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否多人使用
	 */
	public void setIsMultiPerson(java.lang.String isMultiPerson){
		this.isMultiPerson = isMultiPerson;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  使用期限
	 */

	@Column(name ="USE_DATE",nullable=true,length=50)
	public java.lang.String getUseDate(){
		return this.useDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  使用期限
	 */
	public void setUseDate(java.lang.String useDate){
		this.useDate = useDate;
	}
	/**
	 *方法: 取得java.math.BigDecimal
	 *@return: java.math.BigDecimal  费用
	 */

	@Column(name ="AMOUNT",nullable=true,scale=2,length=50)
	public java.math.BigDecimal getAmount(){
		return this.amount;
	}

	/**
	 *方法: 设置java.math.BigDecimal
	 *@param: java.math.BigDecimal  费用
	 */
	public void setAmount(java.math.BigDecimal amount){
		this.amount = amount;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  购买时间
	 */

	@Column(name ="BUY_TIME",nullable=true,length=20)
	public java.util.Date getBuyTime(){
		return this.buyTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  购买时间
	 */
	public void setBuyTime(java.util.Date buyTime){
		this.buyTime = buyTime;
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
}

package com.zhidian3g.nextad.domain;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;



/**
 * InnoDB free: 160768 kB 实体 <br/>
 * 
 * @author xxh
 * @version 1.0 2014-08-18 14:51:10
 * @since JDK 1.5
 */
public class Ad {

	/**  */
	private Long id;

	/** 用户ID */
	private Long accountId;

	/** 广告名称 */
	private String name;

	/** 对象类型 */
	private Integer objectType;

	/** 关键字 */
	private String keyword;

	/** 描述 */
	private String description;

	/** 是否支持平板 */
	private Short isSupportPad;

	/** 显示类型 1、图片文字广告2、横幅图片广告3、文字广告 4、插播广告 5、积分墙广告*/
	private Short showType;

	/** 点击类型 */
	private Short clickType;

	/** 点击时的内容 */
	private String clickSite;

	/** 点击扩展字段 */
	private String apkSize;

	/** 包名 */
	private String packageName;

	/** 付费类型 
		1、  cpm按广告展示付费 （每千次展示付费金额）
		2、  cpc按广告点击付费 （单次点击付费金额）
		3、  cpa按广告效果付费 （单次效果付费金额） 
	 */
	private Short feeType;

	/** 出价金额 */
	private Double feeSum;

	/** 广告日预算 */
	private Integer dayBudget;

	/** 广告投放的日期 */
	private Date startDate;
	
	/** 广告投放的结束日期 */
	private Date endDate;
	
	/** 投放状态 */
	private Integer putInState;

	public Ad() {
		super();
	}

	/**
	 * 有效广告
	 * @param ad
	 * @return
	 */
	public static boolean isEffectiveAd(Ad ad) {
		if(ad != null && ad.getPutInState() == 2) return true;
		return false;
	}
	

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getObjectType() {
		return objectType;
	}

	public void setObjectType(Integer objectType) {
		this.objectType = objectType;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Short getFeeType() {
		return feeType;
	}

	public void setFeeType(Short feeType) {
		this.feeType = feeType;
	}

	public Short getIsSupportPad() {
		return isSupportPad;
	}

	public void setIsSupportPad(Short isSupportPad) {
		this.isSupportPad = isSupportPad;
	}

	public Short getShowType() {
		return showType;
	}

	public void setShowType(Short showType) {
		this.showType = showType;
	}

	public Short getClickType() {
		return clickType;
	}

	public void setClickType(Short clickType) {
		this.clickType = clickType;
	}

	public String getClickSite() {
		return clickSite;
	}

	public void setClickSite(String clickSite) {
		this.clickSite = clickSite;
	}

	public String getApkSize() {
		return apkSize;
	}

	public void setApkSize(String apkSize) {
		this.apkSize = apkSize;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	
	public Integer getPutInState() {
		return putInState;
	}

	public void setPutInState(Integer putInState) {
		this.putInState = putInState;
	}

	

	public Double getFeeSum() {
		return feeSum;
	}

	public void setFeeSum(Double feeSum) {
		this.feeSum = feeSum;
	}

	public Integer getDayBudget() {
		return dayBudget;
	}

	public void setDayBudget(Integer dayBudget) {
		this.dayBudget = dayBudget;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}

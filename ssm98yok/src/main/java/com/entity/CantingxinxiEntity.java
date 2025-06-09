package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 餐厅信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-25 10:23:22
 */
@TableName("cantingxinxi")
public class CantingxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CantingxinxiEntity() {
		
	}
	
	public CantingxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 餐厅名称
	 */
					
	private String cantingmingcheng;
	
	/**
	 * 餐厅类型
	 */
					
	private String cantingleixing;
	
	/**
	 * 餐厅图片
	 */
					
	private String cantingtupian;
	
	/**
	 * 配送时间
	 */
					
	private String peisongshijian;
	
	/**
	 * 配送服务
	 */
					
	private String peisongfuwu;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 餐厅地址
	 */
					
	private String cantingdizhi;
	
	/**
	 * 餐厅介绍
	 */
					
	private String cantingjieshao;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：餐厅名称
	 */
	public void setCantingmingcheng(String cantingmingcheng) {
		this.cantingmingcheng = cantingmingcheng;
	}
	/**
	 * 获取：餐厅名称
	 */
	public String getCantingmingcheng() {
		return cantingmingcheng;
	}
	/**
	 * 设置：餐厅类型
	 */
	public void setCantingleixing(String cantingleixing) {
		this.cantingleixing = cantingleixing;
	}
	/**
	 * 获取：餐厅类型
	 */
	public String getCantingleixing() {
		return cantingleixing;
	}
	/**
	 * 设置：餐厅图片
	 */
	public void setCantingtupian(String cantingtupian) {
		this.cantingtupian = cantingtupian;
	}
	/**
	 * 获取：餐厅图片
	 */
	public String getCantingtupian() {
		return cantingtupian;
	}
	/**
	 * 设置：配送时间
	 */
	public void setPeisongshijian(String peisongshijian) {
		this.peisongshijian = peisongshijian;
	}
	/**
	 * 获取：配送时间
	 */
	public String getPeisongshijian() {
		return peisongshijian;
	}
	/**
	 * 设置：配送服务
	 */
	public void setPeisongfuwu(String peisongfuwu) {
		this.peisongfuwu = peisongfuwu;
	}
	/**
	 * 获取：配送服务
	 */
	public String getPeisongfuwu() {
		return peisongfuwu;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：餐厅地址
	 */
	public void setCantingdizhi(String cantingdizhi) {
		this.cantingdizhi = cantingdizhi;
	}
	/**
	 * 获取：餐厅地址
	 */
	public String getCantingdizhi() {
		return cantingdizhi;
	}
	/**
	 * 设置：餐厅介绍
	 */
	public void setCantingjieshao(String cantingjieshao) {
		this.cantingjieshao = cantingjieshao;
	}
	/**
	 * 获取：餐厅介绍
	 */
	public String getCantingjieshao() {
		return cantingjieshao;
	}

}

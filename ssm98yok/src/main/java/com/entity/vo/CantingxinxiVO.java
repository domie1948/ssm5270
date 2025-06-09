package com.entity.vo;

import com.entity.CantingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 餐厅信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-25 10:23:22
 */
public class CantingxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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

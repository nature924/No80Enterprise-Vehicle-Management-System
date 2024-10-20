package com.entity.model;

import com.entity.CheliangyunyingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 车辆运营
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-05-04 16:54:23
 */
public class CheliangyunyingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车辆品牌
	 */
	
	private String cheliangpinpai;
		
	/**
	 * 车牌号
	 */
	
	private String chepaihao;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 日营运
	 */
	
	private String riyingyun;
		
	/**
	 * 营运里程
	 */
	
	private Float yingyunlicheng;
		
	/**
	 * 营运收入
	 */
	
	private Float yingyunshouru;
		
	/**
	 * 工资收入
	 */
	
	private String gongzishouru;
		
	/**
	 * 线路
	 */
	
	private String xianlu;
		
	/**
	 * 地点
	 */
	
	private String didian;
		
	/**
	 * 出车时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chucheshijian;
		
	/**
	 * 返回时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fanhuishijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：车辆品牌
	 */
	 
	public void setCheliangpinpai(String cheliangpinpai) {
		this.cheliangpinpai = cheliangpinpai;
	}
	
	/**
	 * 获取：车辆品牌
	 */
	public String getCheliangpinpai() {
		return cheliangpinpai;
	}
				
	
	/**
	 * 设置：车牌号
	 */
	 
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：日营运
	 */
	 
	public void setRiyingyun(String riyingyun) {
		this.riyingyun = riyingyun;
	}
	
	/**
	 * 获取：日营运
	 */
	public String getRiyingyun() {
		return riyingyun;
	}
				
	
	/**
	 * 设置：营运里程
	 */
	 
	public void setYingyunlicheng(Float yingyunlicheng) {
		this.yingyunlicheng = yingyunlicheng;
	}
	
	/**
	 * 获取：营运里程
	 */
	public Float getYingyunlicheng() {
		return yingyunlicheng;
	}
				
	
	/**
	 * 设置：营运收入
	 */
	 
	public void setYingyunshouru(Float yingyunshouru) {
		this.yingyunshouru = yingyunshouru;
	}
	
	/**
	 * 获取：营运收入
	 */
	public Float getYingyunshouru() {
		return yingyunshouru;
	}
				
	
	/**
	 * 设置：工资收入
	 */
	 
	public void setGongzishouru(String gongzishouru) {
		this.gongzishouru = gongzishouru;
	}
	
	/**
	 * 获取：工资收入
	 */
	public String getGongzishouru() {
		return gongzishouru;
	}
				
	
	/**
	 * 设置：线路
	 */
	 
	public void setXianlu(String xianlu) {
		this.xianlu = xianlu;
	}
	
	/**
	 * 获取：线路
	 */
	public String getXianlu() {
		return xianlu;
	}
				
	
	/**
	 * 设置：地点
	 */
	 
	public void setDidian(String didian) {
		this.didian = didian;
	}
	
	/**
	 * 获取：地点
	 */
	public String getDidian() {
		return didian;
	}
				
	
	/**
	 * 设置：出车时间
	 */
	 
	public void setChucheshijian(Date chucheshijian) {
		this.chucheshijian = chucheshijian;
	}
	
	/**
	 * 获取：出车时间
	 */
	public Date getChucheshijian() {
		return chucheshijian;
	}
				
	
	/**
	 * 设置：返回时间
	 */
	 
	public void setFanhuishijian(Date fanhuishijian) {
		this.fanhuishijian = fanhuishijian;
	}
	
	/**
	 * 获取：返回时间
	 */
	public Date getFanhuishijian() {
		return fanhuishijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}

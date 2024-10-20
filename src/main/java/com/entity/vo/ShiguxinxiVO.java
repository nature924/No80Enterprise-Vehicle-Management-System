package com.entity.vo;

import com.entity.ShiguxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 事故信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-05-04 16:54:22
 */
public class ShiguxinxiVO  implements Serializable {
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
	 * 事故处理
	 */
	
	private String shiguchuli;
		
	/**
	 * 事故处罚
	 */
	
	private String shiguchufa;
		
	/**
	 * 事故详情
	 */
	
	private String shiguxiangqing;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
				
	
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
	 * 设置：事故处理
	 */
	 
	public void setShiguchuli(String shiguchuli) {
		this.shiguchuli = shiguchuli;
	}
	
	/**
	 * 获取：事故处理
	 */
	public String getShiguchuli() {
		return shiguchuli;
	}
				
	
	/**
	 * 设置：事故处罚
	 */
	 
	public void setShiguchufa(String shiguchufa) {
		this.shiguchufa = shiguchufa;
	}
	
	/**
	 * 获取：事故处罚
	 */
	public String getShiguchufa() {
		return shiguchufa;
	}
				
	
	/**
	 * 设置：事故详情
	 */
	 
	public void setShiguxiangqing(String shiguxiangqing) {
		this.shiguxiangqing = shiguxiangqing;
	}
	
	/**
	 * 获取：事故详情
	 */
	public String getShiguxiangqing() {
		return shiguxiangqing;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
			
}

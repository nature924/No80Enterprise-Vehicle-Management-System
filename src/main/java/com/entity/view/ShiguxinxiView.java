package com.entity.view;

import com.entity.ShiguxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 事故信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-04 16:54:22
 */
@TableName("shiguxinxi")
public class ShiguxinxiView  extends ShiguxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiguxinxiView(){
	}
 
 	public ShiguxinxiView(ShiguxinxiEntity shiguxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, shiguxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

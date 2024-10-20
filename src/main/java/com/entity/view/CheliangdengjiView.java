package com.entity.view;

import com.entity.CheliangdengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车辆登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-04 16:54:22
 */
@TableName("cheliangdengji")
public class CheliangdengjiView  extends CheliangdengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CheliangdengjiView(){
	}
 
 	public CheliangdengjiView(CheliangdengjiEntity cheliangdengjiEntity){
 	try {
			BeanUtils.copyProperties(this, cheliangdengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

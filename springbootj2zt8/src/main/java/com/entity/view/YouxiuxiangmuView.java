package com.entity.view;

import com.entity.YouxiuxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 优秀项目
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 16:28:27
 */
@TableName("youxiuxiangmu")
public class YouxiuxiangmuView  extends YouxiuxiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YouxiuxiangmuView(){
	}
 
 	public YouxiuxiangmuView(YouxiuxiangmuEntity youxiuxiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, youxiuxiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

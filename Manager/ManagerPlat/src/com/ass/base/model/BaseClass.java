package com.ass.base.model;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import com.ass.base.prop.MyPropertyConfigurer;
import com.ass.shiro.dto.CurUser;

/**
 * 
 * @author danielpeter
 * 
 * service 基类
 *
 */

public class BaseClass {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	/**
	 * 获得当前登陆人
	 * @return
	 */
	public CurUser getUser(){
		Subject subject = SecurityUtils.getSubject();
		return (CurUser)subject.getPrincipal();
	}
	
	@Resource
	private MyPropertyConfigurer myPropertyConfigurer;
	
	/**
	 * 获取properties文件值得方法，通过key获取value
	 * @param key
	 * @return
	 */
	public String getProp(String key){
		return myPropertyConfigurer.getVal(key);
	}
	
	/**
	 * 构造ajax打回打印对象
	 * @return
	 */
	public Map<String, Object> getMap(){
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("msg", "操作成功");
		m.put("success", true);
		m.put("OK", "OK");
		return m;
	}

}

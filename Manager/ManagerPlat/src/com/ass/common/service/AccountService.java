package com.ass.common.service;

import java.util.List;

import com.ass.common.generated.model.TUser;

public interface AccountService {
	
	/**
	 * 保存新建用户以及其角色
	 * @param tUser
	 * @param roles
	 */
	public void saveUser(TUser tUser,String roles);
	
	/**
	 * 保存编辑后的用户信息以及角色
	 * @param tUser
	 * @param roles
	 */
	public void editUser(TUser tUser,String roles);
	
	/**
	 * 获得用户的所有权限的permission
	 * 传null为当前登录人
	 * @param id
	 * @return  List<String>
	 */
	public List<String> getPermissionsByUserid(Long id);
	
	/**
	 * 获得用户的所有权限的id
	 * 传null为当前登录人
	 * @param id
	 * @return
	 */
	public List<String> getPermissionIdsByUserid(Long id);
	
	/**
	 * 判断是否是管理人
	 * 传null为当前登录人
	 * @param id
	 * @return
	 */
	public boolean isAdmin(Long id);
	
	/**
	 * 判断是否有同级查询权限
	 * 传null为当前登录人
	 * @param id
	 * @return
	 */
	public boolean haveSiblingQuery(Long id);
	
	/**
	 * 判断是否有查询下级的权限
	 * 传null为当前登录人
	 * @param id
	 * @return
	 */
	public boolean haveLowerQuery(Long id);
	
	/**
	 * 通过登录名获得用户
	 * @param LoginName
	 * @return
	 */
	public TUser findUserByLoginName(String LoginName);

}

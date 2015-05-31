package com.ass.shiro.dto;


/**
 * 自定义Authentication对象，使得Subject除了携带用户的登录名外还可以携带更多信息
 * @author danielpeter
 *
 */
public class CurUser {
	
	private Long id;
	
	private String loginName;
	
	private String name;
	
	private String queryLevel;
	
	private Long tOrganizationId;
	
	private String tOrganizationCode;
	
	

	public CurUser(String id, String loginName, String name, String queryLevel) {
		super();
		this.id = new Long(id);
		this.loginName = loginName;
		this.name = name;
		this.queryLevel = queryLevel;
		this.tOrganizationId = null;
		this.tOrganizationCode = "";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQueryLevel() {
		return queryLevel;
	}

	public void setQueryLevel(String queryLevel) {
		this.queryLevel = queryLevel;
	}

	public Long gettOrganizationId() {
		return tOrganizationId;
	}

	public void settOrganizationId(Long tOrganizationId) {
		this.tOrganizationId = tOrganizationId;
	}

	public String gettOrganizationCode() {
		return tOrganizationCode;
	}

	public void settOrganizationCode(String tOrganizationCode) {
		this.tOrganizationCode = tOrganizationCode;
	}
	
	/**
	 * 作为默认的<shiro:principal/>输出
	 */
	public String toString(){
		return name;
	}

}

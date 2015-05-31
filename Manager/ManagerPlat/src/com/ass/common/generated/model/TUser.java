package com.ass.common.generated.model;

public class TUser {
	
	private Long id;
	
	private String loginName;
	
	private String name;
	
	private Long tOrganizationId;
	
	private String tOrganizationCode;
	
	private String mobile;
	
	private String email;
	
	private Integer isdelete;
	
	private String salt;
	
	private String password;
	
	private Integer makeTime;
	
	private String operator;
	
	private Integer modifyTime;
	
	private String modifyOperator;

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
		this.loginName = loginName == null?null:loginName.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null?null:name.trim();
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
		this.tOrganizationCode = tOrganizationCode == null?null:tOrganizationCode.trim();
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile == null?null:mobile.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null?null:email.trim();
	}

	public Integer getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(Integer isdelete) {
		this.isdelete = isdelete;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt == null?null:salt.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null?null:password.trim();
	}

	public Integer getMakeTime() {
		return makeTime;
	}

	public void setMakeTime(Integer makeTime) {
		this.makeTime = makeTime;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator == null?null:operator.trim();
	}

	public Integer getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Integer modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getModifyOperator() {
		return modifyOperator;
	}

	public void setModifyOperator(String modifyOperator) {
		this.modifyOperator = modifyOperator == null?null:modifyOperator.trim();
	}
	

}

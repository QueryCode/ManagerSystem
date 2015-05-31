package com.ass.common.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springside.modules.security.utils.Digests;
import org.springside.modules.utils.Encodes;

import com.ass.base.service.BaseServiceImpl;
import com.ass.common.generated.dao.TUserMapper;
import com.ass.common.generated.model.TUser;
import com.ass.common.utils.StringUtil;
import com.ass.log.service.UserLogService;

//Spring Service Bean 的标识
@Service
public class AccountServiceImpl extends BaseServiceImpl implements AccountService{

	@Resource
	private TUserMapper tUserMapper;
	@Resource
	private CommonService commonService;
	@Resource
	private UserLogService userLogService;
	
	/**
	 * 加密策略
	 */
	public static final String HASH_ALGORITHM = "SHA-1";
	
	/**
	 * 迭代次数
	 */
	public static final int HASH_INTERATIONS = 1024;
	
	/**
	 * 什么叫(盐长)
	 */
	private static final int SALT_SIZE = 8;
	
	/**
	 * 保存新建用户以及其角色
	 */
	@Override
	public void saveUser(TUser tUser, String roles) {
		// TODO Auto-generated method stub
		//设定安全的密码，生成随机的salt并经过1024次 sha-1  hash
		//新增用户默认密码为员工号
		tUser.setPassword(tUser.getLoginName());
		if(StringUtil.isNotEmpty(tUser.getLoginName())){
			encryptPassword(tUser);
		}
		
		//设置t_organization_code
		String sql2 = "select code from t_organization where id="+tUser.gettOrganizationId();
		Map<String, Object> mp = commonService.selectOneBySql(sql2);
		tUser.settOrganizationCode(StringUtil.getString(mp.get("code")));
		
		tUserMapper.insertSelective(tUser);
		
		//设置角色
		if(StringUtil.isNotBlank(roles)){
			String[] roles2 = StringUtil.split(roles,",");
			for(String s:roles2){
				String sql = "insert into t_user_role set t_user_id="+tUser.getId()+",t_role_id = "+s;
				commonService.insertBySql(sql);
			}
		}
	}

	
	@Override
	public void editUser(TUser tUser, String roles) {
		// TODO Auto-generated method stub
		//编辑用户，不修改密码
		if(StringUtil.isNotEmpty(null)){
			encryptPassword(tUser);
		}else{
			
		}
	}

	@Override
	public List<String> getPermissionsByUserid(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getPermissionIdsByUserid(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAdmin(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean haveSiblingQuery(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean haveLowerQuery(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TUser findUserByLoginName(String LoginName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 设定安全的密码，生成随机的salt并经过1024次 sha-1 hash
	 * @param TUser
	 */
	private void encryptPassword(TUser TUser){
		byte[] salt = Digests.generateSalt(SALT_SIZE);
		TUser.setSalt(Encodes.encodeHex(salt));
		
		byte[] hashPassword = Digests.sha1(TUser.getPassword().getBytes(), salt,HASH_INTERATIONS);
		TUser.setPassword(Encodes.encodeHex(hashPassword));
	}

}

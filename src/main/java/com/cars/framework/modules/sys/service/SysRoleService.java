package com.cars.framework.modules.sys.service;

import java.util.List;
import java.util.Map;

import com.cars.framework.modules.sys.entity.SysRoleEntity;


/**
 * 角色
 * 
 * @author framework
 * @date 2016年9月18日 上午9:42:52
 */
public interface SysRoleService {
	
	SysRoleEntity queryObject(Long roleId);
	
	List<SysRoleEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SysRoleEntity role);
	
	void update(SysRoleEntity role);
	
	void deleteBatch(Long[] roleIds);

}

package com.finance.dao;

import java.util.List;

import com.finance.condition.UserQueryCondition;
import com.finance.exception.BusinessException;
import com.finance.vo.UserVO;

public interface UserDao {

	public int addUser(UserVO user) throws BusinessException;

	public int deleteUser(UserVO pk_user) throws BusinessException;

	public int updateUserById(UserVO user) throws BusinessException;

	public UserVO selectUserById(int id) throws BusinessException;

	public UserVO selectUserByLoginId(String loginId) throws BusinessException;

	public List<UserVO> selectAllUser() throws BusinessException;

	public int selectUserCount(UserQueryCondition params)
			throws BusinessException;

	public List<UserVO> queryUser(UserQueryCondition params)
			throws BusinessException;
}

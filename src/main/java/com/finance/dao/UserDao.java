package com.finance.dao;

import java.util.List;

import com.finance.condition.UserQueryCondition;
import com.finance.exception.BusinessException;
import com.finance.vo.UserVO;



/**
 * �û��������
 * 
 * @author sdyang
 * @date 2015��6��3�� ����3:07:31
 */

public interface UserDao {

	/**
	 * �����û�
	 * 
	 * @author sdyang
	 * @date 2015��7��7�� ����11:43:15
	 * @param user
	 * @return
	 * @throws BusinessException
	 */
	public int addUser(UserVO user) throws BusinessException;

	/**
	 * ɾ���û�
	 * 
	 * @author sdyang
	 * @date 2015��7��7�� ����11:43:26
	 * @param user
	 * @throws BusinessException
	 */
	public int deleteUser(UserVO pk_user) throws BusinessException;

	/**
	 * �����û���Ϣ
	 * 
	 * @author sdyang
	 * @date 2015��7��7�� ����11:43:37
	 * @param user
	 * @throws BusinessException
	 */
	public int updateUserById(UserVO user) throws BusinessException;

	/**
	 * ��������ѯ�û���Ϣ
	 * 
	 * @author sdyang
	 * @date 2015��7��7�� ����11:43:46
	 * @param id
	 * @return
	 * @throws BusinessException
	 */
	public UserVO selectUserById(int id) throws BusinessException;

	/**
	 * ��ݵ�¼�˻���ѯ�û���Ϣ
	 * 
	 * @author sdyang
	 * @date 2015��7��7�� ����11:43:58
	 * @param loginId
	 * @return
	 * @throws BusinessException
	 */
	public UserVO selectUserByLoginId(String loginId) throws BusinessException;

	/**
	 * ��ѯ�����û�
	 * 
	 * @author sdyang
	 * @date 2015��7��7�� ����11:44:10
	 * @return
	 * @throws BusinessException
	 */
	public List<UserVO> selectAllUser() throws BusinessException;

	/**
	 * ��ѯ�û�����
	 * 
	 * @author sdyang
	 * @date 2015��7��7�� ����3:18:15
	 * @return
	 * @throws BusinessException
	 */
	public int selectUserCount(UserQueryCondition params) throws BusinessException;

	/**
	 * ��ѯ�û�
	 * 
	 * @author sdyang
	 * @date 2015��7��7�� ����3:49:22
	 * @param currentPage
	 * @param rows
	 * @return
	 * @throws BusinessException
	 */
	public List<UserVO> queryUser(UserQueryCondition params)
			throws BusinessException;
}

package com.finance.dao;

import java.util.List;

import com.finance.exception.BusinessException;
import com.finance.vo.UrlVO;

public interface UrlDao {

	public List<UrlVO> getUrlByRole(String role) throws BusinessException;

}

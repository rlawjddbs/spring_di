package kr.co.sist.assembly;

import kr.co.sist.dao.Dao;
import kr.co.sist.dao.DaoMySqlImpl;
import kr.co.sist.dao.DaoOracleImpl;
import kr.co.sist.service.Service;
import kr.co.sist.service.ServiceImpl;

/**
 *	������ ���� ���踦 �����ϴ� ��
 * @author owner
 */
public class Assembly {
	public Service getBean() {
		// 1. ������ ������ ��ü ����
		Dao dao = new DaoOracleImpl();
//		Dao dao = new DaoMySqlImpl();
		// 2. ������ ���Թ��� ��ü �����ϸ鼭 ������ ����
		Service service = new ServiceImpl(dao);
		// 3. ������ ���Թ��� ��ü ��ȯ
		return service;
	} // getBean
} // class

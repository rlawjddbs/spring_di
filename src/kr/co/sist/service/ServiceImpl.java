package kr.co.sist.service;

import java.sql.SQLException;
import java.util.List;

import kr.co.sist.dao.Dao;
import kr.co.sist.vo.EmpVo;

public class ServiceImpl implements Service {
	// �ڽ��� �ƴ� �θ��� �̸����� ��ü�� �����ϸ� ��� �ڽ��� ���� �� �ִ�.
	private Dao dao;
	// Service ��ü�� ������ ó���ϴµ� �ݵ�� Dao�� ����ؾ� �Ѵ�.
	// => Service�� DAO�� �������� �ִ�. (Service ��ü�� ����Ϸ��� DAO��
	// ������ ����(DI - Dependency Injection) �޾ƾ� �Ѵ�.)
	public ServiceImpl(Dao dao) {
		this.dao = dao;
	} // ServiceImpl
	
	@Override
	public void addEmp(EmpVo ev) {
		try {
			// ���� ���� ó��
			dao.insertEmp(ev);
		} catch (SQLException e) {
			e.printStackTrace();
		} // end catch
	} // addEmp

	@Override
	public List<EmpVo> searchEmp() {
		
		System.out.println("��ȸ�۾��� ���� �������� ó��");
		List<EmpVo> list = null;
		try {
			list = dao.selectEmp();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	} // searchEmp

} // class

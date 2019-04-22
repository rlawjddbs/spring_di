package kr.co.sist.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.vo.EmpVo;

public class DaoMySqlImpl implements Dao{

	@Override
	public int insertEmp(EmpVo ev) throws SQLException {
		// Oracle DB�� insert�۾� ����
		System.out.println("Mysql�� ������� �߰�");
		return 1;
	} // insertEmp

	@Override
	public List<EmpVo> selectEmp() throws SQLException {
		List<EmpVo> list = new ArrayList<EmpVo>();
		list.add(new EmpVo(2111, "������"));
		list.add(new EmpVo(2112, "������"));
		list.add(new EmpVo(2113, "������"));
		list.add(new EmpVo(2114, "���ü�"));
		list.add(new EmpVo(2115, "�̺���"));
		return list;
	} // selectEmp

} // class

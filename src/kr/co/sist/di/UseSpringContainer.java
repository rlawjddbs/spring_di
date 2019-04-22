package kr.co.sist.di;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.sist.service.Service;
import kr.co.sist.service.ServiceImpl;
import kr.co.sist.vo.EmpVo;

public class UseSpringContainer {

	public static void main(String[] args) {
		// 1. ���������� ����Ͽ� Spring Container ����
		ApplicationContext ac = new ClassPathXmlApplicationContext("kr/co/sist/di/applicationContext.xml");
		// 2. id�� ����Ͽ� Bean(������ ���Թ��� ��ü) ���
//		ServiceImpl si = (ServiceImpl)ac.getBean("service"); // Spring 2.5.3 ���� ������ ��
		ServiceImpl si = ac.getBean(ServiceImpl.class);
		// 3. ã�Ƴ� Bean�� ����Ͽ� ���.
		si.addEmp(new EmpVo(3333, "������"));
		List<EmpVo> list = si.searchEmp();
		for( EmpVo ev : list) {
			System.out.println(ev.getEmpno()+" / "+ev.getEname());
		} // end for 
	} // main

} // class

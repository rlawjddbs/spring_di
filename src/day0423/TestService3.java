package day0423;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestService3 {

	// ������ ���� ���� ��ü���� annotation ����
	@Autowired
	private TestDao3 td;

	public TestDao3 getTestDao3() {
		return td;
	} // getTestDao3
	
} // class

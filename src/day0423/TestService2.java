package day0423;

public class TestService2 {

	// ������ ���� ���� ��ü�� ����� �� �ֵ��� instance ������ ����
	private TestDao td;
	private TestDao2 td2;
	
	public TestService2() {
		System.out.println("�⺻ �����ڸ� ����Ͽ� ��ü ����");
	} // TestService

	// instance�� ������ ���� ������ ������� �ȴ�.
	public TestService2( TestDao td, TestDao2 td2 ) {
		this.td = td;
		this.td2 = td2;
		System.out.println("�Ű� ������ �������� ������ ������ ����");
	} // TestService

	
	
} // class

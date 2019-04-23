package day0423;

public class TestService {

	// ������ ���� ���� ��ü�� ����� �� �ֵ��� instance ������ ����
	private TestDao td; 
	
	public TestService() {
		System.out.println("�⺻ �����ڸ� ����Ͽ� ��ü ����");
	} // TestService

	// instance�� ������ ���� ������ ������� �ȴ�.
	public TestService( TestDao td ) {
		this.td = td;
		System.out.println("������ ������ ����");
	} // TestService
	
	// method ������ ���� : �ݵ�� �⺻ �����ڰ� �����ؾ� �Ѵ�.
	public void setTd(TestDao td) {
		this.td=td;
	} // setTd
	
	public TestDao getTd() {
		return td;
	} // 
	
} // class

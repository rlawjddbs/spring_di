package day0423;

public class TestService2 {

	// 의존성 주입 받은 객체를 사용할 수 있도록 instance 변수로 선언
	private TestDao td;
	private TestDao2 td2;
	
	public TestService2() {
		System.out.println("기본 생성자를 사용하여 객체 생성");
	} // TestService

	// instance를 의존성 주입 받으면 약결합이 된다.
	public TestService2( TestDao td, TestDao2 td2 ) {
		this.td = td;
		this.td2 = td2;
		System.out.println("매개 변수가 여러개인 생성자 의존성 주입");
	} // TestService

	
	
} // class

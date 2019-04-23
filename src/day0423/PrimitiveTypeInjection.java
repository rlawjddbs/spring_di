package day0423;

public class PrimitiveTypeInjection {

	public PrimitiveTypeInjection(int i) {
		System.out.println("기본형 데이터형을 매개변수로 Injection 하였을 때 i="+i);
	} // PrimitiveTypeInjection
	public PrimitiveTypeInjection(long l) {
		System.out.println("기본형 데이터형을 long형 매개변수로 Injection 하였을 때 l="+l);
	} // PrimitiveTypeInjection
	public PrimitiveTypeInjection(String s) {
		System.out.println("String형을 매개변수로 Injection 하였을 때 s="+s);
	} // PrimitiveTypeInjection
	
} // class

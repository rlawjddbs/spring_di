package day0423;

public class TestVO {
	private String name;
	private int age;

	public TestVO(String name, int age) {
		this.name = name;
		this.age = age;
	} // TestVO

	public String getName() {
		return name;
	} // getName

	public void setName(String name) {
		this.name = name;
	} // setName

	public int getAge() {
		return age;
	} // getAge

	public void setAge(int age) {
		this.age = age;
	} // setAge

	@Override
	public String toString() {
		return "TestVO [name=" + name + ", age=" + age + "]";
	} // toString
	
} // class

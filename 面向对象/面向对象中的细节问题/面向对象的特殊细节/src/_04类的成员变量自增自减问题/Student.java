package _04类的成员变量自增自减问题;

public class Student {
	//成员变量----->
	private int age;//-------> int 基本类型
	private String name;//-->  String 引用类型
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public Student() {
		super();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}

package _05方法的参数是自定义对象形参的改变影响实参;

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

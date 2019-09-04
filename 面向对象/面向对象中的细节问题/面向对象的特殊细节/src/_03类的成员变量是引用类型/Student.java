package _03类的成员变量是引用类型;

public class Student {
	//成员变量----->
	private int age;//-------> int 基本类型
	private String name;//-->  String 引用类型
	
	//courses 变量是一个数组 保存的是学生的多门课程的成绩
	private int[] courses;//-->  String 引用类型
	
	//一个手机类作为成员变量. 学生对象有 一个手机对象
	private Phone phone;
	

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Student() {
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Student(int age, String name, int[] courses) {
		super();
		this.age = age;
		this.name = name;
		this.courses = courses;
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

	public int[] getCourses() {
		return courses;
	}

	public void setCourses(int[] courses) {
		this.courses = courses;
	}
	
	public void show() {
		System.out.println("大家好我是" + name+"我的手机是" + phone.getBrand()+"价值" + phone.getPrice());
		System.out.println("是兄弟就来砍我");
	}
	
	
}

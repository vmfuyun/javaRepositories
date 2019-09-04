package _04类的成员变量自增自减问题;

import java.util.Arrays;

public class Test {
	//定义一个方法,该方法自动增加学生的年龄
	public static void main(String[] args) {
		//获得一个学生对象
		Student stu = new Student(17,"赵丽颖");
		System.out.println(stu.getName()+" ------ "+stu.getAge());
		//将 stu 传递到 addAge 方法中,自动增加一岁
		addAge(stu);
		//查看学生的年龄
		System.out.println(stu.getName()+" ------ "+stu.getAge());
	}
	
	public static void addAge(Student stu) {//将学生的 年龄加大一岁
		// stu是调用这传递过来的对象
		// 第一步先获得 stu对象的 年龄
		int age = stu.getAge();
		// 第二步 将年龄 加
		age++;
		// 第三部 将修改后的年龄重新附加到 stu对象
		stu.setAge(age);
		
	}

	
}

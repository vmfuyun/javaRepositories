package _05方法的参数是自定义对象形参的改变影响实参;

import java.util.Arrays;

public class Test {
	//方法的参数是引用类型(自定义类型),形式参数的修改影响实际参数
	public static void main(String[] args) {
		//1:创建一个学生对象
		Student stu = new Student(18,"赵丽颖");
		System.out.println(stu.getName()+"----"+stu.getAge());
		//2:调用 change方法 在方法中修改 对象的值
		change(stu);
		//3:输出对象中的数据
		System.out.println(stu.getName()+"----"+stu.getAge());
	}
	
	public static void change(Student stu) {
		//修改 stu 中的值
		stu.setName("凤姐");
		stu.setAge(33);
	}

	
}

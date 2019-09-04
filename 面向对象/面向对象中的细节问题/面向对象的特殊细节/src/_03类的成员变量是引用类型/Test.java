package _03类的成员变量是引用类型;

import java.util.Arrays;

public class Test {
	//_03类的成员变量是引用类型
	public static void main(String[] args) {
		//创建一个有手机的学生
		Student stu = new Student(18,"赵丽颖");
		//给stu 这个学生 配置一台手机
		// 首先必须要有 一个手机对象
		Phone iphone = new Phone(8999,"iphonex_Max");
		//  将手机对象 iphoen 添加到 stu对象中
		stu.setPhone(iphone);
		
		stu.show();

	}

	private static void extracted() {
		//创建学生对象--------->注意 没有给课程成绩赋值
		Student stu = new Student(18,"王源");
		//给 stu兑现过的课程成绩赋值
		//将多门成绩 保存在一个数组中
		int[] arr = {100,99,98};
		// 将成绩的数组放到 stu对象中
		stu.setCourses(arr);
		
		//获得stu 对象的 所有的课程成绩----->保存的是多门课程的成绩是一个数组
		//接受方法返回值 也必须是一个数组
		int[] courses = stu.getCourses();
		//将学生的课程数组进行输出
		System.out.println(stu.getName()+"的课程成绩是"+Arrays.toString(courses));
	}

}

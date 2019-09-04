package _02方法的返回值是引用类型;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Test {

	public static void main(String[] args) {
		//获得get 方法的返回值
//		int[] arr = get();//获取get 方法的返回值,由于返回值是一个 int[] 的数据,那么我们就要用int[]进行接收
//		System.out.println("在主方法中 arr 的地址值是" + arr);
		
		//获得 get2 方法的返回值
		Student stu = get2();
		System.out.println("在主方法中学生对象的地址值是" + stu);
		System.out.println("在主方法中学生对象的名字是" + stu.getName());
		System.out.println("在主方法中学生对象的年龄是" + stu.getAge());

	}
	
	//方法的返回值是引用类型---->数组
	public static int[] get() {
		//定义一个数组
		int[] arr = {1,2,3};
		System.out.println("在get方法中 数组的地址值是" + arr);
		//将数组返回
		return arr;
	}
	
	//方法的返回值是引用类型---->类 自定义类 Student
	public static Student get2() {
		//获得一个学生对象
		Student stu = new Student("易烊千玺",16);
		System.out.println("在get2中学生对象的地址值是" + stu);
		System.out.println("在get2中学生对象的名字是" + stu.getName());
		System.out.println("在get2中学生对象的年龄是" + stu.getAge());
		//将学生对象放回
		return stu;
	}


}

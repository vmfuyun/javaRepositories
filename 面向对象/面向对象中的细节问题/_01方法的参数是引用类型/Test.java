package _01方法的参数是引用类型;

public class Test {
	/*
	 引用类型包含 ---> 数组 类() 接口 
	 * */
	public static void main(String[] args) {
		//调用 method2方法
		//需要创建 Student类对象
		Student s1 = new Student("王俊凯", 18);
		System.out.println("main方法中对象地址值是" + s1);
		method2(s1);//将对象 s1 传递到 method2方法中

	}
	//方法的参数是 数组
	public static void method1(int[] b) {
		System.out.println("在method1中 arr 的地址值是" + b);
	}
	
	
	//方法的参数是 类(自定义类)
	// 该方法的参数类型是 Student类, 那么我们在调用的使用 需要传递一个 Student的对象
	public static void method2(Student stu) {// stu 保存的是调用传递过来的对象地址值
		System.out.println("method2方法中接受到的对象地址值是" + stu);
		System.out.println(stu.getName() +"----"+stu.getAge());
	}
	
	
	
	
	
	
	
	private static void extracted1() {
		//调用method1方法
		int[] a = new int[] {1,2,3};
		System.out.println("在主方法中 arr 的地址值是" + a);
		method1(a);
	}

}

---------------------------------常用类day01-----------------------------------
1:工具类的格式(写法 了解 简单)
	class  Xxx {
		private Xxx(){};
		全部方法都是static 修饰
	}
	
	通过 Xxx.方法名();来使用
		Arrays
2:单例模式(记住 面试题)
	class Xxx{ //确保 这个类 只有一个对象
		private Xxx(){} // 外部不能创建对象
		private static Xxx x = new Xxx();// 在内部 创建一个对象(还私有)
		public static Xxx getXxx(){//通过一个 静态方法 将对象返回.
			return x;
		}
	}
-----------------------------上面的都是格式问题-------------------------------------------------

3:包装类型(了解  简单)
		1:基本类型的升级版
			int a = 1;      // 基本类型 a  里面只保存了 1
			Integer b = 1;  // 引用类型 b  里面有保存了 1
			// b 相对 a 升级在哪些地方.
			// b对象中有大量的方法(很多 都没什么价值)
			
		2:
			自动升级 -----> 装箱
			自动降级 -----> 拆箱
		3:重要的方法---->只有这方法是需要 记忆 .
			Integer.parseInt(字符串) -----> 将字符串 变成 数值
							"123"  -----> 123
							String s = "123";
							System.out.println(s + 1);// "1231"
							int a = Integer.parseInt(s); //   123
							System.out.println(a + 1);//     124
		4:比较对象是否相等,只用 equals() 方法, 那么缓冲就不是问题.
			
			

4:字符串(重点的重点)----------->必须要 背下来
	1:可变 和 不可变 ----> 理解
		String类的对象是不可变 ----> String对象一旦创建, 该对象的内容是不变,但是地址值可以切换
			String a = "10";// "10" 中的内容不能变
			a = "20" ;// a 重新指向 "20"
			// 执行 String 中的方法 本身没有任何改变.
			
		StringBulider的对象是可变--> StringBuilder对象,可以调用方法,需改自身的值.
			 
	
	2:String 直接赋值 和 new 出来的区别:---->面试相关
		String a = "abc";
		String b = new String("abc");
		// 变量 a 指向的是  常量池中的 "abc"
		// 变量 b 指向的是  堆中的对象, 该对象再指向常量池中 的 "abc"
		// 结论:	ab 数据相等, 地址不相等.
		
		对象 就用 equals();   100%没有问题


5:缓冲字符串(了解 面试)
	StringBuilder -----> 线程不安全 速度快
	StringBuffer  -----> 线程安全   速度慢
	
	缓冲字符串 比 String 拼接字符串的效率高.
	
	里面的方法 一般是返回 自身对象 .
	
	里面也有很多好用的方法
	
6: 总结:
	String中的方法         不修改自身的值 ----> 不可变
		String str = "abc";
		String case1 = str.toUpperCase(); //方法的返回值 是大写, 自身没有改变
		System.out.println(case1);// "ABC"
		System.out.println(str); //  "abc"
		str = str.toUpperCase(); // String的对象必须要重新赋值给自己,才能修改
		
	StringBuilder中的方法  修改自身的值  ------> 可变
		StringBuilder sb = new StringBuilder("abc");
		sb.append("123");
		System.out.println(sb);// abc123

-----------------------------------面试题----------------------------------------------
1:单例模式	
	作用:
		该类只有一个对象
	格式:(方式有很多, 我们这里介绍的是其中一种---->饿汉式)
		class Xxx{
			private Xxx(){}
			private static Xxx x = new Xxx();
			public static Xxx getXxx(){
				return x;
			}
		}
		
2:包装类: 基本类型的升级版	
		int -----> Integer
		byte ----> Byte
		...
		
	重要的方法:
	 	int a = Integer.parseInt(字符串的数值);

3:String类
	1:理解 String的不可变性
	2:理解 直接赋值  和 new String()赋值的区别
	3:String的常用方法----->(要记忆)
	
4:缓冲字符串
	StringBuiler StringBuffer
		1:区分
		2:他们是可变
		3:里面有很多方法(----以后慢慢积累)
5:int Integer  string 三者的转换 (很常用);
	int ---> Integer
		Integer a = 1;
	int ---> String
		String a = 1 + "";
	Integer ----> int
		int a = Integer对象;
	Integer ---> String
		String a = nteger对象 + "" ;
	string ----> int ;
		int a = Integer.parseInt(字符串);
	string ----> Integer ;
		Integer a = Integer.parseInt(字符串);

6:StringBuilder 和 String 的转换
	StringBuilder ---> String
			String s = sb.toString();
	String ---> StringBuilder
			StringBuilder sb = new StringBuilder(字符串);	
	




面对对象三大特征:
	1:封装
	2:继承
	3:多态

----------------------------------day02 继承------------------------------
1:this---> 当前的对象
	a:作用
		解决成员变量 和局部变量 重命名的问题
		class Xxx{
			int a = 1;    //成员变量
			public void m(){
				int a = 2;//局部变量
				System.out.println(a);//      就近原则 输出 2
				System.out.println(this.a);//  输出  1
			}
			
		}
	b:类的标准代码
		
2:继承----->对象之间的关系.
	1:定义:
		类和类之间的父子关系,子类能方便使用父类的代码.----->节省重复代码,..(其他好处 )
	2:使用的条件:
		当 B类 和 A存在: B 是 A 的一种 ,就是使用继承 -----> 是 的关系;
				美女类   是  女人类
				狗类     是  动物类....
	3:格式
		class 父类{}   // --------------> 父类
		class 子类 extends 父类{}//-----> 子类
		
	4:好处:
		子类直接使用父类的代码 ---->好爽
	
	5:注意:
		a:java是单继承 ----> 子类只能有一个父类
			 父类可以有多个子类.
		b:支持多层继承   ---> 父类也有父类
		
		c:Object是所有类的父类, 当你没有使用继承 ,那么该类会默认继承 Object类
			class A{} ;// 写一个类 当中没有任何代码
			
			A a = new A();
			a.方法();// a能使用很多的方法
			//这里的方法是 Object类中, 默认继承了Object.
		d:父类的私有内容,子类不能继承----->子类不能使用.
	
		f:方法的(覆盖,重写)----- 重点
			在父子类中,存在一模一样的方法,就是方法的覆盖.
				class A{
					public void say(){
						System.out.println("我是爸爸");
					}
				}
				class B extends A{ 
					public void say(){
						System.out.println("我是儿子");
					}
				}
				//创建子类对象
				B b = new B();
				b.say();//执行子类中的方法. (  输出 "我是儿子" )----->方法覆盖
		
		g:this 和 super
			this----->当前的对象--------------->子类
			super---->当前的对象的父类对象----->父类
				在子类代码中:  
							this表示自己的 
							super:表示父类	
				class Father{
					public void say(){
						System.out.println("我在 佛山 有一套 房子");
					}
					
				}
				class Son extends Father{
					public void say(){
						System.out.println("我在 肇庆 有一套 房子");
					}
					
					public void method(){
						this.say();//执行自己的方法 say()
						super.say();// 执行父类的方法say()
					}
				}
				
3:抽象类 ----> 特殊的父类 , 特殊在--->强制要求子类进行方法的覆盖
		使用场景: 
			在父类中, 某些方法必须要有,但是不好写具体的代码----->设置该方法,但不写实现过程
					这个方法就是抽象方法
				    而这个方法所在类(父类) 叫 抽象类
					
		格式:
			abstract class 父类{ // 抽象类
			//写抽象方法 ----> 不完整的方法 ----> 没有方法体
				public abstract void 方法();//抽象方法
			}	
			-------------------写 子类 来补全 抽象类-------------------------
			class 子类 extends 父类{//继承的是 抽象类, 就必须将抽象类中的方法覆盖
				public  void 方法(){
					...
				}
			}
		注意事项:
			1:抽象类不能实例化--->不能创建对象.
			2:抽象类不能实例化对象,但是有 构造器,自己不用,给子类使用.
			3:抽象的子类:
						要么覆盖抽象方法
						要么子类也变成抽象.

4:Object类中的方法:

	toString()---> 输出该对象的信息.
				 public String toString() {
					return getClass().getName()  + "@" + Integer.toHexString(hashCode());
					//      获得类所在的文件夹   +  "@" + 该对象的地址
				 }
	Object的toString()方法获得的信息,不方便看. -----> 建议所有的子类对象 重写toString() ----> 自动生成 alt + shift + s + s
				  
	
	equals(对象)---> 比较对象是否相等     ---------> 默认比较的是对象的地址值,只要是new 出来的 地址值一定是不同
				public boolean equals(Object obj) {
					  //this ---> 当前对象
					  // obj ---> 传入的对象
					  // (this == obj) ---> 两个对象相等吗?
						return (this == obj);
				  }
	Object的equals() 比较对象的地址值, 我们正常人是不看懂址值.这样不合理 ---> 我们比较的的对象的内容是否相同
			要想实现该效果--->要重写equals()---->自动生成  alt + shift + s + h
			
	很简单, 自动生成就好了.不要有心理负担.
		
	
------------------------------------------面试题----------------------------------------------------
1:方法的重载和覆盖
	重载:同一个类中, 相同的方法名 ,不同的方法参数
	覆盖:在父子类中, 一模一样的方法.
	
2:写出结果
	class A{
		int aa = 10;
	}
	class B extends A{
		int aa = 20;
		public void show(){
			int aa = 30;
			//在 父类 子类 中存在重命名的情况, 如何区分
			System.out.println(super.aa);//10
			System.out.println(this.aa);// 20
			System.out.println(aa);//      30
		}
	}
3:== 和 equals的比较区别:
	如果比较的引用类型(对象):
		==  -----> 比较两个对象的内存地址值
		equals---> 比较两个对象的内容(是重写了该方法)
	
	如果比较的基本类型:
		==  -----> 两个的值
				1 == 2
		equals --> 直接报错 --->基本类型, 没有方法使用
	
	
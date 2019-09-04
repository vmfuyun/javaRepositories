面向对象三大特征:
	1:封装
	2:继承
	3:多态
----------------------------------------------------
1:接口
	定义: 
		  一种规范,规定应该具有哪些功能.
		  加上接口,就相当于加上了额外的功能
	语法格式:
			interface 接口名{
				成员变量
						必须是常量
				成员方法
						必须是抽象方法
			}
	使用方式:
			interface 接口名{//写一个接口
				public abstract void 方法名(); //抽象方法 , abstract修饰 没有方法体
				...
			}
			---------------写一个 类 和接口发生关系(实现关系)------------------
			class 类名 implements 接口名{
				public  void 方法名(){}//必须要对接口中的方法进行覆盖.
			}
	注意事项:
		1:接口不能创建对象
		2:一个类可以实现多个接口
				class 类名 implements 接口1 , 接口2{}
		3:一个类可以有父类有接口
				class 类名 extends 父类  implements 接口1 , 接口2...{}
				
		4:接口和接口之间是继承关系,多继承
			interface A{}
			interface B{}
			interface C extends A ,B{}


2:多态-------->对象的多种形态,----->(子类能看做父类) 儿子充当爸爸
	定义:
		对象的多种形态,将子类对象看做父类对象.
	语法格式:
			       和之前的代码没有区别
			 父类 变量名 = new 子类();
			 接口名 变量名 = new 实现类();
	为什么要这样:
			 父类更通用, 子类太具体.
			 屏蔽子类之间的差异.
	注意:
		a:当多态产生:
			1:只能使用父类中存在的方法
			2:当方法父类有,子类也有(方法的覆盖) -----> 最终效果是子类的方法
					总结: 编译看父类 运行看子类
-----------------------------------------------------------------------------
		b:多态的转换 -----> 语法上支持.
			1:  Animal a = new Dog();// OK ,将一只狗披上动物的外衣
				Dog d = (Dog)a;     ;// OK ,将动物的外衣撕下来 ,出来一只狗
				
			2:  Animal a = new Animl();// OK ,正常的对象
			    Dog d = (Dog)a;     ;//报错 ,将动物的外衣撕下来 ,出来一只狗
				
		c:多态的转换 -----> 有必要吗? ---> 有
		
		
		d:在方法的声明上, 如果使用父类或者接口限定,会让这个方法更加通用(看笔记后面的案例)

3:this 和 super 的补充 ---->了解 (简单 可以自动生成)


---------------------------------面试题---------------------------------
1:接口和抽象类的区别


public class Demo01 {

	public static void main(String[] args) {
		Pig p =  new Pig();
		Demo01.eat(p);
		Chicken c =  new Chicken();
		Demo01.eat(c);
		Cat cat =  new Cat();
		Demo01.eat(cat);
		Dog d = new Dog();
		Demo01.eat(d);
		Xxxx x = new Xxxx();
		Demo01.eat(x);
	}	
	//编写测试 每种食物的方法
//	public static void eat(Pig p){//自定义类(我自己写的类) ---> 也是数据类型的一种 ----->可以作为方法的参数
//		p.taste();
//	}
//	public static void eat(Chicken p){//自定义类(我自己写的类) ---> 也是数据类型的一种 ----->可以作为方法的参数
//		p.taste();
//	}
	// 所有的 食材 都属于 动物
	public static void eat(Animal p){
		p.taste();
	}
}

abstract class Animal{
	//设置 动物被昌起来的 味道 ,
	public abstract void taste();
}

class Pig extends Animal{

	public void taste() {
		System.out.println("猪脚饭,肥而不腻");
	}
}

class Chicken extends Animal{

	public void taste() {
		System.out.println("黄焖鸡,好吃");
	}
	
}

//我们开发一种新的食材
class Cat extends Animal{

	public void taste() {
		System.out.println("猫肉 不要吃 很酸 ");
	}	
}
class Dog extends Animal{
	public void taste() {
		System.out.println("狗肉 不要吃 很好吃 ");
	}
}

class Xxxx extends Animal{

	@Override
	public void taste() {
		// TODO Auto-generated method stub
		
	}
	
}
---------------------------------------------------------------
package com.wolfcode.test;

public class Demo01 {

	public static void main(String[] args) {
		Dog d = new Dog();
		Demo01.eat(d);
	}	
	// 所有的 食材 都属于 动物
	public static void eat(Animal p){// p ----> new Dog()
		//在方法的传递上使用多态, 使这个方法更加通用
		//在方法的里面 再次---->向下转型,变成子类对象, 就可以使用子类独有的方法.
		Dog d = (Dog)p;
		d.play();
		d.taste();
	}
}

abstract class Animal{
	//设置 动物被昌起来的 味道 ,
	public abstract void taste();
}

class Dog extends Animal{
	public void taste() {
		System.out.println("狗肉 不要吃 很好吃 ");
	}
	public void play(){
		System.out.println("和你玩耍");
	}
}

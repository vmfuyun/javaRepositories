---------------------------------������day01-----------------------------------
1:������ĸ�ʽ(д�� �˽� ��)
	class  Xxx {
		private Xxx(){};
		ȫ����������static ����
	}
	
	ͨ�� Xxx.������();��ʹ��
		Arrays
2:����ģʽ(��ס ������)
	class Xxx{ //ȷ�� ����� ֻ��һ������
		private Xxx(){} // �ⲿ���ܴ�������
		private static Xxx x = new Xxx();// ���ڲ� ����һ������(��˽��)
		public static Xxx getXxx(){//ͨ��һ�� ��̬���� �����󷵻�.
			return x;
		}
	}
-----------------------------����Ķ��Ǹ�ʽ����-------------------------------------------------

3:��װ����(�˽�  ��)
		1:�������͵�������
			int a = 1;      // �������� a  ����ֻ������ 1
			Integer b = 1;  // �������� b  �����б����� 1
			// b ��� a ��������Щ�ط�.
			// b�������д����ķ���(�ܶ� ��ûʲô��ֵ)
			
		2:
			�Զ����� -----> װ��
			�Զ����� -----> ����
		3:��Ҫ�ķ���---->ֻ���ⷽ������Ҫ ���� .
			Integer.parseInt(�ַ���) -----> ���ַ��� ��� ��ֵ
							"123"  -----> 123
							String s = "123";
							System.out.println(s + 1);// "1231"
							int a = Integer.parseInt(s); //   123
							System.out.println(a + 1);//     124
		4:�Ƚ϶����Ƿ����,ֻ�� equals() ����, ��ô����Ͳ�������.
			
			

4:�ַ���(�ص���ص�)----------->����Ҫ ������
	1:�ɱ� �� ���ɱ� ----> ���
		String��Ķ����ǲ��ɱ� ----> String����һ������, �ö���������ǲ���,���ǵ�ֵַ�����л�
			String a = "10";// "10" �е����ݲ��ܱ�
			a = "20" ;// a ����ָ�� "20"
			// ִ�� String �еķ��� ����û���κθı�.
			
		StringBulider�Ķ����ǿɱ�--> StringBuilder����,���Ե��÷���,��������ֵ.
			 
	
	2:String ֱ�Ӹ�ֵ �� new ����������:---->�������
		String a = "abc";
		String b = new String("abc");
		// ���� a ָ�����  �������е� "abc"
		// ���� b ָ�����  ���еĶ���, �ö�����ָ�������� �� "abc"
		// ����:	ab �������, ��ַ�����.
		
		���� ���� equals();   100%û������


5:�����ַ���(�˽� ����)
	StringBuilder -----> �̲߳���ȫ �ٶȿ�
	StringBuffer  -----> �̰߳�ȫ   �ٶ���
	
	�����ַ��� �� String ƴ���ַ�����Ч�ʸ�.
	
	����ķ��� һ���Ƿ��� ������� .
	
	����Ҳ�кܶ���õķ���
	
6: �ܽ�:
	String�еķ���         ���޸������ֵ ----> ���ɱ�
		String str = "abc";
		String case1 = str.toUpperCase(); //�����ķ���ֵ �Ǵ�д, ����û�иı�
		System.out.println(case1);// "ABC"
		System.out.println(str); //  "abc"
		str = str.toUpperCase(); // String�Ķ������Ҫ���¸�ֵ���Լ�,�����޸�
		
	StringBuilder�еķ���  �޸������ֵ  ------> �ɱ�
		StringBuilder sb = new StringBuilder("abc");
		sb.append("123");
		System.out.println(sb);// abc123

-----------------------------------������----------------------------------------------
1:����ģʽ	
	����:
		����ֻ��һ������
	��ʽ:(��ʽ�кܶ�, ����������ܵ�������һ��---->����ʽ)
		class Xxx{
			private Xxx(){}
			private static Xxx x = new Xxx();
			public static Xxx getXxx(){
				return x;
			}
		}
		
2:��װ��: �������͵�������	
		int -----> Integer
		byte ----> Byte
		...
		
	��Ҫ�ķ���:
	 	int a = Integer.parseInt(�ַ�������ֵ);

3:String��
	1:��� String�Ĳ��ɱ���
	2:��� ֱ�Ӹ�ֵ  �� new String()��ֵ������
	3:String�ĳ��÷���----->(Ҫ����)
	
4:�����ַ���
	StringBuiler StringBuffer
		1:����
		2:�����ǿɱ�
		3:�����кܶ෽��(----�Ժ���������)
5:int Integer  string ���ߵ�ת�� (�ܳ���);
	int ---> Integer
		Integer a = 1;
	int ---> String
		String a = 1 + "";
	Integer ----> int
		int a = Integer����;
	Integer ---> String
		String a = nteger���� + "" ;
	string ----> int ;
		int a = Integer.parseInt(�ַ���);
	string ----> Integer ;
		Integer a = Integer.parseInt(�ַ���);

6:StringBuilder �� String ��ת��
	StringBuilder ---> String
			String s = sb.toString();
	String ---> StringBuilder
			StringBuilder sb = new StringBuilder(�ַ���);	
	




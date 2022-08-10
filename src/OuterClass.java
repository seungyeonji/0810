/*
 * Nested(static) Inner Class
 * 1. 생성법 : OuterClass.InnerClass 참조변수 = new OuterClass.InnerClass();   ->outer class의 주소 필요 x
 * 2. 제한사항 : static inner class는 OuterClass의 멤버변수/멤버메소드 접근 불가
 */
public class OuterClass {
	private String name = "한지민";	//Outer class member variable
	private static int age = 26; 		//Outer class static variable
	public void display() {		//Outer class member method
		System.out.println("name = " + this.name);
	}
	public static void print() {	//Outer class static method
		System.out.println("Age = " + age);
	}
	
	public static class InnerClass{	//static variable인 age랑 같은 성격 가짐
		public double avg = 89.5;	//Inner class member variable
		public static boolean flag = true;		//Inner class static variable
		public void show() {	//Inner class member method
			//display();	//static은 member에 접근할수 없다 -> 주소필요
			print();	//static은 static에 접근할수 있다
//			System.out.println("나이 = " + age);
//			System.out.println("이름 = " + name); 	//static은 멤버에 접근할수 없으니까 name의 주소 필요
		}
		public static void 출력하다() {		//inner class static method
			System.out.println("나이 = " + age);
//			System.out.println("이름 = " + name); 	//name은 member니까 무조건 주소 필요
		}
	}
}

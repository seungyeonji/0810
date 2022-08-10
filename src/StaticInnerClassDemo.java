/*
 * member는 static에 연결할 수 있으나,
 * static은 member에 연결할 수 없다
 * 주소를 이용해서 member에 연결할 수 있다
 */
public class StaticInnerClassDemo {
	public static void main(String[] args) {
//		OuterClass.print(); //static 변수인 age에 간접적으로 접근
		OuterClass.InnerClass inner = new OuterClass.InnerClass();	// OuterClass의 주소가 필요하지 않음 -> 주소없이 클래스이름으로 접근
//		System.out.println(inner.avg); 	//멤버변수 age -> 주소 필요
//		System.out.println(OuterClass.InnerClass.flag);  //flag와 InnerClass는 static이니까 주소없이 클래스이름으로 접근
		inner.show();
	}
}

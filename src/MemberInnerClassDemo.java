
public class MemberInnerClassDemo {
	public static void main(String[] args) {
		OuterClass1 out = new OuterClass1();		//바깥클래스의 참조변수(주소생성)
		OuterClass1.InnerClass1 inner =  out.new InnerClass1();		//바깥쪽 클래스의 주소(out.) + new + 생성자
//		System.out.println(inner.avg);  //member는 주소로 접근
		inner.show();
	}
}

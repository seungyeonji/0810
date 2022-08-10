
public class AnonymousInnerClassDemo {
	public static void main(String[] args) {
//		이때까지 하던 방식
//		Car car = new Car();
//		car.print();
		
		//Anonymous Class
//		Car car = new Car() {
//			@Override
//			public void print() {
//				System.out.println("Hello, Java World!!!");
//			}
//		};		// ; 꼭 넣어줘야함
//		car.print();
		
		
		//원래 재정의할때 나는 MyInterface의 자식이어야 하고, 재정의를 한번만 해야하는데 (또는 덧셈용, 곱셈용 자식을 두개 가지고, 재정의 두번 가능)
		//아래처럼 덧셈용, 곱셈용 이런식으로 여러개로 재정의할 수 있는거는 익명클래스 -> 새로운걸 만드는게 아니라 기존에 있는거를 재활용하는것(Override)
		MyInterface mi = new MyInterface() {
			@Override
			public int calculate(int a, int b) {
				return a+b;
			}
		};
		int result = mi.calculate(5, 7);
		System.out.println("result = " + result);
		
		mi = new MyInterface() {
			@Override
			public int calculate(int a, int b) {
				return a*b;
			}
		};
		result = mi.calculate(5, 7);
		System.out.println("result = " + result);
	}
}


public class AnonymousInnerClassDemo2 {
	public static void main(String[] args) {
//		Thread t = new Thread();
//		t.run();
//		System.out.println("나는 메인 메소드");
		
		//기존 인터페이스 재정의 -> 익명클래스 
		Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println("나는 쓰레드");
			}
		};	//세미콜론 까먹지말기
		t.run();
	}
}

//class MyThread extends Thread{
//	@Override
//	public void run() {
//		System.out.println("나는 쓰레드");
//	}
//}
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//comparator가 interface니까 자식 하나 만들거나, 익명클래스 써주는 방법 있음


public class AnonymousInnerClassDemo1 {
	public static void main(String[] args) {
		//자식클래스 Product 만들어 사용
		List<Product> list = Arrays.asList(new Product("볼펜",200), 
													new Product("키보드", 10000), 
													new Product("연필", 100), 
													new Product("마우스", 5000));
		
		
		//익명클래스 사용

		Collections.sort(list, new Comparator<Product>() {
			@Override
			public int compare(Product front, Product back) {
				return front.price - back.price;
			}
		});	//sort 메소드의 괄호안에 클래스가 들어있음
		System.out.println(list);
	}
}

import com.example.product.Ballpen;	//Ballpen클래스가 public 아니면 에러남 -> 패키지가 달라서 접근이 안되기 때문

public class PackageDemo extends Ballpen{
	public static void main(String[] args) {
		//Ballpen ballpen = new Ballpen();
//		PackageDemo pd = new PackageDemo();	//자식주소로 접근
		
//		Math m = new Math();	//Math클래스의 접근제한자가 private이기 때문에 new 못씀-> 주소로접근x
		
	}
}

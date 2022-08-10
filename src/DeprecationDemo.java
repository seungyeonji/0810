import java.util.Date;

public class DeprecationDemo {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.getYear()+1900); 	//getYear()가 deprecation됐다(Warning) -> 출력결과 : 122 =1900년부터 122년이 지났다 -> +1900해줘야됨
	}
}

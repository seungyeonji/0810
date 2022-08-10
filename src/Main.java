/*
 * 1. package
 *  - 생성된 클래스나 인터페이스나 enum --> 참조형 타입객체들을 분류해서 저장하는 방법
 *  - javac -d <path> : package의 시작폴더는 -d 옵션의 경로에 생성된다
 *  
 * 2. import
 *  - com을 찾는 위치 : 1)현재 디렉토리 2)Reference library(JRE system library)에서 찾고 3)classpath에서 찾고 4)그래도 못찾으면 Class Not Found
 */
import com.example.libs.*;
import com.example.product.Ballpen;

public class Main{
    public static void main(String [] args){
        //com.example.libs.Car sonata = new com.example.libs.Car("Silver Sonata");	//FQDN
//        Car sonata = new Car("Silver Sonata");	//import 써주는 경우
       // java.util.Date now = new java.util.Date();	//FQDN(Fully Qualified Domain Name)
//        System.out.println(sonata);    //sonata.toString()
        
        
        ////////////////////////
        Ballpen monami = new Ballpen();
//        System.out.println(monami.name);
        
        com.example.finance.Money money = new com.example.finance.Money();
        System.out.println(money.balance);
    }
}

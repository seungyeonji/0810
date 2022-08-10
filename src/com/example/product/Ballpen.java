package com.example.product;

public class Ballpen {	//public 안써주면 default(package)가 되니까 같은 package 안에서만 접근 가능함
	public Ballpen() {		//constructor도 접근제한자 마찬가지로 적용
		
	}
	
	protected String name = "모나미 볼펜";	//protected -> 부모자식관계라면 접근가능
}

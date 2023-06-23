package day10.static_.method;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		Count c = new Count();
		c.method01(); //일반
		c.method02(); //static
		
		//static메서드의 사용
		Count.method02(); 
		
		//main과 연관지어 생각, main은 static
		
		//static메서드의 사용예시
		Math.random();
		Arrays.toString(new int[3]);
		Integer.parseInt("3");
		String.valueOf(3);
		
		
		
	}
	
	
	
	
	
	
}

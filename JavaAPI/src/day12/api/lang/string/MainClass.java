package day12.api.lang.string;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
//		char[] arr = {'a', 'b', 'c'};
//		String str = new String(arr);
		
		
		String str = "안녕하세요~";
		System.out.println(str);
		
		//한글자 자르기
		char c = str.charAt(0);
		System.out.println(c);
		
		//찾으면 인덱스번호를 반환, 없다면 -1로 반환
		System.out.println( str.indexOf("안녕") );
		System.out.println( str.indexOf("xx") ); 
		
		if( str.indexOf("안녕") != -1) {
			System.out.println("문자에 값이 존재함");
		}
		//문자열 끝에서부터 값을 찾음
		System.out.println( str.lastIndexOf("안녕") );
		
		//contains - 있다면 true, 없으면 false
		if( str.contains("안녕") ) {
			System.out.println("문자에 값이 존재함");
		}
		
		//length - 길이
		System.out.println("문자열길이:" +  str.length() );
		
		
		System.out.println("---------------------------------");
		
		//문자열 변경 replace
		str = "자바의 기원은, 자바칩프라페치노 커피집에서 시작되었습니다";
		
		System.out.println( str.replace("자바", "java") );
		
		System.out.println( str.replaceFirst("자바", "java") );
		
		System.out.println( str.replace(" ", "") );

		
		System.out.println("----------------------------------");
		
		//문자열 자르기 substring
		System.out.println( str.substring(9) ); //9미만 절삭
		System.out.println( str.substring(9, 17)); //9이상 17미만 추출
		
		String[] arr = str.split(" ");
		System.out.println( Arrays.toString(arr) );
		
		String[] arr2 = str.split(" ", 3); //최대 배열의 길이는 3
		System.out.println( Arrays.toString(arr2) );
 		
		char[] arr3 = str.toCharArray(); //한글자씩 배열에 담는다.
		System.out.println( Arrays.toString(arr3) );
		
		 
		System.out.println("-----------------------------------");
		
		//문자열의 비교
		str = "홍길동";
		System.out.println( str.equals("홍길동") );
		
		//사전 등재순의 비교
		System.out.println( str.compareTo("홍길동") ); //0 - 같은문자
		System.out.println( str.compareTo("홍길자") ); //음수 - str이 홍길자 보다 사전등재순 앞에 위치함
		System.out.println( str.compareTo("홍길가") ); //양수 - str이 홍길가 보다 사전등재순 뒤에 위치함
		
		
		//특정 구분자로 문자열을 연결
		System.out.println( String.join("-", "hello", "world", "안녕", "하세요") );
		
		//기본타입을 문자열로 변경
		System.out.println( String.valueOf(1) + String.valueOf(2) );
		System.out.println( "" + 1 + 2);
		
		
		
		
		
		
	}
}

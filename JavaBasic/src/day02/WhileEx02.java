package day02;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		
		//반복문과 조건문
		//짝수의 합을 구하는 반복문
		//1~100까지 수 중에서 짝수의 합 => 100까지 반복도중에 짝수일때만 누적
		/*
		int a = 1;
		int sum = 0; //누적할 변수
		while(a <= 100) {
			if(a % 2 == 0) {
				sum += a;
			}
			a++;
		}
		System.out.println("1~100까지 짝수의 합:" + sum);
		 */


		
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력>");
		int size = scan.nextInt();
		
		int i = 1;
		int sum = 0; //합계누적
		
		while(i <= size) { 
			
			if(i % 2 == 0) { //2, 4, 6, 8, 10
				sum += i;
			}
			
			i++;
		}
		
		System.out.println("합:" + sum);
		
		
		
		
		
		
		
		
		
	}
}

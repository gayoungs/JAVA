package quiz01;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {
		
		/*
		 * updown게임
		 * 
		 * 1~100까지 랜덤한 수를 1번 생성합니다. (반복문 밖에서)
		 * 
		 * 스캐너를 통해서 값을 입력받습니다.
		 * 랜덤 수가 입력받은 값보다 작으면 "더 작은수를 입력하세요"
		 * 랜덤 수가 입력받은 값보다 크면  "더 큰수를 입력하세요"
		 * 
		 * 정답을 맞추면 시도횟수: x회 를 출력하고 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int num = (int)(Math.random() * 100) + 1; 
		
		int count = 0; //시도횟수
		
		while(true) {
			
			System.out.print("정답입력>");
			int answer = scan.nextInt();
			count++; //시도횟수 증가
			
			if(num == answer) { //정답
				System.out.println("정답!");
				System.out.println("시도횟수:" + count);
				break;
			} else if(num > answer) { //정답이 입력보다 큰경우
				System.out.println("더 큰수를 입력하세요!");
			} else { //정답이 입력보다 작은경우
				System.out.println("더 작은수를 입력하세요!");
			}
			
		}
		
		
		
		
		
		
		
	}
}

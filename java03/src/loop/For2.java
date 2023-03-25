package loop;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		// for문을 통해
		
		// 1. 안녕 5번
		for (int i=0; i<5; i++) {
			System.out.println("안녕");
		}
		
		// 2. 1~10까지 합계 구하기
		int sum=0;
		for (int j=0; j<11; j++) {
			sum+=j;
		}
		System.out.println("1~10까지의 합계: "+sum);
		
		// 3. 1~입력까지 합계
		int num;
		int sum_2=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오>> ");
		num=sc.nextInt();
		
		for(int k=0; k<num+1; k++) {
			sum_2+=k;
		}
		System.out.println("1~입력값까지의 합계: "+sum_2);
	}

}

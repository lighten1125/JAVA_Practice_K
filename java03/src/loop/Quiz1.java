package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		// 1. 1~10 중 짝수만 출력하기
		
		for(int i=0; i<10; i+=2) {
			System.out.println(i);
		}
		
		
		// 2. 비밀번호 맞추기 (기회는 5번, 정수, 맞추면 맞췄다하고 종료)
		
		int j =1;
		int input_n;
		int sec_n=950914;
		
		while(j<6) {
			System.out.print("비밀번호를 입력하시오 ("+j+"번째 시도) >>");
			input_n=sc.nextInt();
			
			if(input_n==sec_n) {
				System.out.println("비밀번호가 맞습니다");
				break;
			}
			
			else if(j==5) {
				System.out.println("접속불가");
			}
			
			j++;
		}
		
	}

}


//git add *
//git commit -m "메모 내용"
//git push origin master
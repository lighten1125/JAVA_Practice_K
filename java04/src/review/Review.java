package review;

import java.util.Scanner;

public class Review {
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
		
		//3. 시험합격 점수는 국어,영어,수학이 각각 40점이고, 총점수가 150점 이상이면 합격
		// 40점이하의 점수가 있으면 과락, 각 과목이 40점 이상이나 총점이 미달되었으면 총점미달
		
		int kor = 39; int eng =40; int math=40;
		
		if(kor<40 || eng<40 || math<40) {
			System.out.println("과락");
			
		}
		
		else if ((kor+eng+math)>=150) {
			System.out.println("합격");
		}
		
		else {
			System.out.println("총점 미달");
		}
		
		//4. 1~10까지의 합 구하기
		
		int sum=0;
		for(int k=1; k<11; k++) {
			sum+=k;

		}
		System.out.println("1~10까지의 합: "+sum);
		
		//5. 10~1까지 거꾸로 출력하기
		
		for(int l=10; l>0; l--) {
			System.out.println(l);
		}


	}
	
}

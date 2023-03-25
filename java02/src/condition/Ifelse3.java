package condition;

import java.util.Scanner;

public class Ifelse3 {

	public static void main(String[] args) {
		// 1. 20세 이상이면 성인, 14~20세는 청소년, 14세 미만은 어린이로 구분
		
		int age =0;
		System.out.print("나이를 입력하시오. :");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		
		if(age>=20) {
			System.out.println("성인입니다.");
		}
		else if (age>13) {
			System.out.println("청소년입니다.");
		}
		else if(age>0) {
			System.out.println("어린이입니다.");
		}
		else {
			System.out.println("마이너스 나이는 없습니다");
		}
		
		System.out.println("=================================");
		
		// 2. 학점 계산(90이상은 A, 80이상은 B, 70이상은 C, 그 미만은 F)
		
		int grade =0;
		System.out.print("성적을 입력하시오. :");
		Scanner i=new Scanner(System.in);
		grade=i.nextInt();
		
		if(grade>=90) {
			System.out.println("A.");
		}
		else if (grade>=80) {
			System.out.println("B.");
		}
		else if(grade>=70) {
			System.out.println("C.");
		}
		else {
			System.out.println("F.");
		}
		
		System.out.println("=================================");
		
		// 3. 비밀번호 생성 맞추면 맞습니다/ 틀리면 다릅니다
		
		int secret_n =0;
		int key= 950914;
		System.out.print("비밀번호를 입력하시오. :");
		Scanner n=new Scanner(System.in);
		secret_n=n.nextInt();
		
		if(secret_n==key) {
			System.out.println("비밀번호가 맞습니다.");
		}
		else {
			System.out.println("비밀번호가 다릅니다.");
		}
		
		System.out.println("================================="); 
		
		//4. 윤년 구하기
		
		int year =0;
		System.out.print("연도를 입력하시오. :");
		Scanner y=new Scanner(System.in);
		year=y.nextInt();
		
		if(year%4==0 && year%100==0) {
			
			if(year%400!=0) {
				System.out.println("평년");
			}
			else if(year%400==0) {
				System.out.println("윤년");
			}
			
		}
		else if (year%4==0) {
			System.out.println("윤년");
		}
		
		else {
			System.out.println("평년");
		}
		
		y.close();

	}

}

package condition;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		//사용자에게 입력받고 점수가 90점이상이면 우등생입니다. //출력
		
		int num =0; //초기화 항상 하기
		
		System.out.print("점수를 입력하시오: ");
		Scanner sc= new Scanner(System.in);
		
		num=sc.nextInt();
		
		if (num>=90) {
			
			System.out.println("우등생입니다.");
		}

	}

}

package review;

import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {
		int money;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("금액을 입력하시오>>");
		money=sc.nextInt();
		int 천 =0;
		int 천나머지;
		String str_n=null;
		
		if (money<=999) {
			System.out.println(money);
		}
		
		else if (money<=9999) {
			천= money/1000;
			천나머지=money%1000;
			if(천나머지<10) {
				str_n ="00"+천나머지;
			}else if(천나머지<100) {
				str_n="0"+천나머지;
			}else if(천나머지<1000) {
				str_n=""+천나머지;
			}
			System.out.println(천+","+천나머지);
			
		}
	}

}

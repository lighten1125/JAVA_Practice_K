package loop;

import java.util.Scanner;

public class While3 {
	public static void main(String[] args) {
		int i= 0;
		int sum=0;
		
		while (i<11) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		int num;
		int n=0;
		int sum_2=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		num=sc.nextInt();
		
		while(n<num+1) {
			sum_2+=n;
			n++;
		}
		System.out.println(sum_2);
	}
	
}

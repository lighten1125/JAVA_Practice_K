package array;

import java.util.Scanner;

public class Arr4 {
	public static void main(String[] args) {
		
		String nat[] = {"대한민국","일본","중국","미국","러시아"};
		
		String cap[] = new String[5];
		
		cap[0]="서울";
		cap[1]="도쿄";
		cap[2]="베이징";
		cap[3]="워싱턴";
		cap[4]="모스크바";
		
		for(int i=0;i<nat.length;i++) {
			System.out.println(nat[i]+"의 수도는 <"+cap[i]+">");
		}
		
		//사용자가 입력으로 국가를 받아서 해당 국가의 수도를 알려주는 코드 만들기

		String input_s;
		int temp=-1; //배열을 사용할 때는 보통 -1로 설정
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수도를 알고자하는 국가의 이름을 입력하시오: ");
		input_s=sc.next();
		
		for(int j=0; j<nat.length;j++) {
			if(nat[j].equals(input_s)){
				temp=j;
				break;
				//System.out.println(nat[temp]+"의 수도는: "+cap[temp]);
			}		
		}
		
		if(temp==-1) {
			System.out.println("해당 국가가 없습니다");
		}
		else {
			System.out.println(nat[temp]+"의 수도는: "+cap[temp]);
		}
	}
}

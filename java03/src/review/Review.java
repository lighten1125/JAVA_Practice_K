package review;

public class Review {
	public static void main(String[] args) {
		//if 문
		//if ! else if ~else
		//if(){} : ()에는 조건식을, {}에는 코드를 넣는다
		
		//예제 : 버스카드 (20세 이상이면 성인입니다ㅏ 1000원, 14~19세면 
		//청소년입니다 650원, 13세 이하ㅏ면 400원)
		
		int age = 19;
		int money=0;
		if(age>19) {
			System.out.println("성인입니다.");
			money=1000;
			
		}
		else if (age>13) {
			System.out.println("청소년입니다.");
			money=650;
			
		}
		else {
			System.out.println("어린이입니다.");
			money=400;
		}
		
		System.out.println(money+"원");
		
	}

}

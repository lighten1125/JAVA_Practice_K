package operator;

public class Review {

	public static void main(String[] args) {
		String str="글자를 저장";
		int num = 0;
		
		System.out.println(num);
		System.out.println("나는 "+str+num);
		
		String 문자열더하기 = "글자를"+"붙이기";
		int 정수더하기 = 3+4;
		int 정수빼기 = 3-4;
		int 정수곱하기 = 3*4;
		int 정수나누기 = 3/4;
		double 실수나누기 = 3.0/(double)4;
		
		System.out.println(정수더하기);
		System.out.println(정수빼기);
		System.out.println(정수곱하기);
		System.out.println(정수나누기);
		System.out.println(실수나누기);
		
		
		System.out.println(3>4);
		System.out.println(3<4);
		System.out.println(3>=4);
		System.out.println(3<=4);
		System.out.println(3==4);
		System.out.println(3!=4);
		
		// 글자 = "abc";
		String 변수1;
		변수1 = "이미 만들어져있는 변수에는 자료형을 적는다";
		String 변수2 = "새로 만드는 변수에는 자료형을 적어줘야한다";
		
		System.out.println(변수1+변수2);

	}

}

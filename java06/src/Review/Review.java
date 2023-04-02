package Review;

public class Review {
	public static void main(String[] args) {
		//클래스와 메서드
		//객체지향기법 : 클래스기반, 클래스 정의와 객체화를 많이 해봐야함
		//객체화
		
		//클래스명 변수명 = new 클래스명();
		MyModel mm=new MyModel(); 	//다른 클래스의 변수나 메서드를 사용하려면 '객체화'
		MyModel mm2=new MyModel(); 	// 객체가 다르면 형태와 메서드는 같지만 변수가 다름
		
		mm.setStr("안녕");
		mm2.setStr("반갑");
		mm.setNum(111);
		mm2.setNum(222);
		
		Myview mv=new Myview();
		mv.printStr(mm);
		mv.printStr(mm2);
		
		mv.printNum(mm);
		mv.printNum(mm2);
	}
	
	
}

class MyModel{
	
	//멤버변수
	int num;
	String str;
	
	//메서드
	//1. num변수에 값을 넣기
	void setNum(int num) {
		this.num=num;
	}
	
	//2. num변수 사용하기
	int getNum() {
		return num;
	}
	
	// 3.str 값 넣기
	void setStr(String str) {
		this.str=str;
	}
	
	//4. str값 사용하기
	String getStr() {
		return str;
	}
	
	
}

class Myview{
	void printNum(MyModel mm) {
		System.out.println(mm.num);
	}
	
	void printStr(MyModel mm) {
		System.out.println(mm.str);
	}
}


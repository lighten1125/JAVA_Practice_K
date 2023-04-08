package cls;

public class Review {
	public static void main(String[] args) {
		//다른 클래스의 변수나 메서드를 사용하기 위해선 '객체화'
		//클래스명 변수명 = new 클래스명();
		Re r1 = new Re();
		
		r1.setStr("hello");
		System.out.println(r1.getStr());
		
	}

}

//클래스: 변수+함수
class Re{
	//private 멤버변수
	private String str;
	
	//public 메서드
	public void setStr(String str) {
		this.str=str;
	}
	
	public String getStr() {
		return str;
	}
	
	public Re() {
		System.out.println("객체화에 성공했습니다.");
	}
}
package extand;

public class Ex2 {
	public static void main(String[] args) {
		//상속 : 내 눈에는 안보이지만 컴퓨터가 클래스를 복사 붙여넣기를 하게한다.
		//상속 : 물려주다(어떤 클래스에 있는 변수와 메서드를 다른 클래스에 물려준다)
		// extends
		
		person p1 = new person();
		p1.정보입력("홍길동", 16, false);
		p1.정보보기();
		
		Member m1= new Member();
		m1.정보입력("유관순",19, true);
		m1.정보보기();
		
	}

}

//사람 클래스
class person{
	// private -> protected : 상속에 한해서는 허용 (private= 자신 클래스 말고는 다 사용 불가능)
	
	protected String name;
	private int age;
	private boolean gender;
	
	public void 정보입력(String name, int age, boolean gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public void 정보보기() {
		System.out.print("이름: "+name+", 나이: "+age+", 성별: ");
		if(gender==false) {
			System.out.println("남성");
		}
		else {
			System.out.println("여성");
		}
	}
}

// 회원 클래스(회원도 사람 - 사람에게 있는 변수와 메서드를 회원에게 물려주자!)
class Member extends person{
	// person 클래스 복사해서 Member 클래스에 붙여넣어라
	//extends 상속을 하는 이유는 수정, 추가를 위해서
	
	private String 그룹명 = "우리그룹";
	
	public void 회원정보() {
		System.out.println(그룹명+"의 회원인 "+name+"입니다.");
	}
	
	//오버라이딩 : 물려받은 메서드를 재정의(다시 만든다)
	
	public void 정보보기() {
		super.정보보기(); //super. :상속받은 클래스의 정보보기를 사용
		// this. :나, super. : 부모
		System.out.println("회원그룹은 "+그룹명);
		
		// 오버라이딩(수정): 부모의 것과 나의 것이 곂치면 나의 것의 우선순위가 더 높다 
	}
}
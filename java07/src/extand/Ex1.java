package extand;

public class Ex1 {
	public static void main(String[] args) {
		Human 홍씨 = new Human("홍길동", 16);
		홍씨.말하기();
		홍씨.걷기();
		홍씨.밥먹기();
		
		System.out.println("=======================");
		
		HumanEx 박씨 = new HumanEx("박첨지",18);
		박씨.말하기();
		박씨.밥먹기();
		박씨.걷기();
		
		System.out.println("=======================");
		
		HumanDeco 이씨 = new HumanDeco("이이",22);
		이씨.나이정보();
		//이때, 원본에 버그가 발생해서 수정해야하면?
	}

}

//사람(Human) 클래스
class Human{
	// 이름, 나이, 성별, 키, 몸무게
	// name, age
	
	private String name;
	private int age;
	
	Human(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//말하기, 걷기, 밥먹기
	public void 말하기() {
		System.out.println(name+"(이)가 말합니다");
	}
	public void 걷기() {
		System.out.println(name+"(이)가 걷습니다");
	}
	public void 밥먹기() {
		System.out.println(name+"(이)가 밥을 먹습니다");
	}
}

class HumanEx{
	// 이름, 나이, 성별, 키, 몸무게
	// name, age
	
	private String name;
	private int age;
	
	HumanEx(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//말하기, 걷기, 밥먹기
	public void 말하기() {
		System.out.println(name+"("+age+")(이)가 말합니다");
	}
	public void 걷기() {
		System.out.println(name+"("+age+")(이)가 걷습니다");
	}
	public void 밥먹기() {
		System.out.println(name+"("+age+")(이)가 밥을 먹습니다");
	}
}

class HumanDeco{
	// 이름, 나이, 성별, 키, 몸무게
	// name, age
	
	private String name;
	private int age;
	
	HumanDeco(String name, int age) {
		this.name=name;
		this.age=age;
	}
	//말하기, 걷기, 밥먹기
	public void 말하기() {
		System.out.println("=="+name+"(이)가 말합니다");
	}
	public void 걷기() {
		System.out.println("=="+name+"(이)가 걷습니다");
	}
	public void 밥먹기() {
		System.out.println("=="+name+"(이)가 밥을 먹습니다");
	}
	public void 나이정보() {
		System.out.println("=="+name+"의 나이는"+age+"살 입니다.");
	}
	
}
package cls;

public class Class7 {
	public static void main(String[] args) {
		Human a = new Human();
		a.setName("조경원");
		a.setGender("남");
		a.setAge(22);
		
		HumanView b = new HumanView();
		b.printInfo(a);
		
		
	}

}

//멤버 변수 private

class Human{
	// 데이터: name, gender, age
	private String name;
	private String gender;
	private int age;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	
}

class HumanView{
	void printInfo(Human mm) {
		//이름, 성별, 나이를 한번에 안내(출력)
		System.out.println("이름-성별-나이: "+mm.getName()+"-"+mm.getGender()+"-"+mm.getAge());
	}
}

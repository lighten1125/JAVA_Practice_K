package cls;

public class Constructor2 {
	public static void main(String[] args) {
		Person m1 = new Person("조경원",22);
		Person m2 = new Person("이순신",23);
		
		PersonView pv1=new PersonView();
		PersonView pv2=new PersonView(m2);
		
		pv1.info(m1); //들어온 값을 저장하고 정보출력
		pv2.info();	//info : 바로 정보출력
		
	}

}

class Person {
	//멤버변수 : 이름, 나이
	private String name;
	private int age;
	
	//생성자 (생성자 통해서 멤버변수 초기화)
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//게터섹터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

class PersonView{
	private Person person;
	
	public PersonView() {}
	
	public PersonView(Person person) {
		this.person=person;
	}
	
	//생성자: 받아온 객체를 멤버변수에 백업
	
	//메서드(멤버변수 출력용)
	public void info() {
		System.out.println("이름: "+person.getName()+", 나이: "+person.getAge());
	}
	
	public void info(Person person) {
		this.person=person;
		System.out.println("이름: "+person.getName()+", 나이: "+person.getAge());
	}
}

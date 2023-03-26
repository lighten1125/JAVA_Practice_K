package array;

public class Arr2 {
	public static void main(String[] args) {
		//배열
		// 하나의 주제로 여러 변수를 묶기위해 만듦
		
		// ex) 카페에서 커피메뉴를 전시해야한다
		
		String menu1="에스프레소";
		String menu2="아메리카노";
		
		String menus[]= {"아메리카노","에스프레소","카페라떼","카페모카","오렌지주스"};
		
		int arr_size=menus.length;
		System.out.println("메뉴의 총갯수: "+arr_size);
		
		for(int i=0; i<menus.length;++i) {
			System.out.println(menus[i]);
			
		}
		System.out.println("=="+menus[0]+"==");
		
		menus[0]="배열요소 바꾸기";
		System.out.println("=="+menus[0]+"==");
		
		int nums[];
		nums = new int[3];
		
		
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
				
	}

}

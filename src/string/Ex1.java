package string;

public class Ex1 {

	public static void main(String[] args) {
		
		// 리터럴 방식으로 문자열 객체 생성
		String str1 = "test";
		String str2 = "test";
		
		// new연산자 방식으로 문자열 객체 생성
		String str3 = new String("test");
				
		System.out.println(str1 == str2); // 상수 풀에 같은 주소값에 값을 공유
		System.out.println(str1 == str3); // str3는 힙 영역에 새로운 인스턴스 생성해서 값을 공유 못함(주소값이 다름)
		
		//리터럴 방식 객체의 주소값을 원하면 hashCode()로 접근 
		System.out.println(str1.hashCode());
	}

}


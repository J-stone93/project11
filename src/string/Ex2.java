package string;

public class Ex2 {

	public static void main(String[] args) {
		
		String str = "test";
		System.out.println("str 문자열 값: " + str + ", 주소: " + str.hashCode());
		
		
		// 기존의 test가 있는 인스턴스를 버리고 aaa가 있는 인스턴스를 가르킨다.
		str = "aaa";
		System.out.println("str 문자열 값: " + str + ", 주소: " + str.hashCode());
		
		
		
	}

}


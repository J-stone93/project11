package object;

public class Ex5 {

	public static void main(String[] args) {
		
		String str1 = new String("test");

		System.out.println(str1.toString());
		System.out.println(str1);

		String str2 = new String("test");
		
		System.out.println(str1.equals(str2));
		//String(클래스)은 주소값이 아니라 값 자체를 리턴하게 재정의 되어 주소가 다르더라도 값이 같으면 true
		if (str1.equals(str2)) {
			System.out.println("str1와 str2는 같은 문자열입니다.");
		}

	}

}

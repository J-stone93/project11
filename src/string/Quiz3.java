package string;

public class Quiz3 {

	public static void main(String[] args) {

		String str1 = "자바 프로그래밍 입문";

//		System.out.println(str1.substring(0, 2));
//		System.out.println(str1.substring(3, 8));
//		System.out.println(str1.substring(9, 11));
//		
//		String str2 = str1.substring(0, 2) + str1.substring(3, 8) + str1.substring(9, 11);
//		System.out.println(str2.length());

		
		int cnt = 0;

		for (int i = 0; i < str1.length(); i++) {
			//문자하나씩 비교 할때 공백이 아니면 cnt 1씩 증가
			if (str1.charAt(i) != ' ') {
				cnt++;
			}
		}
		
		System.out.println(str1.length());
		System.out.println(cnt);
	}
	
		
	
}




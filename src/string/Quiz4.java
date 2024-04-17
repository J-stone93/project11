package string;

public class Quiz4 {

	public static void main(String[] args) {

		System.out.println(getCharCount("자바 프로그래밍 입문"));
		System.out.println(getCharCount("av라는 문자열을 포함하는지 확인하기"));
		
	}

	public static int getCharCount(String str) {
		int cnt = 0;

		for (int i = 0; i < str.length(); i++) {
			//문자하나씩 비교 할때 공백이 아니면 cnt 1씩 증가
			if (str.charAt(i) != ' ') {
				cnt++;
			}
		}
		return cnt;
	}
}


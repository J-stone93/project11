package string;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		int i = str.length() - 1;
		while (i >= 0) {
			System.out.print(str.charAt(i));
			i--;
		}

		for (int j = 4; j >= 0; j--) {
			System.out.print(str.charAt(j));
		}

		// 4.StringBuilder 클래스 사용
		StringBuilder builder = new StringBuilder(str);
		builder.reverse(); // 문자열을 거꾸로 변경하기
		System.out.println(builder.toString());
	}

}

package string;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {

		System.out.println("문장을 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		//endsWith("end")
		int i = 0;
		while (i >= 0 ) {
			String str2 = scanner.nextLine();
			if(str2.endsWith("end") || str2.endsWith("END")) {
				break;
			}
		} 
	}

}

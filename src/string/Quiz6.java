package string;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//endsWith("end")
		while (true) { 
			System.out.print("문장을 입력하세요:");
			String str = scanner.nextLine();
//			if(str.endsWith("end") || str.endsWith("END")) {
//			if(str.toLowerCans().equals("end")) {
			if(str.equalsIgnoreCase("end")) {
				break;
			}
		} 
	}

}

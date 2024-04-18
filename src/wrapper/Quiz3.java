package wrapper;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String num1 = scanner.nextLine();
		String num2 = scanner.nextLine();
		
		int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
		System.out.println("두 수의 합: " + sum);
		System.out.println("문자열로 받기 때문에 그냥 더하면 " + num1 + num2);
	}
	
}

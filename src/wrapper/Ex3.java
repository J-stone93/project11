package wrapper;

public class Ex3 {

	public static void main(String[] args) {

		//문자열을 사용하여 Integer 객체 생성 (객체로 반환)
		Integer iNum1 = Integer.valueOf("100"); //valueOf = 값변환 오버로딩 static
		
		//정수를 사용하여 Integer 객체 생성
		Integer iNum2 = Integer.valueOf(100);
		
		//문자열을 숫자타입으로 변환 (기초타입으로 반환)
		int num = Integer.parseInt("100");
		System.out.println("정수로 변환된 값: " + num);
		
		//숫자를 문자열타입으로 변환
		//Integer타입이 String타입의 toString을 주소값이 아니라 값을 반환하게 재정의함
		String str = iNum1.toString(); 
		System.out.println("문자열로 변환된 값: " + str); 
		
				
		
	}

}









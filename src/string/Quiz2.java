package string;

public class Quiz2 {

	public static void main(String[] args) {
		
		String pin1 = "881120-1068234";
		String pin2 = "781330-2363614";
		
		
		char gender = pin2.charAt(7);
		
		if(gender == '1' || gender == '3') {
			System.out.println("성별은 남자입니다.");
		} else if (gender == '2' || gender == '4') {
			System.out.println("성별은 여자입니다.");			
		} else {
			System.out.println("잘못된 주민번호 입니다.");
		}
	}

}


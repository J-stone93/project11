package object;

public class Ex3 {

	//equals함수가 주소를 비교하고 싶으면 원형 그대로 사용하고
	//입력값을 비교하고 싶으면 override해서 값을 비교하게 다운캐스팅 해줌
	public static void main(String[] args) {

		Student student1 = new Student(1001, "둘리");
		Student student2 = new Student(1001, "둘리");
		
		if (student1 == student2) {
			System.out.println("student1와 student2의 주소는 같습니다.");
		} else {
			System.out.println("student1와 student2의 주소는 다릅니다.");			
		}
		
		if (student1.equals(student2)) {
			System.out.println("student1와 student2의 같은 학생입니다.");			
		} else {
			System.out.println("student1와 student2의 다른 학생입니다.");						
		}
		
	}

}

class Student {

	int id; // 학번
	String name; // 학생 이름

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

//	@Override
//	public boolean equals(Object obj) {
//
//		if (obj instanceof Student) {
//			Student student = (Student) obj;
//
//			if (this.id == student.id) {
//				return true;
//			}
//		}
//		return false;
//	}

}

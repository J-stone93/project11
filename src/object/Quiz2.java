package object;

public class Quiz2 {
	
	public static void main(String[] args) {
		
		Object object = new Student(1001, "둘리");
		
		if (object instanceof Student) {
			Student student = (Student) object;
			
			System.out.println(student.id);
			System.out.println(student.name);
		}
	}
}

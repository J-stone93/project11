package object;

public class Ex4 {

	public static void main(String[] args) {
		
		Book book = new Book(200, "개미");
		
		System.out.println(book.toString());
		System.out.println(book); // 참조변수book == book.toString()과 같음 (생략되어 있음)
		
		Book book2 = book;
		System.out.println(book.hashCode());
		System.out.println(book2.hashCode());
		System.out.println(book2);
		
		

	}

}
class Book {
	
	int bookNumber;
	String bookTitle;
	
	public Book(int bookNumber, String bookName) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookName;
	}

	// source -> generate tostring 메뉴
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
	}

}





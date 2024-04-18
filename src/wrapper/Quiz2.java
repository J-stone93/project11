package wrapper;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<Character>();
		
		list.add('a'); //오토박싱
		list.add('b');
		list.add('c');
		list.add('d');
		
		
		for (Character character : list) { //둘다 랩퍼타입이라 언박싱이 안 일어남 
			System.out.println(character); 
		}
		
		for (int i = 0; i < list.size(); i++) {
			char ch = list.get(i); //언박싱
			System.out.println(ch);
		}
	}

}

package wrapper;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {

		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
		list.add(true); //new Boolean(true)로 인스턴스 변환됨 (오토박싱)
		list.add(true);
		list.add(false);
		
		boolean b = list.get(0);
		//list.get(0).booleanValue()로 변환됨 (언박싱) Boolean랩퍼타입인데 기초타입으로 변환 
		
				
		
	}

}









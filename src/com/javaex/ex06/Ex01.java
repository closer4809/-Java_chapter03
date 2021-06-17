package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i01 = new Integer(10);
		Integer i02 = new Integer(7);
		
		Integer result = i01 + i02;
//		Integer result = new Integer(10) + new Integer(7);
		System.out.println(result);

		int i10 = 7;
		i01.intValue(); // 메소드 사용가능
		
		//박싱
		Integer i11 = 10;	// Ingeter i11 = new Integer(10);
		
		//언박싱
		int i101 = i11;
		System.out.println(i101);
	
		System.out.println("-문자열-->정수--------------------");
		
		
		//"12345" --> 12345 예제
		Integer i999 = new Integer(2323); 
		int num = i999.parseInt("12345");
		System.out.println(num);
	
		//"12345" --> 12345 실제 사용
		
		int num2 = Integer.parseInt("12345");
		System.out.println(num2);
		
		//정수 --> 문자열로 예제
		String str = new String("hi");
		String strResult = str.valueOf(123456);
		System.out.println(strResult);
		
		//정수 --> 문자열로 실제사용
		String strResult2 = String.valueOf(123456);
		System.out.println(strResult2);
		
		//정수 --> 문자열로 많이사용
		String strResult3 = ""+ 9876;    //"9876" --> 9876
		System.out.println(strResult3);
		
		String yn = "y"; // 사용자가 입력한값
		//String yn = new String("y");
		yn = null;
		
	
		if(yn.equals("y")) {
			System.out.println("게임 다시 시작");
		}

		//equals() 사용팁 --> 널포인트 상황이 발생하지 않는다.
		if("y".equals(yn)) {
			System.out.println("게임 다시 시작");
		}
		
	}
	

}

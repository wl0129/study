package study.chap03;

//concatenation: 연결 (뒤에 계속 추가)
public class StringConcat {

	public static void main(String[] args) {
		String str = "JDK" + 6.0; //"JDK6.0"
		//"JDK"+"6.0" (자동형변환) = "JDK6.0"
		System.out.println(str);
		String str2 = "JDK" + 3 + 3.3;//"JDK3"+ 3.3="JDK 33.3"
		System.out.println(str2);
		String str3= 6+ 3.2 + "JDK"; // "9.2 JDK" (숫자의 더하기가 이루어진 후 + 문자열 Concat가 발생)
		System.out.println(str3);
	
		
	}

}

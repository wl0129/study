package study.chap03;

//concatenation: ���� (�ڿ� ��� �߰�)
public class StringConcat {

	public static void main(String[] args) {
		String str = "JDK" + 6.0; //"JDK6.0"
		//"JDK"+"6.0" (�ڵ�����ȯ) = "JDK6.0"
		System.out.println(str);
		String str2 = "JDK" + 3 + 3.3;//"JDK3"+ 3.3="JDK 33.3"
		System.out.println(str2);
		String str3= 6+ 3.2 + "JDK"; // "9.2 JDK" (������ ���ϱⰡ �̷���� �� + ���ڿ� Concat�� �߻�)
		System.out.println(str3);
	
		
	}

}

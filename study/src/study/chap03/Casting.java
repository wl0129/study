package study.chap03;
/*
 * ???���??�� : ?��?��???���??��, 강제???���??��
 * ?��?��???���??��: ???��. ?��?��
 * 
 */

public class Casting {
public static void main(String[] args) {
	System.out.println("문자?��"+ 10);//(?��?��???���??��)
	boolean flag = true;
	System.out.println("flag="+flag);
	byte byteValue = 10;
	byte Value = (byte)(byteValue + byteValue); 
	short sValue=10;
	sValue =(short)(sValue + sValue);
}
}

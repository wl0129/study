package study.chap03;
/*
 * ???λ³?? : ?????λ³??, κ°μ ???λ³??
 * ?????λ³??: ???. ?°?°
 * 
 */

public class Casting {
public static void main(String[] args) {
	System.out.println("λ¬Έμ?΄"+ 10);//(?????λ³??)
	boolean flag = true;
	System.out.println("flag="+flag);
	byte byteValue = 10;
	byte Value = (byte)(byteValue + byteValue); 
	short sValue=10;
	sValue =(short)(sValue + sValue);
}
}

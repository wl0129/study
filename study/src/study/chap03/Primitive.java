/*
		 * ?°?΄?° ???
		 * ? ?
		 *  char:  2byte (κ΅?? ?΄λ₯? μ§???κΈ? ??΄ unicodeλ₯? μ§??)
		 *  		0~2? 16?Ή -1 κΉμ? (??? ??€.)
		 *  c?Έ?΄? char? ?λ°μ?? byte?? κ°λ€.
		 *  long  8 byte -> c ?Έ?΄? long long ? ???
		 *  ?€?  c ?Έ?΄?? ??Ό  (float , double)
		 *  ?Όλ¦? μ°? (true) κ³? κ±°μ§ (flase) ? ???₯ -> 1byte
		 *  unsigned ?°?΄?° ????? ??€. 
		 */
package study.chap03;

public class Primitive {//?΄??€ ?΄λ¦μ? ??λ¬Έμλ‘? ??

	public static void main(String[] args) {// λ©μ? ?΄λ¦μ? ?λ¬Έμλ‘? ??
		byte b1= 0x23;
		char c1= '?';
		short s1=432;
		int num= 30;   // defaultrk int 
		long ll= 234L; // long?? ???κΈ? ??΄ L? μΆκ? κΈ°μ  
		float f1=0.43f; //float ??? λ¦¬ν°?΄? fλ₯? λΆμ¬μ€??€. 
		double d1=0.54; // default κ°? double 
		boolean flag = true; //?Όλ¦¬ν 
		System.out.println("b1 ="+b1);
		System.out.println("c1="+c1);
		System.out.println("s1="+s1);
		System.out.println("num="+num);
		System.out.println("ll="+11);
		System.out.println("f1="+f1);
		System.out.println("d1="+d1);
		System.out.println("flag="+flag);
		
	}

}

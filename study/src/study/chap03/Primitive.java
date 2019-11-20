/*
		 * ?°?´?„° ???…
		 * ? •?ˆ˜
		 *  char:  2byte (êµ?? œ?–´ë¥? ì§??›?•˜ê¸? ?œ„?•´ unicodeë¥? ì§??›)
		 *  		0~2?˜ 16?Š¹ -1 ê¹Œì? (?Œ?ˆ˜?Š” ?—†?‹¤.)
		 *  c?–¸?–´?˜ char?Š” ?ë°”ì—?„œ?Š” byte?? ê°™ë‹¤.
		 *  long  8 byte -> c ?–¸?–´?˜ long long ?— ???‘
		 *  ?‹¤?ˆ˜  c ?–¸?–´?? ?™?¼  (float , double)
		 *  ?…¼ë¦? ì°? (true) ê³? ê±°ì§“ (flase) ?„ ???¥ -> 1byte
		 *  unsigned ?°?´?„° ???…?? ?—†?‹¤. 
		 */
package study.chap03;

public class Primitive {//?´?˜?Š¤ ?´ë¦„ì? ??ë¬¸ìë¡? ?‹œ?‘

	public static void main(String[] args) {// ë©”ì†Œ?“œ ?´ë¦„ì? ?†Œë¬¸ìë¡? ?‹œ?‘
		byte b1= 0x23;
		char c1= '?•œ';
		short s1=432;
		int num= 30;   // defaultrk int 
		long ll= 234L; // long?„?„ ?‘œ?‹œ?•˜ê¸? ?œ„?•´ L?„ ì¶”ê? ê¸°ìˆ  
		float f1=0.43f; //float ?˜•?ƒœ?˜ ë¦¬í„°?Ÿ´?„ fë¥? ë¶™ì—¬ì¤??‹¤. 
		double d1=0.54; // default ê°? double 
		boolean flag = true; //?…¼ë¦¬í˜• 
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

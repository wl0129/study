package study.chap05;

import java.util.Calendar;
import java.util.Scanner;

public class EnumExample {

	public static void main(String[] args) {
		week now = week.MONDAY;// ��ü
		//�ð�
		Calendar cur = Calendar.getInstance();//����ð�
		int year = cur.get(Calendar.YEAR);// Calendar.YEAR : enum�� 
		System.out.println("�⵵: "+year);
		int month = cur.get(Calendar.MONTH);
		int date = cur.get(Calendar.DATE);
		
		System.out.println(year+"��"+(month+1)+"��"+date+"��");
		cur.set(2020,10,11);
		System.out.println("2020/10/11: "+cur.get(Calendar.DAY_OF_MONTH));
		if(now==week.MONDAY) {
			System.out.println("�������Դϴ�.");
		}else if (now ==week.TUESDAY) {
			System.out.println("ȭ�����Դϴ�.");
		}System.out.println(now);
		int diff =now.compareTo(week.FRIDAY);
		System.out.println(diff);
		//���ڿ��� �Է� �޾Ƽ� EnumŸ������ ��ȯ: "MONDAY"->week.MONDAY
		Scanner scanner = new Scanner(System.in);
//		String week = scanner.next();
//		week w1 = week.valueOf(week);//���ڿ�-> Enum ��ü�� ��ȯ
		int num=12;
		String str= String.valueOf(num);
		String str1="13";
		int num1= Integer.valueOf(str1);
		week arr[]=study.chap05.week.values();
	}
}

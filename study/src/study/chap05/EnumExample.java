package study.chap05;

import java.util.Calendar;
import java.util.Scanner;

public class EnumExample {

	public static void main(String[] args) {
		week now = week.MONDAY;// 객체
		//시간
		Calendar cur = Calendar.getInstance();//현재시간
		int year = cur.get(Calendar.YEAR);// Calendar.YEAR : enum을 
		System.out.println("년도: "+year);
		int month = cur.get(Calendar.MONTH);
		int date = cur.get(Calendar.DATE);
		
		System.out.println(year+"년"+(month+1)+"월"+date+"일");
		cur.set(2020,10,11);
		System.out.println("2020/10/11: "+cur.get(Calendar.DAY_OF_MONTH));
		if(now==week.MONDAY) {
			System.out.println("월요일입니다.");
		}else if (now ==week.TUESDAY) {
			System.out.println("화요일입니다.");
		}System.out.println(now);
		int diff =now.compareTo(week.FRIDAY);
		System.out.println(diff);
		//문자열을 입력 받아서 Enum타입으로 변환: "MONDAY"->week.MONDAY
		Scanner scanner = new Scanner(System.in);
//		String week = scanner.next();
//		week w1 = week.valueOf(week);//문자열-> Enum 객체로 변환
		int num=12;
		String str= String.valueOf(num);
		String str1="13";
		int num1= Integer.valueOf(str1);
		week arr[]=study.chap05.week.values();
	}
}

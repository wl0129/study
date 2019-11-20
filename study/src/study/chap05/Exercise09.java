package study.chap05;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		//차이점 : 점수를 입력 받는다 -> 최고점수와 평균점수
		//점수: 최솟값=0,최댓값=100
		//최대값에 대한 초기치 : 
		//메뉴를 선택 : 1. 학생수 (배열의 크기) -> 배열에 저장하지 않아도 된다. -> 배열을 재사용 
		//			2. 점수입력->배열에 저장, 최대값과 합을 구한디.
		//			3.점수리스트:  배열을 출력
		//			4.분석: 최고점수, 평균출력
		//			5.종료-> run=false
		
		int max= -1;// 초기치는 최솟값-> 입력 데이터는 최대값
		boolean run= true;//메뉴를 입력 받기 위한 반복문
		int studentNum=0;
		Scanner scanner= new Scanner(System.in);
		int scores[] = null;//1차원 배열 선언 (참조변수)
		int sum;
		double avg;
		
		while(run) {// 무조건 반복
			//특정조건: 종료메뉴를 선택-> 반복문을 벗어나도록 처리 
			System.out.println("______________________________________________");
			System.out.println("1.학생수| 2.점수입력 | 3.점수리스트| 4.분석 | 5.종료");
			System.out.println("_______________________________________");
			System.out.print("선택>  ");
			
			int selectNo = scanner.nextInt();//int 입력(메뉴)
			
			if(selectNo == 1) {
				//학생수>3
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				//배열을 생성
				scores = new int [studentNum];// 1차원 배열을 생성 
				
			}
			else if(selectNo == 2) {
				//학생수만큼 점수를 입력
				//scores[0]>80
				for(int i =0; i<studentNum;i++) {
					System.out.println("scores["+i+"]");
					scores[i] = scanner.nextInt();
				}
				//최대값과 합 과 평균
				
			}else if (selectNo == 3) {
				for(int i = 0; i<studentNum; i++) {
					//scores[0]: 85
					System.out.println("scores["+i+"]"+scores[i]);
				}
			}else if (selectNo ==4) {//분석 최고점수, 평균점수 출력
				//최고점수 : 95
				// 평균점수: 91.0
				max =-1; //메뉴를 선택할할 때 마다 다시 계산
				sum= 0;
				for(int i=  0; i<studentNum ; i ++) {
					if(max<scores[i])
						max = scores[i];
					//합을 구한다.
					sum += scores[i];
				}
				avg=(double) sum / studentNum;
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수: "+ avg);
			}else if (selectNo == 5)
				run = false;
			
		}
		System.out.println("프로그램 종료");
	}

}

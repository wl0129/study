package study.chap05;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		//������ : ������ �Է� �޴´� -> �ְ������� �������
		//����: �ּڰ�=0,�ִ�=100
		//�ִ밪�� ���� �ʱ�ġ : 
		//�޴��� ���� : 1. �л��� (�迭�� ũ��) -> �迭�� �������� �ʾƵ� �ȴ�. -> �迭�� ���� 
		//			2. �����Է�->�迭�� ����, �ִ밪�� ���� ���ѵ�.
		//			3.��������Ʈ:  �迭�� ���
		//			4.�м�: �ְ�����, ������
		//			5.����-> run=false
		
		int max= -1;// �ʱ�ġ�� �ּڰ�-> �Է� �����ʹ� �ִ밪
		boolean run= true;//�޴��� �Է� �ޱ� ���� �ݺ���
		int studentNum=0;
		Scanner scanner= new Scanner(System.in);
		int scores[] = null;//1���� �迭 ���� (��������)
		int sum;
		double avg;
		
		while(run) {// ������ �ݺ�
			//Ư������: ����޴��� ����-> �ݺ����� ������� ó�� 
			System.out.println("______________________________________________");
			System.out.println("1.�л���| 2.�����Է� | 3.��������Ʈ| 4.�м� | 5.����");
			System.out.println("_______________________________________");
			System.out.print("����>  ");
			
			int selectNo = scanner.nextInt();//int �Է�(�޴�)
			
			if(selectNo == 1) {
				//�л���>3
				System.out.print("�л���> ");
				studentNum = scanner.nextInt();
				//�迭�� ����
				scores = new int [studentNum];// 1���� �迭�� ���� 
				
			}
			else if(selectNo == 2) {
				//�л�����ŭ ������ �Է�
				//scores[0]>80
				for(int i =0; i<studentNum;i++) {
					System.out.println("scores["+i+"]");
					scores[i] = scanner.nextInt();
				}
				//�ִ밪�� �� �� ���
				
			}else if (selectNo == 3) {
				for(int i = 0; i<studentNum; i++) {
					//scores[0]: 85
					System.out.println("scores["+i+"]"+scores[i]);
				}
			}else if (selectNo ==4) {//�м� �ְ�����, ������� ���
				//�ְ����� : 95
				// �������: 91.0
				max =-1; //�޴��� �������� �� ���� �ٽ� ���
				sum= 0;
				for(int i=  0; i<studentNum ; i ++) {
					if(max<scores[i])
						max = scores[i];
					//���� ���Ѵ�.
					sum += scores[i];
				}
				avg=(double) sum / studentNum;
				System.out.println("�ְ����� : " + max);
				System.out.println("�������: "+ avg);
			}else if (selectNo == 5)
				run = false;
			
		}
		System.out.println("���α׷� ����");
	}

}

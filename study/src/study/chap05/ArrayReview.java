package study.chap05;

import java.util.Scanner;

public class ArrayReview {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4};
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		
		int arr2[];
//		arr2= {1,2,3,4,5 }; //�ʱ�ȭ: �����߻�
		
		arr2=new int[5];
		int num=1;
		for(int i=0; i<arr2.length;i++) {
			arr2[i]=num++;
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		Scanner scanner =new Scanner(System.in );
		System.out.print("�迭�� ũ�� : ");
		int len = scanner.nextInt();
		double darr[]= new double [len];
		System.out.println("�迭 darr�� ũ�� ="+ darr.length);
		
		
		
	}

}

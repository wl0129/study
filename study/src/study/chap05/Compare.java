package study.chap05;

public class Compare {

	public static void main(String[] args) {
		//�⺻ ������ Ÿ�� ���� 
		// ���� , �Ǽ� , �� 
		int num = 10; // ������ġ�� :���� , ����Ǵ� ���� : ������ �ʱ�ȭ �� ��
		int var1; //stack�� ������  ���� �ʰ�
	    var1= 20; // stack�� ����ȴ�. (���� ���ԵǴ� ����) 
	    if(num == 10) {//������ ����� ���� �� : '=='
	    	System.out.println(num);
	    }
		//���� Ÿ���� ���� : �迭, ������(enum), Ŭ����(class), Interface(�������̽�) 
	    String str = "ȫ�浿"; // str : ��������
	    //"ȫ�浿" : �� ������ ����ȴ�. ->�ּ�
	    //Str���� "ȫ�浿"�̶�� string ��ü�� �ּҸ� ���� 
	    
	    //str = null;// "ȫ�浿 " ��ü�� ���� �� �� �ִ� ����� ������.
	    String str2= "ȫ�浿"; //heap ������ ����� ������ ��ü
	    if(str == str2 ) //�ּҸ� ��
	    	System.out.println("������ ��ü�� �����Ѵ�.");
	    	else
	    		System.out.println("�ٸ� ��ü�� �����Ѵ�.");
	    if(str.equals(str2))
	    	System.out.println("���� ������ ���� ������.");
	    else
	    	System.out.println("�ٸ� ������ ���� ������.");
	    System.out.println("str2�� ���ڿ��� ����="+str2.length());
	    
	    String str3=null;
	    //str3= method1();//�޼ҵ��� �������� null�� ��ȯ�ȴ� ���
	    if(str3 !=null)
	    System.out.println("str3�� ���ڿ��� ����="+str3.length());
	    else
	    	System.out.println("��������");
	    
	}

}

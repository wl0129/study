package study.chap06;

public class MyClass {
	//�������
	//1. �ʵ�
	int field1;
	String field2;
	
	//2.������ : �ʵ��� �ʱ�ȭ-> ������ �޼ҵ�(��ȯ���� ����)
	public MyClass() {
		this .field1=10;//�ʱ�ȭ
		field2 = "����";
	}
	//3. �޼ҵ�: �ʵ尪�� �����Ű�� ����, ���� 
	public void method() {//�ʵ带 ����� �޼ҵ�
		System.out.println("field1= "+field1);
	}
	//add()
	public int method2(int a, int b) {//�ʵ带 ������� ���� �޼ҵ�
		return a+b;
		
	}
	//�ʵ� field1�� ���� �Ű������� ���޵� field1 ���� ����(����)
	public void setfield1(int field1) {//�Ű������� �ʵ��� ������� 
		this.field1=field1; //�Ϲ������� ���� �̸��� ���� ����Ѵ�. 
							//�ʵ�� �Ű������� �����ϱ� ���ؼ� this�� ����Ѵ�. 
	 
	}
	
	public void setfield2(String f2) {//�Ű������� �ʵ��� �ٸ���� 
		field2=f2; //�Ϲ������� ���� �̸��� ���� ����Ѵ�. 
	}

}

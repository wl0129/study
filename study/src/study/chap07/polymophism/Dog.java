package study.chap07.polymophism;
//�ڹ�: �ڽ��� �θ� �����ؼ� ����� �Ѵ�.
//�θ�� �ϳ��� ���� ����, C++ : ���� �� ���� 
//�θ��� �ʵ� , �޼ҵ带 ��� �����ϴ�. 
public class Dog extends Animal {
	int count; 	//1�⿡ �а��� Ƚ��
	
	public void method() {
		sound(); 	//�θ� ������ �޼ҵ带 ���
		age = 10;	//���� : �θ� ������ �ʵ带 ��� 
	}
	
	@Override
	public void sound() {
		System.out.println("�۸�!");
	}
}

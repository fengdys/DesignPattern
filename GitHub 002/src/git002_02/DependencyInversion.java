package git002_02;

public class DependencyInversion {
//������תԭ��
	/*
	 �ʼǣ�
	 1.������ת������������󣨽ӿڡ����󷽷�������Ҫ�ϲ������²� 
	 2.������ϵ���ݵ����ַ�ʽ��1.�ӿڴ��� 2.���췽������ 3.setter��ʽ���� 
	  
	 */
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Person p =new Person();
		p.receive(new Email());
		
		p.receive(new WeChat());
	}

}

package git001;

public class Loginform {
	UserDAO dao =new UserDAO();
	boolean anv = dao.b();
	public static void init() {
		System.out.println("��ʼ���ɹ�");
	}
	public static void display() {
		System.out.println("��ʾ�ɹ�");
	}
	public static void validate() {
		System.out.println("��֤�ɹ�");
	}
}

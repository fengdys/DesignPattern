package git001;

public class Loginform {
	UserDAO dao =new UserDAO();
	boolean anv = dao.b();
	public static void init() {
		System.out.println("初始化成功");
	}
	public static void display() {
		System.out.println("显示成功");
	}
	public static void validate() {
		System.out.println("验证成功");
	}
}

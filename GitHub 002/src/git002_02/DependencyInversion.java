package git002_02;

public class DependencyInversion {
//依赖倒转原则
	/*
	 笔记：
	 1.依赖倒转：最好依赖抽象（接口、抽象方法），不要上层依赖下层 
	 2.依赖关系传递的三种方式：1.接口传递 2.构造方法传递 3.setter方式传递 
	  
	 */
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Person p =new Person();
		p.receive(new Email());
		
		p.receive(new WeChat());
	}

}

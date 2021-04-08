package git002_02;

public class Person {
	public void receive(IReceiver receiver) {
		System.out.println(receiver.getInfo());
	}
}

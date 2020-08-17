package testJava;

public class Test {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		A c = new B();
		a.printt(1);
		b.printt(1);
		c.printt(1);
	}
}

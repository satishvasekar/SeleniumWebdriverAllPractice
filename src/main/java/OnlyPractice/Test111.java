package OnlyPractice;

public class Test111 {

	int a = 10;
	int b = 20;

	static int c = 30;
	static int d = 40;

	void m1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(Test111.c);
		System.out.println(Test111.d);
	}

	static void m2() {
		Test111 t1 = new Test111();
		System.out.println(t1.a);
		System.out.println(t1.b);

		System.out.println(Test111.c);
		System.out.println(Test111.d);

	}
	public static void main(String[] args) {
		Test111 t1 = new Test111();
		t1.m1();
		
		Test111.m2();
	}

}

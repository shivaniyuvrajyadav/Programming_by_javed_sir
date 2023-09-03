
public class SwapWithoutthird {
public static void main(String[] args) {
	int a = -5;
	int b = 1;
	System.out.println("before");
	System.out.println("a ="+a);
	System.out.println("b ="+b);
	a= a+b;
	b=a-b;
	a=a-b;
	System.out.println("after");
	System.out.println("a ="+a);
	System.out.println("b ="+b);
}
}

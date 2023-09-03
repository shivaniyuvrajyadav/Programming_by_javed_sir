
public class ProductOdd {
public static void main(String[] args) {
	int product=1;
	for (int i = 0; i <=10; i++) {
		if(i%2==1) {
			product=product*i;
		}
		System.out.println(product);
		}
	System.out.println(product);
}
}

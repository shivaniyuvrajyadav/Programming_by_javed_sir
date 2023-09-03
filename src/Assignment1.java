public class Assignment1 {
public static void main(String[] args) {
	int n = 78;
	int sum = 0;
	while (n!=0 || sum>9) {
		if (n ==0) {
			n = sum;
			
			sum = 0;
			System.out.println(sum);
		}
		int d = n%10;
		sum = sum+d;
		n = n/10;
		}
	   System.out.println(sum);
    }
}

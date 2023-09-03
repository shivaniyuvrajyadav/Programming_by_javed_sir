
public class HarshadNiven {
	
	public static void main(String[] args) {
		int n = 29;
	    int sum = 0;
	    int temp = n;
		while (n!=0) {
			int d  = n %10;
			sum = sum + d;
			n =n/10;
			}
        if (temp%sum==0) {
			System.out.println("harshad number");
		} else {
           System.out.println("not harshad number");
		}
    }

}

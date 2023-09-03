
public class ArmstrongNum {
	public static int countDigits(int n) {
		int count = 0;
		while(n!=0) {
			count++;
			n=n/10;
			
		}
		return count;
	}
	
	public static int power (int n , int p) {
		int pow = 1;
		for (int i = 1; i <=p; i++) {
			pow = pow*n;
			
		} 
		return pow;
	}
	public static void main(String[] args) {
		int n = 153,temp = n ,sum = 0;
		int p = countDigits(n);
		while(n!=0) {
			int d = n %10;
			sum = sum + power(d,p);
			n = n/10;
		}
		if (temp == sum) {
			System.out.println("Armstrong number");
		} else {
           System.out.println("not an Armstrong number");
		}
	}
		
		
}


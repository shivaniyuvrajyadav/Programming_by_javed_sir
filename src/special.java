
public class special {
public static void main(String[] args) {
	int n = 29;
	int temp = n;
	int sum = 0;
	int mul =1;
	
	while(n!=0) {
		int d = temp % 10;
		sum = sum + d;
		mul = mul * d;
		temp = temp/10;
		
	}
	if (sum+mul==temp) {
		System.out.println("special number");
	} else {
      System.out.println("not a special number");
	}
}
}


public class perfectNum {
	
public static void main(String[] args) {
	
	int a = 6 ;
	int sum = 0;
	for(int i=1;i<a;i++) {
		if(a%i==0) {
			sum = sum + i;
			System.out.println(i);
		}
	}
	
	if(sum==a) {
		System.out.println("perfect number");
	}
}
}

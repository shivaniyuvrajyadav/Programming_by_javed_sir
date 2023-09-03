
public class SpecialRange {
	public static void main(String[] args) {
//		
		
		for(int n=1;n<=100;n++) {
		int temp = n , sum = 0,	mul = 1;
		while(temp!=0) {
			int d = temp % 10;
			sum = sum + d;
			mul = mul * d;
			temp = temp/10;
			
		}
		if (sum+mul==n) {
			System.out.println(n);
		} 
	}
}
}

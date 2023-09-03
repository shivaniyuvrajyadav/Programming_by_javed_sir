public class Lcm {
public static void main(String[] args) {
	int a =8;
	int b = 10;
	int lcm = (a*b)/gcd(a,b);
	System.out.println(lcm+" "+"lcm");

}
public static int gcd(int a,int b) {
	int gcd = 1;
	for(int i=1;i<=a && i<=b;i++) {
		if(a%i==0 && b%i==0) {
			gcd =i;
			
		}
		
	}
	return gcd ;
}
}

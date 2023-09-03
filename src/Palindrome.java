
public class Palindrome {
public static void main(String[] args) {
	int n = 121;
	int rev = 0;
	int temp = n;
	while ( n!=0) {
		int d  = n %10;
		rev = rev *10 +d;
		n = n/10;
	}
	
	if(temp==rev) {
		System.out.println("palindrome number");
	}
	else {
		System.out.println("not palindrome number");
	}
	
}
}

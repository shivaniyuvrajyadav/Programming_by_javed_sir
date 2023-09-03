
public class revNum {
public static void main(String[] args) {
	int no = 123;
	int rev = 0;
	
	while(no!=0) {
		int d = no%10;
		rev = rev *10 + d;
		no = no/10;
		
	}
	System.out.println(rev);
}
}

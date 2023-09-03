
public class Strongno {
	public static void main(String[] args) {
		int n=145, temp=n,sum=0;
		while (n!=0) {
			int d=n%10;
			int fact=1;
			for(int i=1;i<=d;i++) {
				fact=fact*i;
				System.out.println(i);
			}
			sum=sum+fact;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("Strong Number");
		}else {
			System.out.println("Not a Strong Number");
		}
	}
}

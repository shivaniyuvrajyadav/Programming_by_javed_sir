
public class tablewithoutusingloop {
	public static void main(String[] args) {
		table(1278,1);
	}
	
	public static void table(int n,int i) {
		if(i<=10) {
			System.out.println(n+" " +"x"+" "+ i +" "+ "="+" "+(n*i));
			i++;
			table(n,i);
		}
	}

}

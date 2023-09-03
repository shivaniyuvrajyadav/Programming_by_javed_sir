import java.util.Scanner;

public class AreaTriangle {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int b1 = sc.nextInt();
	int h1 = sc.nextInt();
	int b2 = sc.nextInt();
	int h2  = sc.nextInt();
	float area1 = (b1*h1)/2.0f;
	float area2 = (b2*h2)/2.0f;
	float area = area1>area2 ? area1:area2;
	System.out.println(Math.ceil(area));
	
}
}

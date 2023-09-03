// wap to find count of all harshad number 
// by user. 

import java.util.Scanner;

public class NivenCount {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
	int e = sc.nextInt();
	
	int count = 0;
	for(;s<=e;s++) {
		int temp =s;
		int sum =0;
	
	while(temp!=0) {
		int d  = temp %10;
		sum = sum + d;
		temp =temp/10;
		
	}
	if (s%sum==0) {
		count++;
	} 
	
   }
	System.out.println(count);
  }
}

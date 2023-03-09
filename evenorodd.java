package Github_Projects;

import java.util.Scanner;

public class evenorodd {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=scan.nextInt();
	if(n%2==0) {
		System.out.println("the number"+n+"is even");
	}else {
		System.out.println("the number"+n+"is odd");
	}
	}

}

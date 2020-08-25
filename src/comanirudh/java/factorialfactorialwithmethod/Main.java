package comanirudh.java.factorialfactorialwithmethod;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a small number");
		int n = in.nextInt();
		long ans = factorial(n);
		System.out.println(ans);
		

	}
	static long factorial (int n) {
		//int sum = 0
		long fact = 1;
		
		for(int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}
	

}

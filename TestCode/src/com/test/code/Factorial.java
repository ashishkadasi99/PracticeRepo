package com.test.code;
import java.util.*;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Recur A = new Recur();
		System.out.println("enter a number");
		Scanner in = new Scanner(System.in);
		int N =in.nextInt();
		
		System.out.println(A.factR(N));
		System.out.println("enter a new number");
		
		
	}

}
/*public class Recur{
	int factR(int n){
		int result;
		
		if(n==1)
			return 1;
		result = factR(n-1)*n;
		return result;
	}
}*/
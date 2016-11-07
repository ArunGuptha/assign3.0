package assign3;


import java.util.Arrays;

import java.util.Scanner;


public class Integer {
	
	void integersort(){
	
	int n;	
	System.out.println("enter the size of the array");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	
	int[] a= new int[n];
	
	System.out.println("enter the values");
	
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	
	Arrays.sort(a);
	
	System.out.println(Arrays.toString(a));
	
	
	}
	
}

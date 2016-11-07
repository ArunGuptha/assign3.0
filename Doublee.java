package assign3;

import java.util.Arrays;
import java.util.Scanner;
public class Doublee {

	
	public void doubleee(){
		int n;	
		System.out.println("enter the size of the array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	
	double[] d1 = new double[n];
	System.out.println("enter the array values");
	
	for(int i=0;i<n;i++)
		d1[i]=sc.nextDouble();
	   
    System.out.println("Original Array : ");
    for(int i=0; i < n ; i++)
      System.out.print(d1[i]+" ");
   
    System.out.println();
   
    Arrays.sort(d1);
    System.out.println(Arrays.toString(d1));
    
   
	}
}

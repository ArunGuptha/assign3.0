package assign3;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		
		
		System.out.println("select a variable to sort");
		System.out.println("" + "\n" + "1:Integer" + "\n" + "2:String" + "\n" + "3: Double" + "\n" + "4:Date");
		System.out.println("enter the values ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		switch (n){
			case 1:	Integer obj1=new Integer();
					obj1.integersort();
					break;
			
			case 2: Stringg obj2= new Stringg();
					obj2.String();
					break;
		
			case 3: Doublee obj3= new Doublee();
					obj3.doubleee();
					break;
			case 4:
				break;
			
	}

}}

package assign3;
import java.util.Scanner;
import java.util.Arrays;

public class Stringg {
	
	void String(){
	Scanner sc = new Scanner(System.in);
	 
	System.out.println("enter length of String array"); 
	int n = sc.nextInt(); 

	String[] input = new String[n];
	
	System.out.println("enter array elements");
	for (int i = 0; i < n; i++) 
	{ 
		input[i] =sc.next(); 
	} 
	
	System.out.println(Arrays.toString(input));
	
	Arrays.sort(input);
	
	System.out.println(" After sorting ");
	System.out.println(Arrays.toString(input));
	}

}

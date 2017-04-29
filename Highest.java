package Assignment2;
import java.util.*;
public class Highest {

	public static void main(String[] args) {
		int a,b,c,h;
		Scanner sc = new Scanner(System.in); //to get input from the user
		System.out.println("Enter first number");
		a = sc.nextInt();  //getting first number
		System.out.println("Enter second number");
		b = sc.nextInt();  //getting second number
		System.out.println("Enter third number");
		c = sc.nextInt();  //getting third number
		h = max(a,b,c);    //call to static method 'max' without using object to get the maximum number
		System.out.println("Highest number is: "+h);
	}
	
	public static int max(int x,int y,int z){
		int m;
		if(x>=y && x>=z)
		m = x;   //if x is the largest return x
		else if(y>=x && y>=z)
		m = y;	 //if y is the largest return y	
		else
		m = z;   //if z is the largest return z
		return m;
	}

}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

/* x is an int 
 * ask user to input an integer
 * take it into x
 * call isPrime() function and give x as an input
 * isPrime should check 
 * 		if the x is prime:
 * 			it should return true
 * 		else
 * 			it should return false
 * print the answer
 */
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try {
		System.out.println("Enter an int: ");
		int x = scan.nextInt();
		System.out.println(x+ " is prime: "+isPrime(x));
		} catch (Exception e)
		{
			   System.out.println("Wrong input");
			   System.exit(-1);
			}
	}
	
	public static boolean isPrime(int x) {
		boolean answer = true;
		if (x<2) {
			answer = false;
		}
		for(int i = 2; i*i<=x;i++) {
			if(x%i==0) {
				answer = false;
			}
		}
		return answer;
	}

}

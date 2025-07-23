package lab1;
import java.util.Scanner;
public class Grade {
	public static void main(String [] arg) {
		Scanner sc = new Scanner (System.in);
		System.out.print("enter your marks (letters)");
		int marks = sc.nextInt();
		if(marks<0 || marks > 100) 
		{
			System.out.print("Invalid Input");
		}
		else if(marks>=90) {
			System.out.print("Grade A");
		}
		else if(marks>=75) {
			System.out.print("Grade B");
		}
		else if(marks>=60) {
			System.out.print("Grade c");
		}
		else if(marks>= 40) {
			System.out.print("Grade D");
		}
		else if(marks< 40) {
			System.out.print("Failed");
		}
	}

}

package lab1;
import java.util.Scanner;
public class sum {
	public static void main(String [] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1= sc.nextInt();
		System.out.println("Enter number 2");
		int num2= sc.nextInt();
		int sum = num1+num2;
		System.out.println(sum);

	}
}

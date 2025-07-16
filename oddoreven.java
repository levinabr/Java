package lab1;
import java.util.Scanner;
public class oddoreven {
	public static void main(String [] arg) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("Its even");
		}
		else {
			System.out.println("odd");
		}
	}

}

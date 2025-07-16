package lab1;
import java.util.Scanner;
public class Rangenum {
	public static void main(String [] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit = sc.nextInt();
		for(int i=0; i<limit;i++) {
			
			System.out.println(i);
		}
	}

}

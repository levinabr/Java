package lab1;
import java.util.Scanner;
public class dayofweek {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7)");
        int daynum = scanner.nextInt();
        String day;
        switch (daynum) {
        case 1 : day = "sunday";
        break;
        case 2 : day = "monday";
        break;
        case 3 : day = "tuesday";
        break;
        case 4 : day = "wednesday";
        break;
        case 5 : day = "thursday";
        break;
        case 6 : day = "friday";
        break;
        case 7 : day = "saterday";
        break;
        default:
            day = "Invalid input Range(1-7) ";
        }
        System.out.print(day);
        }
        

}

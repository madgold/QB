import java.util.Scanner;

public class Class1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		
		System.out.print("Enter how many touchdowns: ");
		double TD = input.nextDouble();
		
		System.out.print("Enter how many total yards: ");
		double YDS = input.nextDouble();
		
		System.out.print("Enter how many interceptions: ");
		double INT = input.nextDouble();
		
		System.out.print("Enter how many completions: ");
		double COMP = input.nextDouble();
		
		System.out.print("Enter number of passes attempted: ");
		double ATT = input.nextDouble();
		
		double a = (((COMP/ATT)-0.3)*5);
		
		double b = (((YDS/ATT)-3)*0.25);
		
		double c = ((TD/ATT)*20);
		
		double d = (2.375-((INT/ATT)*25));
		
		double PasserRating = (((a+b+c+d)/6)*100);
		
		System.out.printf("%.1f", PasserRating);
		
	}
}

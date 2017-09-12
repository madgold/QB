import java.util.Scanner;

public class Class1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		
		System.out.print("Enter how many touchdowns: ");
		double TD = input.nextDouble();
		
		System.out.print("Enter how many total yards: ");
		double Yards = input.nextDouble();
		
		System.out.print("Enter how many interceptions: ");
		double INT = input.nextDouble();
		
		System.out.print("Enter how many completions: ");
		double comp = input.nextDouble();
		
		System.out.print("Enter number of passes attempted: ");
		double ATT = input.nextDouble();
		
		double a = (((comp/ATT)-0.3)*5);
		if (a>2.375)
			a=2.375;
		if (a<0)
			a=0;
		
		double b = (((Yards/ATT)-3)*0.25);
		if (b>2.375)
			b=2.375;
		if (b<0)
			b=0;
		
		double c = ((TD/ATT)*20);
		if (c>2.375)
			c=2.375;
		
		double d = (2.375-((INT/ATT)*25));
		if (d>2.375)
			d=2.375;
		if (d<0)
			d=0;
		
		double PasserRating = (((a+b+c+d)/6)*100);
		
		System.out.printf("%.1f", PasserRating);
		
	}
}

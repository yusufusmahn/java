import java.util.Scanner;
public class TaxCalculator{
public static void main(String[] args){
	Scanner kboard = new Scanner(System.in);
	int i = 1;

	while (i < 4){
	System.out.println("enter a citizens name: ");
	String names = kboard.nextLine();

	System.out.println("enter a citizens earning: ");
	int earnings = kboard.nextInt();
	kboard.nextLine();
	
	i++;

	if (earnings == 30000){
	double tax = 15 * earnings / 100;
	System.out.println("Citizens total tax is: " +tax);
}

	else if (earnings > 30000){
	double tax = 20 * earnings / 100;
	System.out.println("Citizens total tax is: " +tax);

}
}	


}
	}
import java.util.Scanner;
public class CreditCalculator{
public static void main(String[] args){
	Scanner kboard = new Scanner(System.in);
	
	int accountNumber = 1, beginingBalance, charges, totalCredits, 	newBalance = 0, allowedCredit;

	while (accountNumber != 0){
	System.out.println("Account Number to perform credit limit: ");
	accountNumber = kboard.nextInt();
	if (accountNumber == 0)break;	

	System.out.println("Balance at the begining of the month: ");
	beginingBalance = kboard.nextInt();

	System.out.println("Total items charged by the customer: ");
	charges = kboard.nextInt();

	System.out.println("Total credit applied to the customer: ");
	totalCredits = kboard.nextInt();

	System.out.println("Allowed credit limit: ");
	allowedCredit = kboard.nextInt();

	newBalance = beginingBalance - charges - totalCredits;
	System.out.println("new balance is: "+newBalance);	

	int creditLimit = beginingBalance + allowedCredit;

	if (newBalance <= creditLimit){
	System.out.println("Credit limit is: " + creditLimit);}

	else{
	System.out.println("Credit limit exceeded");}

}
	
}
	}
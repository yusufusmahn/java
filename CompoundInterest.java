import java.util.Scanner;

public class CompoundInterest{
public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);
System.out.print("Enter initial investment amount: ");
double initailInvestment = keyboard.nextDouble();

System.out.print("\nEnter monthly Contributions amount(Negative for withdrawals): ");
double monthlyContributions = keyboard.nextDouble();

System.out.print("\nEnter number of years: ");
int years = keyboard.nextInt();

System.out.print("\nEnter Annual Interest Rate(in percentage): ");
double annualInterestRate = keyboard.nextDouble();

System.out.print("\nKindly input Interest rate variance range: ");
double interestRateVariance = keyboard.nextDouble();

System.out.println("""
Select prefered compounding frequency
1. Yearly
2. Quarterly
3. Monthly
4. Weekly
5. Daily
selected: 
""");

int compoundFrequency = keyboard.nextInt();

switch (compoundFrequency){

case 1:
compoundFrequency = 1;
break;

case 2:
compoundFrequency = 4;
break;

case 3:
compoundFrequency = 12;
break;

case 4:
compoundFrequency = 52;
break;

case 5:
compoundFrequency = 365;
break;

default:
System.out.println("Invalid option selected");
return;

}

double belowRate = annualInterestRate - interestRateVariance;
double aboveRate = annualInterestRate + interestRateVariance;

for (double rangeRate = belowRate; rangeRate <= aboveRate; rangeRate += 0.5){

double result = CompoundInterestCalculator(initailInvestment, monthlyContributions, years, rangeRate, compoundFrequency);

System.out.printf("The interest rate of %.2f%%: Final amount is: %.2f%n",rangeRate,result);

}
}

public static double CompoundInterestCalculator(double initailInvestment, double monthlyContributions, int years, double annualInterestRate, int compoundFrequency){

		
	int totalDuration = years * compoundFrequency;

	double rate = annualInterestRate / 100 / compoundFrequency;

	double amount = initailInvestment * Math.pow(1 + rate, totalDuration);


	double futureContributionValue = monthlyContributions * (Math.pow(1 + rate, totalDuration) - 1) / rate;


	return amount + futureContributionValue;

}

}



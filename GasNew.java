import java.util.Scanner;
public class GasNew{
public static void main(String[] args){

	float totalMilesPerGallon = 0;
	int i = 0, miles = 0, gallon = 0;
	
	Scanner kboard = new Scanner(System.in);
	
	while (miles != -1){	
	System.out.println("enter value for miles: ");
	miles = kboard.nextInt();
	if (miles == -1)break;
	
	System.out.println("enter value for gallon: ");
	gallon = kboard.nextInt();
	if (gallon == -1)break;
	
	float milesPerTrip = miles / gallon;

	totalMilesPerGallon += milesPerTrip;

	System.out.println("miles per trip is: "+milesPerTrip);

}
	System.out.println("total miles per gallon is: "+totalMilesPerGallon);

}
	}
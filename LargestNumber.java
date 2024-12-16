import java.util.Scanner;
public class LargestNumber{
public static void main(String[] args){
	Scanner kboard = new Scanner(System.in);
	int i = 1;
	int largest = Integer.MIN_VALUE;
	
	while (i <= 10){
	System.out.println("Enter an integer: ");
	int number = kboard.nextInt();
	if (number > largest)largest = number;
	i++;
}

	System.out.println("the largest number is: " +largest);

}
	}
	
import java.util.Scanner;
public class secondLargest{
public static void main(String[] args){
	Scanner kboard = new Scanner(System.in);
	int i = 1;
	int largest = Integer.MIN_VALUE;
	int secondLargest = Integer.MIN_VALUE;

	System.out.println("Enter any 10 different numbers ");
	while (i <= 10){
	int numbers = kboard.nextInt();

	if (numbers > largest){
	secondLargest = largest;
	largest = numbers;
}
	else if (numbers > secondLargest && numbers != largest){
	secondLargest = numbers;
}
	i++;

}
	
	if (largest == Integer.MIN_VALUE || secondLargest == Integer.MIN_VALUE){
	System.out.println("All numbers are equal");
}
	else{
	System.out.println("largest number is: "+largest);
	System.out.println("second largest is: "+secondLargest);
}
}
	}
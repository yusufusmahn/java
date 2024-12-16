import java.util.Scanner;
public class Palindrome1{
public static void main(String[] args){

	Scanner keyboard = new Scanner(System.in);

	int number;
	System.out.println("enter a five digit number: ");
	while(true){
	number = keyboard.nextInt();

	if (number >= 10000 && number <= 99999){

	int number1 = number / 10000;
	int number2 = number / 1000 % 10;
	int number4 = number / 10 % 10;
	int number5 = number % 10;


	if (number1 == number5 && number2 == number4){
	System.out.println("This is a palindrome");}

	else{
	System.out.println("This is not a palindrome");}
	break;
}

	else{
	System.out.println("please enter a five digit number: ");}

}



}
	}
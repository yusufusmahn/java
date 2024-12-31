import java.util.Scanner;

public class CalculatingPi  {
public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);

System.out.println("Enter a number to calculate value of pi: ");
int input = keyboard.nextInt();

double pi = 0.0;

for (int i = 0; i <= input; i++){

int sum = 2 * i + 1;

if (i % 2 == 0){

pi += 4.0 / sum;

}

else{
pi -= 4.0 / sum;

}

	}

System.out.println("value of pi when " + input + " is entered is: "+ pi);



}

	}
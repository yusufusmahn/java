import java.util.Scanner;
public class validatingInput{
public static void main(String[] args){
	Scanner kboard = new Scanner(System.in);

	int passes = 0, failures = 0, i = 1;

	
	while (i <= 10){
	System.out.println("enter 1 = pass and 2 = fail: ");
	int result = kboard.nextInt();
	
	if (result == 1){
	passes = passes + 1;
	i++;
}

	else if (result == 2){
	failures = failures + 1;
	i++;
}
	
	else if (result != 1 || result != 2){
	System.out.println("please enter correct value (1 or 2)");
}


}
	System.out.printf("passed: %d%nfailed: %d%n", passes, failures);

	if (passes > 8)System.out.println("Bonus to facilitator");


}
	}


	


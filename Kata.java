public class Kata {
public static boolean evenNumber (int number) {
	if (number %2 ==0){
	return true;
}
	else{
	return false;
}
}


public static int subtract (int integerOne, int integerTwo){
 	return Math.abs(integerOne - integerTwo);
}


public static float divide (int number1, int number2){
	if (number2 == 0){
	return 0;
}
	else{
	return number1 / number2;
}
}


public static int factorOf (int number){
	int i = 1;
	for (int j = 1; j < number; j++){
	if (number % j == 0){
	i++;
}
}
	return i;
}

 
public static boolean isSquare (int number){
	int squareNumber = (int) Math.sqrt(number);
	return squareNumber * squareNumber == number;
}


public static boolean isPalindrome (int number){
	int extraction1 = number / 10000;
	int extraction2 = number / 1000 % 10;
	int extraction4 = number / 10 % 10;
	int extraction5 = number % 10;


	if (extraction1 == extraction5 && extraction2 == extraction4){
	return true;	
}
	else{
	return false;
}
}


public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i; 
        }
        return result;
    }


public static int squareOf (int number){
	return number * number;
}



public static void main(String[] args) {
	
System.out.println(evenNumber(4));
System.out.println(subtract(3,7));
System.out.println(divide(0,2));
System.out.println(factorOf(10));
System.out.println(isSquare(9));
System.out.println(isPalindrome(54145));
System.out.println(factorial(5));
System.out.println(squareOf(5));

}
	}


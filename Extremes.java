import java.util.Scanner;

public class Extremes {
public static void main(String[] args){

/*
Scanner keyboard = new Scanner(System.in);
int input = 1, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE; 
int extremeSum = 0;

System.out.println("enter a series of number to determine the extreme sum: ");
System.out.println("enter 0 to stop: ");

while (input != 0){

System.out.println("please enter a number: ");
input = keyboard.nextInt();

if (input == 0){
break;
}

if (input > max){
max = input;
}

if(input < min){
min = input;
}
}

extremeSum = max + min;


 
System.out.println("the maximum of the entries is: "+max);
System.out.println("the minimum of the entries is: "+min);
System.out.println("the extreme sum of the entries is: "+extremeSum);

*/


Scanner keyboard = new Scanner(System.in);
int input = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
int extremeSum = 0;

System.out.print("plz enter number of entries: ");
int entries = keyboard.nextInt();

for (int i = 1; i <= entries; i++){
System.out.println("enter entry " + i + ": ");
input = keyboard.nextInt();

if (input > max){
max = input;
}

if (input < min){
min = input;
}
}

extremeSum = max + min;



System.out.println("the maximum of the entries is: "+max);
System.out.println("the minimum of the entries is: "+min);
System.out.println("the extreme sum of the entries is: "+extremeSum);









}


	}
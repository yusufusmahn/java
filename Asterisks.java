import java.util.Scanner;

public class Asterisks {
public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);

System.out.println("enter five entries btw 1 and 30");
for (int i = 1; i <= 5; i++){
System.out.println("enter number "+i);
int input = keyboard.nextInt();

if (input < 1 || input > 30)break;


for (int j = 1; j <= input; j++){
System.out.print("*");
}

System.out.println();

}




}
}
import java.util.Scanner;

public class Pizza  {
public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);

int totalPrice, slicesLeft, numberOfSlices = 0, boxesToBuy, pricesPerBox = 0;

System.out.print("Please enter number of guests: "); 
int numberOfGuests = keyboard.nextInt();

System.out.print(""" 

Select pizza type:

1. sapa size(4 slices, 2500)
2. small money(6 slices, 2900)
3. big boys(8 slices, 4000)
4. odogwu(12 slices, 5200)

Select a Preference between 1 and 4
""");
int preference = keyboard.nextInt();

switch (preference) {

case 1:
numberOfSlices = 4;
pricesPerBox = 2500;
break;

case 2:
numberOfSlices = 6;
pricesPerBox = 2900;
break;

case 3:
numberOfSlices = 8;
pricesPerBox = 4000;
break;

case 4:
numberOfSlices = 12;
pricesPerBox = 5200;
break;

default:
System.out.println("please select options between 1 and 4 to continue");
break;

}


boxesToBuy = (numberOfGuests + numberOfSlices - 1) / numberOfSlices;

int totalSlices = boxesToBuy * numberOfSlices;

slicesLeft = totalSlices - numberOfGuests;

totalPrice = pricesPerBox * boxesToBuy;

System.out.println("How many slices of pizza needed: "+boxesToBuy);
System.out.println("How many slices of pizza left: "+slicesLeft);
System.out.println("Total price of all pizza boxes bought: "+totalPrice);

























}

}
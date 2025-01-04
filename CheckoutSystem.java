import java.util.Scanner;

public class CheckoutSystem{
public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);

double vatRate = 0.075;
double price,quantity,quantityTotal,total = 0;
String productName;

String storeName = "SEMICOLON STORES";
String branch = "MAIN BRANCH";
String tel = "08169025215";
String location = "312, herbert macaulay way, sabo yaba, lagos";
String dateAndTime = "04-JAN-2025    09:28:23 pm";

System.out.println("Enter Customers Name: ");
String name = keyboard.nextLine();

while(true){

System.out.println("What did the user buy: ");
productName = keyboard.nextLine();

System.out.println("How many pieces: ");
quantity = keyboard.nextDouble();keyboard.nextLine();

System.out.println("How much per unit: ");
price = keyboard.nextDouble();keyboard.nextLine();

quantityTotal = price * quantity;
total += quantityTotal;

System.out.println();
System.out.println("Do u want to add more items(yes or no): ");
String addItems = keyboard.nextLine();
if (!addItems.equals("yes")){
break;
}
}

System.out.println();

System.out.println("Cashiers name: ");
String cashiersName = keyboard.nextLine();

System.out.println("how much discount will customer get: ");
double discountGotten = keyboard.nextDouble();


double discount = total * discountGotten;
double discountTotal = total - discount;
double vat = discountTotal * vatRate;
double totality = discountTotal + vat;

System.out.println();
System.out.println(storeName);
System.out.println(branch);
System.out.println("LOCATION " + location);
System.out.println("TEL: " + tel);
System.out.println("Date: " + dateAndTime);
System.out.println("Cashier: " + cashiersName);
System.out.println("Customer Name: " + name);
System.out.println("==========================================================");
System.out.println("ITEM\tQTY\tPRICE\tTotal(NG)");
System.out.println("----------------------------------------------------------");
System.out.println("----------------------------------------------------------");
System.out.printf("%-10s%-10.2f%-10.2f%-10.2f%n",productName,quantity,price,quantityTotal);
System.out.println("----------------------------------------------------------");
System.out.printf("Sub total: %-10.2f%n%n ",total);
System.out.printf("Discount: %-10.2f%n%n ",discount);
System.out.printf("VAT : %-10.2f%n ",vat);
System.out.println("==========================================================");
System.out.printf("Bill total: %-10.2f%n ",totality);
System.out.println("==========================================================");
System.out.printf("This is not a reciept kindly pay: %-10.2f%n ",totality);
System.out.println("==========================================================");
System.out.println();
System.out.println("How much did the customer give to you: ");
double amount = keyboard.nextDouble();
System.out.println("Amount paid by customer: " + amount);

double balance = amount - totality;

System.out.println();


System.out.println(storeName);
System.out.println(branch);
System.out.println("LOCATION " + location);
System.out.println("TEL: " + tel);
System.out.println("Date: " + dateAndTime);
System.out.println("Cashier: " + cashiersName);
System.out.println("Customer Name: " + name);
System.out.println("==========================================================");
System.out.println("ITEM\tQTY\tPRICE\tTotal(NG)");
System.out.println("----------------------------------------------------------");
System.out.println("----------------------------------------------------------");
System.out.printf("%-10s%-10.2f%-10.2f%-10.2f%n",productName,quantity,price,quantityTotal);
System.out.println("----------------------------------------------------------");
System.out.printf("Sub total: %-10.2f%n ",total);
System.out.printf("Discount: %-10.2f%n ",discount);
System.out.printf("VAT : %-10.2f%n ",vat);
System.out.println("==========================================================");
System.out.printf("Bil total: %-10.2f%n ",totality);
System.out.printf("Amount Paid: %-10.2f%n ",amount);
System.out.printf("balance: %-10.2f%n ",balance);
System.out.println("==========================================================");
System.out.println("THANK YOU FOR YOUR PATRONAGE");
System.out.println("==========================================================");




}



}
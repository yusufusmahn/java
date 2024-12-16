import java.util.Scanner;
public class SalesCalculator{
public static void main(String[] args){

	int list = 0, valueCount = 1;
	double comission = 0, value = 0, grossValue = 0, weeklyPay = 200.0;

	Scanner kboard = new Scanner(System.in);

	while (list != -1){
	System.out.println(" serial list of items sold by representative: ");
	list = kboard.nextInt();
	if (list == -1)break;

	System.out.println("input number of values sold: ");
	valueCount = kboard.nextInt();
	if (valueCount == -1)break;

	for(int i = 1; i <= valueCount; i++){
	System.out.println("value of items sold by representatives: ");
	value = kboard.nextDouble();
	if (value == -1)break;
	grossValue += value;
	comission = 0.09 * grossValue + weeklyPay;


	
}
	System.out.println("sum of item value is:"+grossValue);
	System.out.println("commision is:"+comission);


}
}


	}
	


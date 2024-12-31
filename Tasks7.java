public class Tasks7 {
	public static void main(String[] args) {

	int four =4;
	int eight = 8;
	int multipleFour =1;
	int multipleEight =1;
	int sumFour =0;
	int sumEight =0;
	
	for (int count =0; count < 5; count++) {

	multipleFour = multipleFour * four;

	multipleEight = multipleEight * eight;

	sumFour = sumFour + multipleFour;

	sumEight = sumEight + multipleEight;

}
	System.out.println(sumFour);
	System.out.println(sumEight);

}
	}
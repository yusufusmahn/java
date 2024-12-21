public class ArrayKata {
public static int maximumIn(int[] ArrayOfIntegers){
	int max = ArrayOfIntegers[0];
	for(int value: ArrayOfIntegers){
	if (value > max){
	max = value;

	}

    }
	return max;

}


public static int minimumIn(int[] ArrayOfIntegers){
	int min = ArrayOfIntegers[0];
	for (int value = 1; value < ArrayOfIntegers.length; value++){
	if (ArrayOfIntegers[value] < min){
	min = ArrayOfIntegers[value];
	}
    }
	return min;

}


public static int sumOf (int[] ArrayOfIntegers){
	int sum = 0;
	for (int value: ArrayOfIntegers){
	sum += value;

}
	return sum;
    }



public static int sumOfEvenNumbersIn (int [] ArrayOfIntegers){
	int sumEven = 0;
	for (int value = 1; value < ArrayOfIntegers.length; value++){
	if (ArrayOfIntegers[value] %2 == 0){
	sumEven += ArrayOfIntegers[value];

}
}
	return sumEven;

}


public static int sumOfOddNumbersIn (int [] ArrayOfIntegers){
	int sumOdd = 0;
	for (int value: ArrayOfIntegers){
	if (value %2 != 0){
	sumOdd += value;

}
}
	return sumOdd;

}


public static int noOfOddNumbersIn (int[] ArrayOfIntegers){
	int j = 0;
	for (int i = 0; i < ArrayOfIntegers.length; i++){
	if (ArrayOfIntegers[i] %2 != 0){
	j++;
}
}
	return j;
}


public static int noOfEvenNumbersIn (int[] ArrayOfIntegers){
	int i = 0;
	for (int value: ArrayOfIntegers){
	if (value %2 == 0){
	i++;
}
}
	return i;
}



public static int[] squareNumbersIn (int[] ArrayOfIntegers){
	for (int i = 0; i < ArrayOfIntegers.length; i++){
	ArrayOfIntegers[i] *= ArrayOfIntegers[i]; 
}

	return ArrayOfIntegers;
}




public static void main(String[] args){

int[] ArrayOfIntegers = {15, 16, 29, 13, 25, 17, 0, -11, 25, 20};

System.out.printf("The maximum element in the array is: %d%n",maximumIn(ArrayOfIntegers));
System.out.printf("The minimum element in the array is: %d%n",minimumIn(ArrayOfIntegers));
System.out.printf("The sum of all the element in the array is: %d%n",sumOf(ArrayOfIntegers));
System.out.printf("The sum of all the even element in the array is: %d%n",sumOfEvenNumbersIn(ArrayOfIntegers));
System.out.printf("The sum of all the odd element in the array is: %d%n",sumOfOddNumbersIn(ArrayOfIntegers));
System.out.printf("The total number of all odd element in the array is: %d%n",noOfOddNumbersIn(ArrayOfIntegers));
System.out.printf("The total number of all even element in the array is: %d%n",noOfEvenNumbersIn(ArrayOfIntegers));
System.out.println("The square numbers in the array are:"+ Arrays.toString(squareNumbersIn(ArrayOfIntegers)));
























}

	}

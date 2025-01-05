import java.util.ArrayList;

public class Array4{
public static void main(String[] args){

	int[] score = {23, 4, 8, 3, 9};

	ArrayList<Integer> item = oddNumber(score);


	System.out.println("elements in odd position are: "+item);

}



public static ArrayList<Integer> oddNumber (int[] score){
	ArrayList<Integer> item = new ArrayList<>();
	
	for (int i = 1; i < score.length; i++){

	if (i % 2 != 0){
	item.add(score[i]);
	
}

}

	return item;


}
	}

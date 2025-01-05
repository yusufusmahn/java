import java.util.ArrayList;
import java.util.Collections;

public class Array2{
public static void main(String[] args){

ArrayList<Integer> figures = new ArrayList<>();
figures.add(1);
figures.add(2);
figures.add(3);
figures.add(4);
figures.add(5);

ArrayList<Integer> result = reversal (figures);


System.out.println("The reversed list of "+result);


}


public static ArrayList<Integer> reversal (ArrayList<Integer>figures){

ArrayList<Integer> reversedFigures = new ArrayList<>(figures);
Collections.reverse(reversedFigures);
return reversedFigures;


}

}



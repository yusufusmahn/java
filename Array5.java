import java.util.ArrayList;

public class Array5{
public static void main(String[] args){

int[] score = {2, 4, 5, 10, 12, 3, 7, 13, 0, 15};


ArrayList<Integer> item = evenNumber(score); 


System.out.println("even numbers in the array are: "+item);


}


public static ArrayList<Integer> evenNumber(int[] score){
ArrayList<Integer> item = new ArrayList<>();

for(int i = 1; i < score.length; i++){

if (i % 2 == 0){
item.add(score[i]);

}

}

return item;
}


}

import java.util.ArrayList;

public class Array11{
public static void main(String[] args){

int number = 2342;

ArrayList<Integer> values = digits(number);

System.out.println("The list of digits " + number + " are:" +values);

}



public static ArrayList<Integer> digits(int number){
ArrayList<Integer> values = new ArrayList<>();


while(number > 0){
int extraction = number % 10;
values.add(0, extraction);
number /= 10;

}

return values;

}
}

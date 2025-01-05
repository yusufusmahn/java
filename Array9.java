import java.util.ArrayList;

public class Array9 {
public static void main(String[] args){

ArrayList<String> item1 = new ArrayList<>();
	item1.add("a");
	item1.add("b");
	item1.add("c");

ArrayList<Integer> item2 = new ArrayList<>();
	item2.add(1);
	item2.add(2);
	item2.add(3);


ArrayList<Object> concatenatedItems = combine(item1, item2);

System.out.println("The concatenated list: "+ concatenatedItems);

}


public static ArrayList<Object> combine(ArrayList<?>item1, ArrayList<?>item2){
	ArrayList<Object> result = new ArrayList<>(item1);
	result.addAll(item2);
	return result;
}


	}

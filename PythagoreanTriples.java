public class PythagoreanTriples  {
public static void main(String[] args){

	System.out.println("Pythagorean Triples Table");
	System.out.println("side1 \tside2 \thypothenus");

	int size = 500;

	for(int side1 = 1; side1 <= size; side1++){

	for (int side2 = side1; side2 <= size; side2++){

	for (int hypothenus = side2; hypothenus <= size; hypothenus++){

	if (side1 * side1 + side2 * side2 == hypothenus * hypothenus){

	System.out.println(side1 + "\t" + side2 + "\t" + hypothenus);

}
}
}
}

}
	}
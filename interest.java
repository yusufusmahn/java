public class Interest {
public static void main(String[] args){

double principal = 1000.0;

System.out.printf("%-4s %10s %20s%n","rate","year","interest");

for (double rate = 0.05; rate <= 0.10; rate += 0.01){

for (int i = 1; i <= 10; i++){

double amount = principal * Math.pow(1.0 + rate, i);

System.out.printf("%-4.2f %10d %20.2f%n",rate * 100,i,amount);

}
}



}

	}
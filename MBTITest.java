import java.util.Scanner;

public class MBTITest {
public static void main(String[] args) {

Scanner keyboard = new Scanner(System.in);

System.out.print("Enter your name: ");
String name = keyboard.nextLine();

int extroverted = 0;
int introverted = 0;
int sensing = 0;
int intuitive = 0;
int thinking = 0;
int feeling = 0;
int judging = 0;
int perceptive = 0;

String[] questions = {
"QUESION 1: expend energy, enjoy groups conserve energy (A)    -    enjoy one-on-one (B)",
"QUESION 2: interpret literally (A)   -    look for meaning and possibilities (B)",
"QUESION 3: logical, thinking (A)   -    questioning, empathetic, feeling, accommodating (B)",
"QUESION 4: organized, orderly (A)   -    flexible,adaptable (B)",
"QUESION 5: more outgoing, think out loud (A)   -    more reserved, think to yourself (B)",
"QUESION 6:practical,realistic, experiential (A)   -    imaginative, innovative, theoretical (B)",
"QUESION 7: candid, straight forward, frank (A)   -    tactful, kind, encouraging (B)",
"QUESION 8: plan,schedule (A)   -    unplanned, spontaneous (B)",
"QUESION 9: seek many tasks, public activities, interaction with others (A)   -   seek private, solitary activities with quiet to concentrate (B)",
"QUESION 10: standard, usual, conventional (A)   -    different,novel,unique (B)",
"QUESION 11: firm, tend to criticize, hold the line (A)   -    gentle, tend to appreciate, conciliate (B)",
"QUESION 12: regulated, structured (A)  -    easygoing, live and let live (B)",
"QUESION 13: external,communicative, express yourself (A)   -    internal, reticent, keep to yourself (B)",
"QUESION 14: focus on here-and-now (A)   -    look to the future,global perspective, bigpicture (B)",
"QUESION 15: tough-minded,just (A)   -    tender-hearted, merciful (B)",
"QUESION 16: preparation, plan ahead (A)   -    go with the flow, adapt as you go (B)",
"QUESION 17: active,initiate (A)   -    reflective, deliberate (B)",
"QUESION 18: facts, things, what is (A)   -   ideas, dreams, what could be, philosophical (B)",
"QUESION 19: matter of fact,issue-oriented (A)   -   sensitive, people-oriented, compassionate (B)",
"QUESION 20: control,govern (A)   -    latitude,freedom (B)"

};


for (int i = 0; i < questions.length; i++) {
String answer = "";
while (!answer.equals("A") && !answer.equals("B")) {
System.out.println(questions[i]);
answer = keyboard.nextLine().toUpperCase();

if (!answer.equals("A") && !answer.equals("B")) {
System.out.println("Please select A or B to proceed: ");

}
}


if (i == 0 || i == 4 || i == 8 || i == 12 || i == 16) {
	if (answer.equals("A")){
		extroverted++;

}

else{
	introverted++;

}
}


else if (i == 1 || i == 5 || i == 9 || i == 13 || i == 17) {
	if (answer.equals("A")){
		sensing++;
		

}else{
	intuitive++;
	

}
}


else if (i == 2 || i == 6 || i == 10 || i == 14 || i == 18) {
	if (answer.equals("A")){
		thinking++;
		

}else{
	feeling++;

}
}


else if (i == 3 || i == 7 || i == 11 || i == 15 || i == 19) {
	if (answer.equals("A")){
		judging++;
		


}else{
	perceptive++;


}
}

}



String trait = "";
int aacount = 0;
int bbcount = 0;


if (extroverted > introverted) {
trait += "E";
aacount+= extroverted;

} else{
trait += "I";
bbcount += introverted;


}

if (sensing > intuitive) {
trait += "S";
aacount+= sensing;

} else{
trait += "N";
bbcount += intuitive;


}

if (thinking > feeling) {
trait += "T";
aacount+= thinking;


} else{
trait += "F";
bbcount += feeling;


}

if (judging > perceptive){
trait += "J";
aacount+= judging;


} else{
trait += "P";
bbcount += perceptive;


}

System.out.println("number of A is: "+ aacount);
System.out.println("number of B is: "+ bbcount);


System.out.println("your personality type is: "+ trait);


}

	}
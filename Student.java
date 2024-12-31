import java.util.Scanner;

public class Student  {
public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);
int grade = 0, gradeCounter = 0, total = 0, i = 1;
double average = 0;
int acount = 0;
int bcount = 0;
int ccount = 0;
int dcount = 0;
int ecount = 0;
int fcount = 0;

String name = "";

while (i <= 5){

System.out.println("enter a students name: ");
name = keyboard.nextLine();
System.out.println("enter a score: ");
grade = keyboard.nextInt();keyboard.nextLine();
total += grade;
gradeCounter++;

i++;

switch (grade / 10){
case 10:
case 9:
acount++;
break;

case 8:
bcount++;
break;

case 7:
ccount++;
break;

case 6:
dcount++;

default:
fcount++;
break;

}
}

System.out.println("The total of all grade is: "+total);


if (gradeCounter != 0){
average = (double) total / gradeCounter;

System.out.printf("%s%.2f%n","the average is: ",average);

}

System.out.printf("Number of students that scored A: %d%n",acount);
System.out.printf("Number of students that scored B: %d%n",bcount);
System.out.printf("Number of students that scored C: %d%n",ccount);
System.out.printf("Number of students that scored D: %d%n",dcount);
System.out.printf("Number of students that scored F: %d%n",fcount);

}

}




















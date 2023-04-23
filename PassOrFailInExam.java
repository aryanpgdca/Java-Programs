import java.util.Scanner;
class PassOrFailInExam {
public static void main(String[] args) {
 int marksObtained, passingMarks;
 char grade;
 passingMarks = 35;
 Scanner input = new Scanner(System.in);
 System.out.println("Input marks scored by you");
 marksObtained = input.nextInt();
 if (marksObtained >= passingMarks) {
 if (marksObtained > 95)
 grade = 'A';
 else if (marksObtained > 80)
 grade = 'B';
 else if (marksObtained > 65)
 grade = 'C';
 else
 grade = 'D';
 System.out.println("You passed the exam with grade: " + grade);
 }
 else {
 grade = 'F';
 System.out.println("You failed with grade: " + grade);
 }
 }
}
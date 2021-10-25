//A Java program to check for grades based on specific instructions
//Sedenu Aloaye Charles (CharlesTechy)
import java.util.Scanner;  // Import the Scanner class

public class DelsuGrade {
public static void main(String[] args) {
        
Scanner keyboard = new Scanner(System.in);  // Create a Scanner object

System.out.println("Enter Score");

int score = keyboard.nextInt();  // Read user input
  char grade;
  
if (score >= 70 && score <= 100){
    grade = 'A';
    System.out.println("Grade is: " + grade);  // Output Grade
}

else if (score >= 60 && score <= 69){
    grade = 'B';
    System.out.println("Grade is: " + grade);  // Output Grade
}

else if (score >= 50 && score <= 59){
    grade = 'C';
  System.out.println("Grade is: " + grade);  // Output Grade
}

else if (score >= 45 && score <= 49){
    grade = 'D';
 System.out.println("Grade is: " + grade);  // Output Grade  
}

else if (score < 45){
    grade = 'F';
 System.out.println("Grade is: " + grade);  // Output Grade
}

else {
   System.out.println("Score is Out of Range");  // Output Grade
}

    }
}

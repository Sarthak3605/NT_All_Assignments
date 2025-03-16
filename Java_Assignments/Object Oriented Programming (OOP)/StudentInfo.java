//Create a class to represent a student with attributes like name, roll number, and marks.
import java.util.*;
class Student {
    String name;
    int roll_number;
    double marks;

    public Student(String name,int roll_number,double marks){ //class constructor
        this.name = name;
        this.roll_number = roll_number;
        this.marks = marks;
    }

	//function to display the information of student
    public void DisplayStudentInfo(){
        System.out.println("Name of the student is: "+name);
        System.out.println("Roll number of the student is: "+roll_number);
        System.out.println("Marks of the student is: "+marks);
    }
}
 class StudentInfo{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of student:");
        String name = input.next();

        System.out.println("Enter the roll number of student:");
        int roll_number = input.nextInt();

        System.out.println("Enter the marks of student:");
        double marks = input.nextDouble();

        Student student = new Student(name, roll_number, marks);
		student.DisplayStudentInfo();

    }
}

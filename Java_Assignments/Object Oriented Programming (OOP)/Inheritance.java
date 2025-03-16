//Implement inheritance to create a "GraduateStudent" class that extends the "Student" class with additional features.
class Student{
	String name;
	int roll_number;
	int marks;

	//class constructor
	public Student(String name,int roll_number,int marks){
		this.name = name;
		this.roll_number = roll_number;
		this.marks = marks;
	}
	//function that displays the info of student
	public void displayInfo(){
		System.out.println("Name of student: "+name);
		System.out.println("Roll number of student: "+roll_number);
		System.out.println("Marks of student: "+marks);
	}
}

//inheritance - GraduateStudent class is derived from Student class
class GraduateStudent extends Student{
	String major;
	String researchTopic;

	//class constructor
	public GraduateStudent(String name,int roll_number,int marks,String major,String researchTopic){
		super(name, roll_number, marks);
		this.major = major;
		this.researchTopic = researchTopic;
	}

	//function that displays the info graduate student
	@Override
	public void displayInfo(){
		super.displayInfo(); //calling parent method using super
		System.out.println("Major of student: "+major);
		System.out.println("Research Topic of student: "+researchTopic);
	}
}

public class Inheritance{
	public static void main(String[] args) {

     GraduateStudent graduateStudent = new GraduateStudent("Sarthak", 21, 100, "Computer Science Engineering", "Modern Society with Technology");
	 graduateStudent.displayInfo();
	}
}
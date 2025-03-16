//Write a program to reverse a given string.
import java.util.*;

public class ReverseStringProgram {

	public static void ReverseString(String string){
		String newString = string.trim(); //this trims the string and remove blank spaces
		String reversed = ""; //in this we will store our reversed string and display it
		for(int i=newString.length()-1 ; i>=0 ; i--){
			reversed += newString.charAt(i); //each character is added
		}
		System.out.println(reversed);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String string = input.nextLine();
		ReverseString(string); //function called to reverse the string
	}
}

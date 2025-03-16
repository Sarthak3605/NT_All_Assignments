// Explain the difference between primitive and reference data types with examples.

public class DataTypes {
    public static void main(String args[]) {
        System.out.println("Primitive data types");

        int id = 1;
        char ch = 'a';
        double number = 245.125;
        boolean correct = true;

        System.out.println(id + " - Integer type");
        System.out.println(ch + " - Character type");
        System.out.println(number + " - Double type");
        System.out.println(correct + " - Boolean type");
        System.out.println(); //this prints the new line so that output looks clean

        System.out.println("Reference data types");

        String name = "Sarthak Jain";
        int arr[] = {10, 56, 4, 5, 20, 1};

        System.out.println(name + " - String type");
        System.out.println(arr[4] + " - Array type");
        System.out.println(name instanceof String + " - name is an instance of String class");
        System.out.println(name.getClass().getName() + " class of name(String type)");
    }
}

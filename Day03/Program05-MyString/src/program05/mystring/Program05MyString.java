package program05.mystring;

public class Program05MyString {
    public static void main(String[] args) {
        System.out.println("My name is " + myString());
        System.out.println("To Lower: " + myString().toLowerCase());
        System.out.println("To Uper: " + myString().toUpperCase());
        System.out.println("First Name: " + myString().substring(0, 4));
        System.out.println("Lenght of String: " + myString().length());
        System.out.println("Trim String: " + myString().trim());
        System.out.println("Lenght of String after trim: " + myString().trim().length());
        System.out.println("Get character at index 2: " + myString().charAt(2));
        System.out.println("Find and Replace Tam -> tam:  " + myString().replaceAll("Tam", "tam"));
        System.out.println("String start with T character? " + myString().startsWith("T"));
        System.out.println("String end with N character? " + myString().endsWith("N"));
        System.out.println("String contains 'a' character? " + myString().contains("a"));
    }
    
    public static String myString() {
        String myName = " Tam Nguyen ";
        return myName;
    }
}

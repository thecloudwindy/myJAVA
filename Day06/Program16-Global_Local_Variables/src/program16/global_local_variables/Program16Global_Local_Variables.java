package program16.global_local_variables;

import java.util.Scanner;

public class Program16Global_Local_Variables {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Sum: " +  sum());
    }
    
    public static int number(){
        Scanner sc = new Scanner(System.in);
        int number;
        number = sc.nextInt();
        return number;
    }
    
    public static int sum(){
        System.out.print("Enter a = ");
        int a = number();
        System.out.print("Enter b = ");
        int b = number();
        return a + b;
    }
}

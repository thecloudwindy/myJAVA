package program14.break_and_continue;

import java.util.Scanner;

public class Program14Break_and_Continue {

    public static void main(String[] args) {
        int number = put_number();
        //System.out.println("number = " + number);
        odd_number(number);
    }
    
    public static int put_number(){
        int number;
        System.out.print("Enter number = ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        return number;
    }
    
    public static void odd_number(int n){
        int i = 0;
        while (i < n){
            if(i == 7 || i == 9){
                i ++;
                continue;
            }
            if (i %2 != 0){
                System.out.printf("%d \t", i);
            }
            i += 1;
        }
    }
}

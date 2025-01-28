package program17.tinhgiaithua;

import java.util.Scanner;

public class Program17TinhGiaithua {

    public static void main(String[] args) {
       int n = setNumber();
        System.out.printf("Giai thua cua %d la: %d \n", n, giaiThua(n));
    }
    
    public static int setNumber(){
        int number;
        System.out.print("Enter Number = ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        return number;
    }
    
    public static int giaiThua(int n){
        int result = 1;
        if (n == 0 || n == 1){
            result = 1;
        }
        else{
            for (int i = 1; i <= n; i ++){
                result *= i;
            }
        }
        return result;
    }
}

package program15.bangcuuchuong;

import java.util.Scanner;

public class Program15BangCuuChuong {

    public static void main(String[] args) {
        int n = number();
        bcc(n);
    }
    
    public static int number(){
        int number;
        System.out.print("Enter Number = ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        return number;
    }
    
    public static void bcc(int n){
        for (int i = 2; i <= 9; i++){
            System.out.printf("Bang cuu chuong %d: \n", i);
            for(int j = 2; j <= 10; j ++){
                System.out.printf("%d * %d = %d \n", i, j, i*j);
            }
        }
    }
}

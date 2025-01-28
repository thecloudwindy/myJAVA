package program13.vonglapwhile;

import java.util.Scanner;

public class Program13VongLapWhile {
    public static void main(String[] args) {
        String response = "Y";
        Scanner sc = new Scanner(System.in);
        while (response.equalsIgnoreCase(response)) {
            System.out.println("Hello World!");
            System.out.println("Moi nhap hanh dong Y/N?: ");
            response = sc.nextLine();
        }
    }
    
}

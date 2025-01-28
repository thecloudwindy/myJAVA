package program07.nhapxuatgiatri;
import java.util.Scanner;

public class Program07NhapXuatGiaTri {
    public static void main(String[] args) {
        /*System.out.print("Nhap gia tri a = ");
        int a = intNumber();
        System.out.print("Nhap gia tri b = ");
        int b = intNumber();
        System.out.println("Tong cua a va b la: " + (a + b));*/
        
        /*System.out.print("Nhap gia tri c = ");
        double c = doubleNumber();
        System.out.print("Nhap gia tri d = ");
        double d = doubleNumber();
        System.out.println("Tong cua c va d la: " + (c + d));*/
        
        System.out.print("Ho: ");
        String lastName = stringX();
        System.out.print("Ten: ");
        String firstName = stringX();
        System.out.println("Ho & ten: " + lastName + " " + firstName);
    }
    
    public static int intNumber(){
        int int_number;
        Scanner sc = new Scanner(System.in);
        int_number = sc.nextInt();
        return int_number;
    }
    
    public static double doubleNumber() {
        double double_number;
        Scanner sc = new Scanner(System.in);
        double_number = sc.nextDouble();
        return double_number;
    }
    
    public static String stringX(){
        String string_x;
        Scanner sc = new Scanner(System.in);
        string_x = sc.nextLine();
        return string_x;
    }
}

package program19.taomenu;

import java.util.Scanner;

public class Program19TaoMenu {
    public static void main(String[] args) {
        menu();
        int n = setNumber01();
        switch (n) {
            case 0 -> {System.out.println("0.Thoat chuong trinh!"); 
            System.exit(0);}
                
            case 1 -> {
                System.out.println("1.Kiem tra so nguyen to");
                int mynu = setNumber02();
                if (checkIsPrime(mynu)){
                    System.out.printf("%d la so nguyen to! \n", mynu);
                }
                else{
                    System.out.printf("%d khong la so nguyen to! \n", mynu);
                }
            }
                
            case 2 -> {
                System.out.print("2.In ra n so nguyen to dau tien");
                inNSoNguyenToDauTien(setNumber02());
            }
            
            case 3 -> {
                System.out.println("3.In ra cac so le nho hon n");
                inRaCacSoLe(setNumber02());
            }
                
            case 4 -> { 
                System.out.println("4.Tinh giai thua cua mot so");
                giaiThua(setNumber02());
            }
                
            default -> throw new AssertionError();
        }
    }
    
    public static int setNumber01(){
        int number;
        System.out.print("Moi nhap so thu tu: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        while(true){
            if (number < 0 || number >= 5){
                System.out.println("Gia tri nhap vao khong hop le, vui long thu lai!");
            }
            else{
                break;
            }
        }
        return number;
    }
    
    public static int setNumber02(){
        int number;
        System.out.print("Moi nhap so: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        return number;
    }
    
    public static void menu(){
        System.out.println("LUA CHON CHUONG TRINH");
        System.out.println("0. Thoat chuong trinh");
        System.out.println("1. Kiem tra so nguyen to");
        System.out.println("2. In ra n so nguyen to dau tien");
        System.out.println("3. In ra cac so le nho hon n");
        System.out.println("4. Tinh giai thua cua mot so");
    }
    
    public static boolean checkIsPrime(int number){
        if (number < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i ++){
            if (number % 2 == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void inNSoNguyenToDauTien(int n) {
        System.out.print("So luong SNT muon in ra man hinh? ");
        int count = 0;
        for (int i = 3; i > 0; i ++){
            boolean resultIsPrime = checkIsPrime(i);
            if(resultIsPrime == true){
                System.out.printf("%d \t", i);
                count ++;
            }
            if (count == n){
                break;
            }
        }
    }
    
    public static void inRaCacSoLe(int number){
        for(int i = 1; i <= number; i ++){
            if (i%2 != 0){
                System.out.printf("%d \t", i);
            }
        }
    }
    
    public static void giaiThua(int n){
        int result = 1;
        if (n == 0 || n == 1){
            result = 1;
        }
        else{
            for (int i = 1; i <= n; i ++){
                result *= i;
            }
        }
        System.out.printf("Giai thua cua %d la %d: \n", n, result);
    }
}

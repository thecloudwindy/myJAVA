package program18.songuyento;

import java.util.Scanner;

public class Program18SoNguyenTo {

    public static void main(String[] args) {
        // TODO code application logic here
        /*System.out.printf("Enter N = ");
        int n = setNumber();
        boolean status = checkIsPrime(n);
        System.out.println("Status: " + status);*/
        inNSoNguyenToDauTien();
    }
    
    // Nhap so n tu ban phim
    public static int setNumber(){
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        return number;
    }
    
    // Kiem tra co phai la SNT hay khong
    public static boolean checkIsPrime(int number){
        boolean flag = true;
        if (number < 2){
            flag = false;
        }
        else{
            for (int i = 2; i < number; i++){
                if(number % i == 0){
                    flag = false;
                }
            }
        }
        return flag;
    }
    
    // In ra N so nguyen to dau tien
    public static void inNSoNguyenToDauTien() {
        System.out.print("So luong SNT muon in ra man hinh? ");
        int n = setNumber();
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
}

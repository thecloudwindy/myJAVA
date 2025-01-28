package baitap01;

import java.util.Scanner;

/**
 *
 * @author tamnguyen
 */
public class Baitap01 {
    public static void main(String[] args) {
        // TODO code application logic here
        int n = getAPositiveInteger();
   
        /*if (isPrime(n)){
            System.out.println(n + " is Prime");
        }
        else{
            System.out.println(n + " isn't Prime");
        }*/
        // printPrimeIntegers();
        System.out.println(n + " So nguyen to dau tien la: ");
        printTheFirst1000sPrime(n);
    }
    public static boolean isPrime(int n) {
        //n = getAPositiveInteger();
        if (n<2){
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static int getAPositiveInteger(){
        int n;
        System.out.printf("Nhap vao so: ");
        Scanner myNumber = new Scanner(System.in);
        n = myNumber.nextInt();
        return n;
    }
    
    public static void printPrimeIntegers(){
        for (int i = 1; i < 100; i ++){
            if(isPrime(i)){
                System.out.printf("%d  ", i);
            }
        }
    }
    
    public static void printTheFirst1000sPrime(int n){
        int count = 0;
        int i = 2;
        while (count < n){
            if(isPrime(i)){
                System.out.printf("%d ",i);
                count ++;
            }
            i ++;            
        }               
    }
}



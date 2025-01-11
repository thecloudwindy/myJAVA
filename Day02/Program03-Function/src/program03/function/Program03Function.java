package program03.function;

import java.util.Scanner;

/**
 *
 * @author tamng
 */
public class Program03Function {
    public static void main(String[] args) {
        // TODO code application logic here
        //printIntegerList(10); //hardcode
        int n = getAPositiveInteger();
        System.out.println("Your Number: " + n);
        printIntegerList(n);        
    }
    
    public static void printIntegerList(int n){
        System.out.println("Danh sach cac so nguyen tu 1 ->" + n + ":");
        for (int i = 1; i < n + 1; i ++){
            System.out.printf("%d  ", i);
            /*if (i == n){
                System.out.println("\n");
            }*/
        } 
        System.out.println("");
        // nên đặt biến i bên trong vòng lặp for để nó chỉ có giá trị với vòng for đó mà
        // thôi, tức là sau khi xong vòng for thì biến i đó sẽ ko còn giá trị nữa, tránh
        // việc đặt bên ngoài ngoài for vì có thể ghi đè các giá trị i trong các vòng for khác
    } 
    
    // Hàm trả về 1 số nguyên nhập vào từ bàn phím
    public static int getAPositiveInteger(){
        // nhập từ bàn phím <=> data đưa vào
        int n;
        Scanner myVar = new Scanner(System.in);
        System.out.println("Input A Positive Number: ");
        n = myVar.nextInt();
        return n;
    }
}

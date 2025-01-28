package program08.baitapnhapxuatdulieu;

import java.util.Scanner;

public class Program08BaiTapNhapXuatDuLieu {
    public static void main(String[] args) {
      final int cost = 18000;
      double salary = cost*salaryRange();
        System.out.printf("Nhan vien %s co luong la %.3f \n", Name(), salary);
    }
    
    public static String Name(){
        String name;
        System.out.print("Moi nhap ho & ten: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        return name;
    }
    
    public static double salaryRange(){
        double salary_range;
        System.out.print("Moi nhap he so luong: ");
        Scanner sc = new Scanner(System.in);
        salary_range = sc.nextDouble();
        return salary_range;
    }
}

package program09.tinhchuvi_dientichhinhtron;

import java.util.Scanner;

public class Program09TinhChuVi_DienTichHinhTron {
    public static void main(String[] args) {
        final double pi = 3.14;
        int ban_kinh = ban_kinh();
        System.out.printf("Chu vi hinh tron la %.3f \n", chu_vi(pi, ban_kinh));
        System.out.printf("Dien tich hinh tron la %.3f \n", dien_tich(pi, ban_kinh));
    }
    
    public static int ban_kinh(){
        int R;
        System.out.print("Nhap ban kinh: ");
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        return R;
    }
    
    public static double chu_vi(double pi, int R){
        double chu_vi = 2*pi*R;
        return chu_vi;
    }
    
    public static double dien_tich(double pi, int R){
        double dien_tich = pi*Math.pow(R,2);
        return dien_tich;
    }
}

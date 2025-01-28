package program10.doitien;

import java.util.Scanner;

public class Program10DoiTien {
    public static void main(String[] args) {
        int vnd = viet_nam_dong();
        double ty_gia = ti_gia();
        double result =quy_doi(vnd, ty_gia);
        System.out.printf("%d tuong duong voi %.3f Dolar \n", vnd, result);
    }
    
    public static int viet_nam_dong(){
        int vnd;
        System.out.print("Nhap so tien vnd: ");
        Scanner sc = new Scanner(System.in);
        vnd = sc.nextInt();
        return vnd;
    }
    
    public static double ti_gia(){
        double tiGia;
        System.out.print("Nhap ty gia hien tai: ");
        Scanner sc = new Scanner(System.in);
        tiGia = sc.nextDouble();
        return tiGia;
    }
    
    public static double quy_doi(int vnd, double ty_gia){
        double quyDoi;
        quyDoi = vnd/ty_gia;
        return quyDoi;
    }
}

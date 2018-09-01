import javax.swing.*;
import java.util.Scanner;

public class MangRangCua {
    static int[][] a = null;
    public static void main(String[] args){

        NhapMangRC(a);
        XuatMangRC(a);
        int sum = Sum(a);
        System.out.println("Tong cac phan tu: " + sum);
        int max = TimPhanTuLonNhat(a);
        System.out.println("Phan tu lon nhat la: " + max);

    }

    public static void NhapMangRC(int a[][]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so dong: ");
        int dong = scanner.nextInt();
        a=new int[dong][];
        for(int i=0; i<a.length; i++){
            System.out.print("Nhap so cot cho dong thu " + (i+1) + ": ");
            int cot = scanner.nextInt();
            a[i]=new int[cot];
            for(int j=0; j<a[i].length; j++){
                System.out.print("Nhap phan tu thu a[" + i + "][" + j + "]: ");
                a[i][j]=scanner.nextInt();
            }
        }
    }
    public static void XuatMangRC(int[][] a){
        try{
            System.out.println("---Xuat mang 2 chieu---");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static int Sum(int a[][]){
        int tong = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                tong += a[i][j];
            }
        }
        return tong;
    }

    public static int TimPhanTuLonNhat(int [][]a){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]> max)
                    max=a[i][j];
            }
        }
        return max;
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[][] a = null;
        NhapMang2Chieu(a);
        XuatMang2Chieu(a);
        int sum = Sum(a);
        int max = TimPhanTuLonNhat(a);
        System.out.println("Tong cac phan tu: "+ max);
        System.out.println("Phan tu lon nhat la: "+ max);
    }

    public static void NhapMang2Chieu(int[][] a) {
        System.out.print("Nhap so dong, so cot: ");
        Scanner scanner = new Scanner(System.in);
        int dong, cot;
        dong = scanner.nextInt();
        cot = scanner.nextInt();
        a = new int[dong][cot];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("Nhap phan tu thu a[" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextInt();
            }
        }
    }

    public static void XuatMang2Chieu(int a[][]) {
        System.out.println("---Xuat mang 2 chieu---");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
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

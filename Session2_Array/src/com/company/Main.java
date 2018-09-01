package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        int n= 0;
        System.out.println("Nhap vao so luong phan tu mang mot chieu: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr= new int[n];;
        NhapMangMotChieu(arr, n);
        XuatMangMotChieu(arr, n);
        int tong = TinhTongPhanTuTrongMang(arr, n);
        System.out.println("Tong cac phan tu trong mang la: " + tong);
        int max = TimPhanTuLonNhat(arr, n);
        System.out.println("Phan tu lon nhat trong mang la: " + max);

        SapXepMangTangDan(arr, n);
        XuatMangMotChieu(arr, n);


    }
    public static void NhapMangMotChieu(int []arr, int n){
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<n; i++){
            System.out.println("Nhap vao phan tu thu " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
    }
    public static void XuatMangMotChieu(int []arr, int n){
        System.out.println("---Xuat mang mot chieu---");
        for(int i =0; i< n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static int TinhTongPhanTuTrongMang(int []arr, int n){
        int tong = 0;
        for(int element: arr){
            tong += element;
        }
        return tong;
    }
    public static int TimPhanTuLonNhat(int []arr, int n){
        int max = Integer.MIN_VALUE;
        for (int element:
             arr) {
            if(element > max)
                max=element;
        }
        return max;
    }
    public static void SapXepMangTangDan(int []arr, int n){
        int min, temp;
        for(int i=0; i< arr.length -1; i++){
            min = i;
            for(int j =i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min]=temp;
        }
    }
}
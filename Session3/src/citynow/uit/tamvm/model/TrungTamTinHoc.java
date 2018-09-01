package citynow.uit.tamvm.model;

import java.util.Scanner;

public class TrungTamTinHoc{
    private GiangVien[] arrGiangVien;

    public TrungTamTinHoc(){
        this.arrGiangVien = null;
    }
    public TrungTamTinHoc(GiangVien... arrGiangVien){
        this.arrGiangVien = new GiangVien[arrGiangVien.length];
        for(int i=0; i<arrGiangVien.length; i++){
            this.arrGiangVien[i]=new GiangVien(arrGiangVien[i]);
        }
    }
    public TrungTamTinHoc(TrungTamTinHoc ttth){
        this.arrGiangVien =new GiangVien[ttth.arrGiangVien.length];
        for (int i=0; i<ttth.arrGiangVien.length; i++){
            this.arrGiangVien[i] = new GiangVien(ttth.arrGiangVien[i]);
        }
    }
    public void NhapThongTinGiangVien(){
        System.out.print("Nhap so luong giang vien can nhap: ");
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        arrGiangVien = new GiangVien[n];
        byte luachon = 0;
        for (int i=0; i<n; i++){
            do {
                System.out.println("1. Giang vien co huu");
                System.out.println("2. Giang vien thinh giang");
                System.out.print("Mời nhập lựa chọn: ");
                luachon = scanner.nextByte();
            }while (luachon < 1 || luachon >2);
            if(luachon == 1){
                arrGiangVien[i] =  new GiangVienCoHuu();
            }
            else{
                arrGiangVien[i] = new GiangVienThinhGiang();
            }
            arrGiangVien[i].NhapThongTinGiangVien();
        }
    }
    public void XuatThongTinGiangVien(){
        for (GiangVien gv:
            arrGiangVien) {
            gv.XuatThongTinGiangVien();
        }
    }
    public void XuatThongTinGVCoHuu(){
        for(GiangVien gv : arrGiangVien){
            if(gv.Loai() == 0){
                gv.XuatThongTinGiangVien();
            }
        }
    }
    public void XuatThongTinGVThinhGiang(){
        for(GiangVien gv : arrGiangVien){
            if(gv.Loai() == 1){
                gv.XuatThongTinGiangVien();
            }
        }
    }
    public int TongLuong(){
        int tongLuong = 0;
        for (GiangVien gv:
             arrGiangVien) {
            tongLuong += gv.TinhLuong();
        }
        return tongLuong;
    }
    public byte TimLoaiGVCoLuongCaoNhat(){
        int max = 0;
        int index = 0;
        for(int i=0 ;i<arrGiangVien.length; i++){
            if(arrGiangVien[i].TinhLuong() > max){
                max = arrGiangVien[i].TinhLuong();
                index = i;
            }
        }
        return arrGiangVien[index].Loai();
    }
}
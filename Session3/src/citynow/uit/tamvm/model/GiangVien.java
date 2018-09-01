package citynow.uit.tamvm.model;

import java.util.Scanner;

public class GiangVien{
    protected String ten;
    protected String email;
    protected String diaChi;
    protected String sdt;
    protected int gioDayTrongThang;

    public GiangVien(){
        this.ten = "Tam";
        this.email = "tamvm@gmail.com";
        this.diaChi = "ktx";
        this.sdt = "0124356778";
        this.gioDayTrongThang = 0;
    }
    public GiangVien(String ten, String email, String diaChi, String sdt, int gioDayTrongThang){
        this.ten = ten;
        this.email = email;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.gioDayTrongThang = gioDayTrongThang;
    }
    public GiangVien(GiangVien gv){
        this.ten = gv.ten;
        this.email = gv.email;
        this.diaChi = gv.diaChi;
        this.sdt = gv.sdt;
        this.gioDayTrongThang = gv.gioDayTrongThang;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    public String getTen(){
        return this.ten;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    public String getDiaChi(){
        return this.diaChi;
    }
    public String getSdt(){
        return this.sdt;
    }
    public void setGioDayTrongThang(int gioDayTrongThang){
        this.gioDayTrongThang = gioDayTrongThang;
    }
    public int getGioDayTrongThang(){
        return this.gioDayTrongThang;
    }
    public void NhapThongTinGiangVien(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ten giang vien: ");
        String ten = scanner.nextLine();
        this.ten = ten;

        System.out.println("Nhap email giang vien: ");
        String email = scanner.nextLine();
        this.email = email;

        System.out.println("Nhap dia chi giang vien: ");
        String diaChi = scanner.nextLine();
        this.diaChi = diaChi;

        System.out.println("Nhap so dien thoai giang vien: ");
        String sdt = scanner.nextLine();
        this.sdt = sdt;

        System.out.println("Nhap so gio day trong thang: ");
        int gioDayTrongThang = scanner.nextInt();
        this.gioDayTrongThang = gioDayTrongThang;
    }
    public void XuatThongTinGiangVien(){
        System.out.println("Ten giang vien: " + this.ten);
        System.out.println("Email giang vien: " + this.email);
        System.out.println("Dia chi giang vien: " + this.diaChi);
        System.out.println("Sdt giang vien: " + this.sdt);
        System.out.println("Gio day trong thang cua giang vien: " + this.gioDayTrongThang);
    }
    public int TinhLuong(){
        return 0;
    }
    @Override
    public String toString() {
        return this.ten + " - " + this.email + " - " + this.diaChi + " - " + this.sdt + " - " + this.gioDayTrongThang;
    }
    public byte Loai(){
        return 0;
    }
}

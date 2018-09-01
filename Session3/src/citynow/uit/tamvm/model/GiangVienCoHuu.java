package citynow.uit.tamvm.model;

import java.util.Scanner;

public class GiangVienCoHuu extends GiangVien{
    private int luongThoaThuan;
    private int gioQuyDinhTrongThang;

    public GiangVienCoHuu(){
        super();
        this.luongThoaThuan = 0;
        this.gioQuyDinhTrongThang = 0;
    }
    public GiangVienCoHuu(String ten, String email, String diaChi, String sdt, int gioDayTrongThang, int luongThoaThuan, int gioQuyDinhTrongThang){
        super(ten, email, diaChi, sdt, gioDayTrongThang);
        this.luongThoaThuan = luongThoaThuan;
        this.gioQuyDinhTrongThang = gioQuyDinhTrongThang;
    }
    public GiangVienCoHuu(GiangVienCoHuu gvch){
        super(gvch);
        this.luongThoaThuan = gvch.getLuongThoaThuan();
        this.gioQuyDinhTrongThang = gvch.getGioQuyDinhTrongThang();
    }
    public void setLuongThoaThuan(int luongThoaThuan) {
        this.luongThoaThuan = luongThoaThuan;
    }
    public int getLuongThoaThuan(){
        return this.luongThoaThuan;
    }
    public  void setGioQuyDinhTrongThang(int gioQuyDinhTrongThang){
        this.gioQuyDinhTrongThang = gioQuyDinhTrongThang;
    }
    public int getGioQuyDinhTrongThang(){
        return this.gioQuyDinhTrongThang;
    }
    @Override
    public void NhapThongTinGiangVien(){
        super.NhapThongTinGiangVien();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap luong thoa thuan: ");
        int luongThoaThuan = scanner.nextInt();
        this.luongThoaThuan=luongThoaThuan;

        System.out.println("Nhap gio quy dinh trong thang: ");
        int gioQuyDinhTrongThang = scanner.nextInt();
        this.gioQuyDinhTrongThang=gioQuyDinhTrongThang;
    }
    @Override
    public void XuatThongTinGiangVien(){
        super.XuatThongTinGiangVien();
        System.out.println("Luong thoa thuan cua giang vien: " + this.luongThoaThuan);
        System.out.println("Gio quy dinh cua giang vien: " + this.gioQuyDinhTrongThang);
    }
    @Override
    public int TinhLuong(){
        return this.getLuongThoaThuan() +
                (this.getGioDayTrongThang() > this.getGioQuyDinhTrongThang() ?
                        (this.getGioDayTrongThang() - this.getGioQuyDinhTrongThang())*200000 : 0);
    }
    @Override
    public String toString() {
        return super.toString() + " - " + this.luongThoaThuan + " - " + this.gioQuyDinhTrongThang;
    }
    @Override
    public byte Loai(){
        return 0;
    }
}
package citynow.uit.tamvm.model;

import java.util.Scanner;

public class GiangVienThinhGiang extends GiangVien{
    private String coQuanLamViec;

    public GiangVienThinhGiang(){
        super();
        this.coQuanLamViec="hcmus";
    }
    public GiangVienThinhGiang(String ten, String email, String diaChi, String sdt, int gioDayTrongThang, String coQuanLamViec){
        super(ten, email, diaChi, sdt, gioDayTrongThang);
        this.coQuanLamViec = coQuanLamViec;
    }
    public GiangVienThinhGiang(GiangVienThinhGiang gvtg){
        super(gvtg);
        this.coQuanLamViec = gvtg.coQuanLamViec;
    }
    public String getCoQuanLamViec() {
        return coQuanLamViec;
    }
    public void setCoQuanLamViec(String coQuanLamViec){
        this.coQuanLamViec = coQuanLamViec;
    }
    @Override
    public void NhapThongTinGiangVien(){
        super.NhapThongTinGiangVien();
        System.out.println("Nhap co quan lam viec: ");
        Scanner scanner =new Scanner(System.in);
        String coQuanLamViec = scanner.nextLine();
        this.coQuanLamViec = coQuanLamViec;
    }
    @Override
    public void XuatThongTinGiangVien(){
        super.XuatThongTinGiangVien();
        System.out.println("Co quan lam viec cua giang vien: " + this.coQuanLamViec);
    }
    @Override
    public int TinhLuong(){
        return this.getGioDayTrongThang() * 200000;
    }
    @Override
    public byte Loai(){
        return 1;
    }
}

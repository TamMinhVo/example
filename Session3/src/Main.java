import citynow.uit.tamvm.model.GiangVien;
import citynow.uit.tamvm.model.GiangVienCoHuu;
import citynow.uit.tamvm.model.TrungTamTinHoc;

public class Main {

    public static void main(String[] args) {
        TrungTamTinHoc trungTamTinHoc = new TrungTamTinHoc();
        System.out.println("---Nhap thong tin giang vien---");
        trungTamTinHoc.NhapThongTinGiangVien();
        System.out.println("---Xuat thong tin giang vien---");
        trungTamTinHoc.XuatThongTinGiangVien();
        System.out.println("---Xuat thong tin giang vien co huu---");
        trungTamTinHoc.XuatThongTinGVCoHuu();
        System.out.println("---Xuat thong tin giang vien thinh giang---");
        trungTamTinHoc.XuatThongTinGVThinhGiang();
        System.out.println("---Tinh tong luong---");
        System.out.println("Tong luong: "+ trungTamTinHoc.TongLuong());
        System.out.println("---Loai giang vien co luong cao nhat---");
        if(trungTamTinHoc.TimLoaiGVCoLuongCaoNhat() == 0){
            System.out.println("Giang vien co huu co luong cao nhat");
        }
        else {
            System.out.println("Giang vien thinh giang co luong cao nhat");
        }
    }
}

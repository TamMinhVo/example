package citynow.uit.tamvm.model;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachPhanSo {
    ArrayList<PhanSo> dsPS = new ArrayList<PhanSo>();

    public DanhSachPhanSo(){
        this.dsPS = null;
    }

    public DanhSachPhanSo(PhanSo... phanSos){

    }

    public DanhSachPhanSo(DanhSachPhanSo danhSachPhanSo){

    }
    public void menu(){
        System.out.println("1. Nhap phan so");
        System.out.println("2. Xuat danh sach phan so");
        System.out.println("3. Them phan so");
        System.out.println("4. Xoa phan so tai vi tri k");
        System.out.println("5. Cap nhat phan so tai vi tri k");
        System.out.println("6. Tim phan so co gia tri lon nhat");
        System.out.println("7. Xoa danh sach phan so");
        System.out.println("Khac. Thoat.");
        System.out.print("Moi nhap lua chon: ");
        Scanner scanner = new Scanner(System.in);
        int luachon = scanner.nextInt();

        switch (luachon){
            case 1:
                NhapPS();
                break;
            case 2:
                XuatDSPS();
                break;
            case 3:
                NhapPS();
                break;
            case 4:
                XoaPSTaiViTriK();
                break;
            case 5:
                CapNhatPSTaiViTriK();
                break;
            case 6:
                PhanSo ps = new PhanSo();
                ps = TimPhanSoMax();
                System.out.println("Phan so lon nhat la: " + ps);
                break;
            case 7:
                XoaDSPS();
                break;
                default:
                    System.exit(0);
                    break;
        }
    }

    private void XoaDSPS() {
        dsPS.clear();
    }

    private PhanSo TimPhanSoMax() {
        PhanSo phanSo = new PhanSo();
        double value = 0;
        double max =0;
        for(PhanSo ps : dsPS){
            value = ps.getTuSo()/ps.getMauSo();
            if(value > max){
                max = value;
                phanSo = ps;
            }
        }
        return phanSo;
    }

    private void CapNhatPSTaiViTriK() {
        System.out.print("Nhap vi tri muon cap nhat: ");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        PhanSo ps = new PhanSo();
        ps = ps.NhapPS();

        dsPS.set(k, ps);
    }

    private void XoaPSTaiViTriK(){
        System.out.print("Nhap vi tri muon xoa: ");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        dsPS.remove(k);
    }

    /*private void ThemPS() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao tu so: ");
        int tuSo = scanner.nextInt();
        System.out.print("Nhap vao mau so: ");
        int mauSo = scanner.nextInt();
        PhanSo ps = new PhanSo(tuSo, mauSo);
        dsPS.add(ps);
    }
*/
    private void XuatDSPS() {
        for (int i = 0; i< dsPS.size(); i++) {
            System.out.println("Phan so thu " + (i+1) + " : " + dsPS.get(i));
        }
    }

    public void NhapPS(){
        PhanSo ps;
        ps.NhapPS();
        dsPS.add(ps);
    }
}

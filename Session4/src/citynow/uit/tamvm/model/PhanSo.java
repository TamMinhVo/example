package citynow.uit.tamvm.model;

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo(){
        this.tuSo = 1;
        this.mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PhanSo(PhanSo ps){
        this.tuSo = ps.tuSo;
        this.mauSo = ps.mauSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public PhanSo NhapPS(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao tu so: ");
        int tuSo = scanner.nextInt();
        System.out.print("Nhap vao mau so: ");
        int mauSo = scanner.nextInt();
        PhanSo ps = new PhanSo(tuSo, mauSo);

        return ps;
    }

    @Override
    public String toString() {
        return this.tuSo + "/" + this.mauSo;
    }
}

package model;

public class PhanSo{
    private int tuSo;
    private int mauSo;

    public int getTuSo() {
        return tuSo;
    }
    public void setTuSo(int tuSo){
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public PhanSo(){
        System.out.println("Đây là hàm khởi tạo mặc định phân số");
        this.tuSo=1;
        this.mauSo=1;
    }

    public PhanSo(int tuSo, int mauSo){
        System.out.println("Đây là hàm khởi tạo có tham số phân số");
        this.tuSo=tuSo;
        this.mauSo=mauSo;
    }
    public PhanSo(PhanSo ps){
        System.out.println("Đây là hàm khởi tạo sao chép phân số");
        this.tuSo = ps.tuSo;
        this.mauSo = ps.mauSo;
    }

    @Override
    public String toString() {
        return this.tuSo + "/" + this.mauSo;
    }
}

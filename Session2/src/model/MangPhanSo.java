package model;

public class MangPhanSo {
    private PhanSo arr[];

    public MangPhanSo() {
        System.out.println("Đây là hàm khởi tạo mặc định mảng phân số");
        this.arr = null;
    }
    public MangPhanSo(PhanSo... arr){
        System.out.println("Đây là hàm khởi tạo có tham số mảng phân số");
        this.arr = new PhanSo[arr.length];
        for(int i=0; i< arr.length; i++){
            this.arr[i]= new PhanSo(arr[i]);
        }
    }
    public MangPhanSo(MangPhanSo mps) {
        System.out.println("Đây là hàm khởi tạo sao chép mảng phân số");
        this.arr = new PhanSo[mps.arr.length];
        for(int i=0; i < arr.length; i++){
            arr[i]=mps.arr[i];
        }
    }

    public void PrintMangPhanSo(){
        for (PhanSo ob: arr
             ) {
            System.out.println(ob);
        }
    }
}
import model.MangPhanSo;
import model.PhanSo;

public class BasicOOP {
    public static void main(String[] args){
        MangPhanSo arr =  new MangPhanSo(new PhanSo(2,3), new PhanSo(3,4));
        System.out.println("-------------------------");
        MangPhanSo arr2 = new MangPhanSo(arr);

        arr.PrintMangPhanSo();
        arr2.PrintMangPhanSo();

    }
}

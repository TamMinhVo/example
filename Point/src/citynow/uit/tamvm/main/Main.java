package citynow.uit.tamvm.main;

import citynow.uit.tamvm.model.Point;

public class Main {

    public static void main(String[] args) {
       /* MangSoNguyen mps = new MangSoNguyen( 3, 9, 5);
        int[] arr = mps.getArr();
        int index = 1;
        int value = mps.get(index);
        int[] arr2 = {9,6,8};
        mps.setArr(arr2);
        index=0;
        mps.set(index, 7);
        System.out.print(value);*/

        Point p1 = new Point();
        Point p2 = new Point(2, 3);
        Point p3 = new Point(p2);
        p1.OutputPoint();
        p2.OutputPoint();
        p3.OutputPoint();

        p1.InputPoint();
        p1.OutputPoint();
        System.out.println("Distance: " + p1.DistanceOf(p2));
        System.out.println("projection x"+ p1.ProjectionPointX());
        System.out.println("projection y"+ p1.ProjectionPointY());
        p1.setX(10);
        System.out.print(p1.toString());

    }
   /* public static class MangSoNguyen{
        private int[] arr;
        public MangSoNguyen() {
            this.arr = null;
        }
        public MangSoNguyen(int... arr) {
            this.arr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                this.arr[i] = arr[i];
            }
        }
        public MangSoNguyen(MangSoNguyen msn) {
            this.arr = new int[msn.arr.length];
            for (int i = 0; i < msn.arr.length; i++) {
                this.arr[i] = msn.arr[i];
            }
        }
        public int[] getArr() {
            return arr;
        }
        public void setArr(int ... arr) {
            this.arr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                this.arr[i] = arr[i];
            }
        }
        public void set(int index, int value) {
            if (index >= 0 && index < this.arr.length) {
                this.arr[index]=value;
            }
        }
        public int get(int index) {
            int value =0;
            if (index >= 0 && index < this.arr.length) {
                value = this.arr[index];
            }
            return value;
        }
    }*/
}

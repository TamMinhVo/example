import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Problem13(4);
    }

    public static boolean Problem1(int n){
        if(n < 2)
            return false;
        else
        {
            for(int i= 2; i<= Math.sqrt(n); i++)
            {
                if(n%i == 0)
                    return false;
            }
            return true;
        }
    }

    public static boolean Problem2(int n){
        if(Math.sqrt(n)*Math.sqrt(n) == n)
            return true;
        return false;
    }
    //tim ucln
    public static int Problem3(int a, int b){
        while(a!=b){
            if(a>b)
                a-=b;
            else
                b-=a;
        }
        return a;
    }
    //tim bcnn
    public static int Problem4(int a, int b){
        return (a*b / Problem3(a,b));
    }
    //giai phuong trinh ax+b=0
    public static void Prolem5(int a, int b){
        if(b == 0)
            System.out.println("x=0");
        if(a==0)
            System.out.println("phuong trinh vo nghiem");
        else {
            System.out.println(-b/a);
        }
    }
    //giai phuong trinh ax2 + bx + c =0
    public static void Problem6 (int a, int b, int c){
        float delta = b*b-4*a*c;
        if(delta>0){
            System.out.println(String.format("phuong trinh co 2 nghiem phan biet x1 = %f, x2 = &f", (-b + Math.sqrt(delta))/(2*a), (-b - Math.sqrt(delta))/(2*a)));
        }
        else if(delta == 0){
            System.out.println(String.format("phuong trinh co nghiem kep x = %f", -b/(2*a)));
        }
        else
        {
            System.out.println("phuong trinh vo nghiem");
        }
    }

    public static double Problem7(int n){
        return Math.ceil(n/3);
    }

    public static boolean Problem8(int year){
        if((year%4==0 && year %100 != 0) || (year%400 == 0))
            return true;
        return false;
    }

    public static int Problem9(int month){
        int x=31;
        switch (month){
            case 4:
            case 6:
            case 9:
            case 11:
                x = 30;
            case 2:
                x = 29;
        }
        return x;
    }

    public static void Problem10(int n){
        for(int i =1; i<n; i+=2){
            System.out.println(i);
        }
    }
    public static void Problem11(int n){
        for(int i =1; i<n; i+=2){
            if(i==7 || i==21 || i==41)
                continue;
            System.out.println(i);
        }
    }

    public static void Problem12(int n){
        System.out.println(String.format("---Bang cuu chuong %d---", n));
        for(int i=1; i<=10; i++){
            System.out.println(String.format("%d x %d = %d", n, i, n*i));
        }
    }

    public static void Problem13(int h){
        System.out.println(String.format("---Ve tam giac co do cao %d---", h));
        int index = h + (h-1);
        for(int i=0; i<h; i++){
            for(int j = 0; j<index; j++){
                if(j%2==0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

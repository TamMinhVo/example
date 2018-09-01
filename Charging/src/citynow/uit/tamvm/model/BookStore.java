package citynow.uit.tamvm.model;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookStore{
    private Item[] items;

    public BookStore(){
        this.items = null;
    }
    public BookStore(Item[] items) {
        this.items = items;
    }

    public void InputItem(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of items: ");
        int n = scanner.nextInt();
        this.items = new Item[n];
        byte choice = 0;
        for(int i =0 ; i<n; i++){
            do{
                System.out.println("1. Pencil.");
                System.out.println("2. Vinh Tien Notebook.");
                System.out.println("3. Olympic Notebook.");
                System.out.println("4. Kim Thanh Notebook.");
                System.out.println("5. Handbook.");
                System.out.println("6. Eraser.");
                System.out.println("7. Ruler.");
                System.out.println("Enter your choice: ");
                choice = scanner.nextByte();
            }while (choice<1 || choice > 7);

            switch (choice){
                case 1:
                    this.items[i]= new Pencil();
                    break;
                case 2:
                    this.items[i]= new VinhTienNotebook();
                    break;
                case 3:
                    this.items[i]= new OlympicNotebook();
                    break;
                case 4:
                    this.items[i]= new KimThanhNotebook();
                    break;
                case 5:
                    this.items[i]= new Handbook();
                    break;
                case 6:
                    this.items[i]= new Eraser();
                    break;
                default:
                    this.items[i]= new Ruler();
                    break;
            }
            this.items[i].InputItem();
        }

    }

    public void OutPutItem(){
        System.out.println("------------YOUR BILL------------");
        for(int i =0; i<this.items.length; i++){
            this.items[i].OutputItem();
        }
    }

    public int Total(){
        int total =0;
        for(int i =0; i<this.items.length; i++){
            total += this.items[i].Total();
        }
        return total;
    }
}

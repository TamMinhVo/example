package citynow.uit.tamvm.model;

import java.util.Scanner;

public class Pencil extends Item {
    private final int price = 5000;
    private short quantity;

    public Pencil(){
        super();
        this.quantity = 0;
    }

    public Pencil(String id, String name, String producer, short quantity) {
        super(id, name, producer);
        this.quantity = quantity;
    }

    public Pencil(Pencil pencil) {
        super(pencil);
        this.quantity = pencil.quantity;
    }

    public int getPrice() {
        return price;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Pencil{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public void InputItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter id of pencil: ");
        String id = scanner.nextLine();
        System.out.println("Enter name of pencil: ");
        String name = scanner.nextLine();
        System.out.println("Enter producer of pencil: ");
        String producer = scanner.nextLine();
        System.out.println("Enter the quantity of pencil: ");
        short quantity = scanner.nextShort();

        this.id = id;
        this.name = name;
        this.producer = producer;
        this.quantity = quantity;
    }

    @Override
    public void OutputItem() {
        System.out.println(this.toString());
    }

    @Override
    public int Total() {
        return this.quantity * this.price;
    }
}
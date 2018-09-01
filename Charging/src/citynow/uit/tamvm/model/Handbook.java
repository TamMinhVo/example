package citynow.uit.tamvm.model;

import java.util.Scanner;

public class Handbook extends Item{
    private final int price = 7000;
    private short quantity;

    public Handbook(){
        super();
        this.quantity = 0;
    }

    public Handbook(String id, String name, String producer, short quantity) {
        super(id, name, producer);
        this.quantity = quantity;
    }

    public Handbook(Handbook handbook) {
        super(handbook);
        this.quantity = handbook.quantity;
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
        return "Handbook{" +
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

        System.out.println("Enter id of Handbook: ");
        String id = scanner.nextLine();
        System.out.println("Enter name of Handbook: ");
        String name = scanner.nextLine();
        System.out.println("Enter producer of Handbook: ");
        String producer = scanner.nextLine();
        System.out.println("Enter the quantity of Handbook: ");
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
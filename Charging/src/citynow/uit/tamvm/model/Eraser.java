package citynow.uit.tamvm.model;

import java.util.Scanner;

public class Eraser extends Item{
    private final int price = 3000;
    private short quantity;

    public Eraser(){
        super();
        this.quantity = 0;
    }

    public Eraser(String id, String name, String producer, short quantity) {
        super(id, name, producer);
        this.quantity = quantity;
    }

    public Eraser(Eraser eraser) {
        super(eraser);
        this.quantity = eraser.quantity;
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
        return "Eraser{" +
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

        System.out.println("Enter id of Eraser: ");
        String id = scanner.nextLine();
        System.out.println("Enter name of Eraser: ");
        String name = scanner.nextLine();
        System.out.println("Enter producer of Eraser: ");
        String producer = scanner.nextLine();
        System.out.println("Enter the quantity of Eraser: ");
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

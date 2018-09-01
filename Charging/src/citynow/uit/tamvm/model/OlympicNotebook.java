package citynow.uit.tamvm.model;

import java.util.Scanner;

public class OlympicNotebook extends Item{
    private final int price = 5000;
    private short quantity;

    public OlympicNotebook(){
        super();
        this.quantity = 0;
    }

    public OlympicNotebook(String id, String name, String producer, short quantity) {
        super(id, name, producer);
        this.quantity = quantity;
    }

    public OlympicNotebook(OlympicNotebook olympicNotebook) {
        super(olympicNotebook);
        this.quantity = olympicNotebook.quantity;
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
        return "OlympicNotebook{" +
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

        System.out.println("Enter id of OlympicNotebook: ");
        String id = scanner.nextLine();
        System.out.println("Enter name of OlympicNotebook: ");
        String name = scanner.nextLine();
        System.out.println("Enter producer of OlympicNotebook: ");
        String producer = scanner.nextLine();
        System.out.println("Enter the quantity of OlympicNotebook: ");
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
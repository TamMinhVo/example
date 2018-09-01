package citynow.uit.tamvm.model;

import java.util.Scanner;

public class KimThanhNotebook extends Item{
    private final int price = 6000;
    private short quantity;

    public KimThanhNotebook(){
        super();
        this.quantity = 0;
    }

    public KimThanhNotebook(String id, String name, String producer, short quantity) {
        super(id, name, producer);
        this.quantity = quantity;
    }

    public KimThanhNotebook(KimThanhNotebook kimThanhNotebookpublic) {
        super(kimThanhNotebookpublic);
        this.quantity = kimThanhNotebookpublic.quantity;
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
        return "KimThanhNotebook{" +
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

        System.out.println("Enter id of KimThanhNotebook: ");
        String id = scanner.nextLine();
        System.out.println("Enter name of KimThanhNotebook: ");
        String name = scanner.nextLine();
        System.out.println("Enter producer of KimThanhNotebook: ");
        String producer = scanner.nextLine();
        System.out.println("Enter the quantity of KimThanhNotebook: ");
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
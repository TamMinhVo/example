package citynow.uit.tamvm.model;

import java.util.Scanner;

public class VinhTienNotebook extends Item {
    private final int price = 8000;
    private short quantity;

    public VinhTienNotebook(){
        super();
        this.quantity = 0;
    }

    public VinhTienNotebook(String id, String name, String producer, short quantity) {
        super(id, name, producer);
        this.quantity = quantity;
    }

    public VinhTienNotebook(VinhTienNotebook vinhTienNotebook) {
        super(vinhTienNotebook);
        this.quantity = vinhTienNotebook.quantity;
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
        return "VinhTienNotebook{" +
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

        System.out.println("Enter id of VinhTienNotebook: ");
        String id = scanner.nextLine();
        System.out.println("Enter name of VinhTienNotebook: ");
        String name = scanner.nextLine();
        System.out.println("Enter producer of VinhTienNotebook: ");
        String producer = scanner.nextLine();
        System.out.println("Enter the quantity of VinhTienNotebook: ");
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
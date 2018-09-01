package citynow.uit.tamvm.main;

import citynow.uit.tamvm.model.BookStore;

public class Main {

    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        bookStore.InputItem();
        bookStore.OutPutItem();
        System.out.format("===>Total Of Your Bill: %,d" , bookStore.Total());
    }
}

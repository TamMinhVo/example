package citynow.uit.tamvm.model;

import java.util.Scanner;

public abstract class Item implements Comparable<Item>{
    protected String id;
    protected String name;
    protected String producer;

    public Item() {
        this.id = null;
        this.name = null;
        this.producer = null;
    }

    public Item(String id, String name, String producer) {
        this.id = id;
        this.name = name;
        this.producer = producer;
    }

    public Item(Item item){
        this.id = item.id;
        this.name = item.name;
        this.producer = item.producer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    //@Override
    //public abstract String toString();

    public abstract void InputItem();

    public abstract void OutputItem();

    public abstract int Total();

    @Override
    public int compareTo(Item o) {
        if(this.name.equals(o.name))
            return 0;
        else if(this.name.compareToIgnoreCase(o.name) > 0)
            return 1;
        return -1;
    }
}
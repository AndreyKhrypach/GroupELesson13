package Models;

import service.Painting;
import service.Printable;

public class Booklet extends Book implements Painting {
    private int serialNumber;
    public Booklet(String name, String author, int serialNumber) {
        super(name, author);
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    @Override
    public void print(){
        System.out.printf("%s (%s) %d", super.getName(), super.getAuthor(), serialNumber);
    }

    @Override
    public void paint() {
        System.out.println("booklet painted");
    }
}

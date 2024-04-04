package Models;

import service.Printable;

public class Book  implements Printable{
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void print() {
        System.out.printf("%s (%s) \n", name, author);
    }
}

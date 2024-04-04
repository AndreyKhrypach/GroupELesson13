package Models;

import service.Printable;

public class Journal implements Printable {
    private String name;

    public String getName(){
        return name;
    }

    public Journal(String name){
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println(name);
    }
}

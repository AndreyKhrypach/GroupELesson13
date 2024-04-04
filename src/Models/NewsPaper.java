package Models;

public class NewsPaper {
    private String name;

    public NewsPaper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print(){
        System.out.println("book name = " + name);
    }
}

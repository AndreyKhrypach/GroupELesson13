import Models.*;
import service.Device;
import service.Printable;
import service.Square;

public class Lesson13Program {
    public static void main(String[] args) {

        int a = 5;

        Square square = new Square() {
            @Override
            public int calculate(int x) {
                return x * x;
            }
        };
        int res = square.calculate(a);
        System.out.println(res);

        // lambda expression to define the calculate method
        Square square2 = (int x) -> x * x;

        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = square2.calculate(a);
        System.out.println(ans);

//        Booklet booklet = new Booklet("Test", "Test author", 12345);
//        booklet.defaultPaint();

//        read(booklet);

//        Printable printable = createPrintable("Foreign Affairs",false);
//        printable.print();
//
//        Book book = new Book("Java for impatients", "Cay Horstmann");
//        Journal journal = new Journal("Java Dayly News");
//        NewsPaper newsPaper = new NewsPaper("Washington Post");
//
//        read(book);
//        read(journal);
//        newsPaper.print();

//        read(new Book("Java for impatients", "Cay Horstmann"));
//        read(new Journal("Java Dayly News"));

//        Printable printable = new Book("Java. Complete Reference", "H. Shildt");
//        printable.print();      //  Java. Complete Reference (H. Shildt)
//        printable = new Journal("Foreign Policy");
//        printable.print();      // Foreign Policy
//
//        System.out.println(((Journal)printable).getName());

//        Printable.read();

//        WaterPipe pipe = new WaterPipe();
//        pipe.printState(1);

//        Device.Printable magazine = new Magazine("Foreign Affairs");
//        magazine.print();

//        Book b1 = new Book("Java. Complete Referense.", "H. Shildt");
//        b1.print();
    }

    private static void read(Printable printable){
        printable.print();
    }

    private static Printable createPrintable(String name, boolean option){

        if(option)
            return new Book(name, "Undefined");
        else
            return new Journal(name);
    }
}

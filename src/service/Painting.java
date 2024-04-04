package service;

public interface Painting {

    void paint();

    default void defaultPaint(){
        System.out.println("default painted");
    }
}

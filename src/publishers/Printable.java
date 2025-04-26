package publishers;

public interface Printable {
    int PDF = 0; // public static final
    int EBOOK = 1;

    void print();

    default void method(){
        System.out.println("Default method of interface");
    }

    static void staticMethod(){
        System.out.println("Static method of interface");
    }
}

import publishers.*;

import java.util.Date;

public class Program {
    public static void main(String[] args){
        Document order = new Document("Order", new Date(2024, 11, 23));
        order.print();
        order.method();
        Book idiot = new Book("Idiot", "Dostoevsky");
        idiot.print();
        idiot.method();

        Printable[] prints = new Printable[2];
        prints[0] = order;
        prints[1] = idiot;

        for(var p : prints)
            p.print();

        Printable.staticMethod();


        System.out.println(Ways.BACKWARD.count());
        for(var t : Ways.values())
            System.out.println(t);

        for(var c : Colors.values()){
            System.out.println(c);
        }
    }
}




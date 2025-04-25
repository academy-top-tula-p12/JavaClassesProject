package publishers;

import java.util.Date;

public class Document implements Printable {
    Date date;
    String title;

    public Document(String title, Date date){
        this.title = title;
        this.date = date;
    }

    @Override
    public void print() {
        System.out.printf("Document %s, at %s [%d]\n", title, date.toString(), PDF);
    }
}

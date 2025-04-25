import airflight.City;
import shapes.*;

import java.util.Random;

import static java.lang.System.out;

public class Examples {
    public static void CityExamples(){
        City moscow = new City("Moscow", "Tverskaya");
        City tula = new City("Tula", "Oboronnaya");
        out.println("City title " + moscow.getTitle());
        City newMoscow = CityModify(moscow);
        out.println("City title " + moscow.getTitle());
        out.println("City title " + newMoscow.getTitle());

        City.Street tverskaya = moscow.getStreet();
    }

    public static City CityModify(City city){
        city = new City(city.getTitle(), city.getStreet().getTitle());
        city.setTitle("c." + city.getTitle());
        return city;
    }

    public static void ShapesExample(){
        Random rand = new Random();
        Point[] points = new Point[5];

        points[0] = new Point(10, 20);
        points[1] = new Line(5, 6);
        points[2] = new Point(40, 50);
        points[3] = new Line(11, 22, 9, 11);
        points[4] = new Point(60, 70);

        for(var p : points)
            System.out.println(p.ToString());

        Object obj = new Rectangle(1, 2, 10, 20);

        System.out.println(obj instanceof Shape);
        System.out.println(obj instanceof Rectangle);
        System.out.println(obj instanceof Circle);
    }
}

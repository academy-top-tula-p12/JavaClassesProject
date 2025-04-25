package airflight;

public class City {
    static int globalId;
    int id;
    String title;
    Street street;

    {
        title = "";
    }
    static{
        globalId = 0;
    }

    public City(String title, String street){
        this.id = ++globalId;
        this.title = title;
        this.street = new Street(street);
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String value){
        title = value;
    }

    public int getId(){
        return id;
    }

    public static int globalId(){
        return globalId;
    }

    public void printInfo(){
        System.out.printf("City: %s, Street: %s", title, street.title);
    }

    public Street getStreet(){
        return this.street;
    }



    public class Street{
        String title;

        public Street(String title){
            this.title = title;
        }

        public String getTitle(){
            return title;
        }

        public void setTitle(String value){
            title = value;
        }
    }
}

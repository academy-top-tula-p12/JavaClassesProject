import publishers.*;
import java.util.Date;
import gui.*;

public class Program {
    public static void main(String[] args){
        Employee employee = new Employee("Tommy", 31);
        Employee tommy = new Employee("Tommy", 31);
        Employee tommyJunior = employee;

        System.out.println(employee);
        System.out.println(employee.hashCode());
        System.out.println(employee.getClass());
        System.out.println(employee.equals(tommyJunior));
    }

}




public class Employee {
    String name;
    int age;

    {
        name = "";
        age = 0;
    }

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    Employee(){
//        this.name = "";
//        this.age = 0;
        this("", 0);
    }

    Employee(String name){
        this(name, 0);
    }

    Employee(int age){
        this("", age);
    }

    void print(){
        System.out.printf("Name: %s, Age: %d", name, age);
    }
}

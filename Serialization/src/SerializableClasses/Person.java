package SerializableClasses;

import java.io.Serializable;

public class Person implements Serializable{
    
    String name;
    int age;
    double height;
    
    public Person(String n, int a, double h){  
        name=n;
        age=a;
        height=h;
    }
}

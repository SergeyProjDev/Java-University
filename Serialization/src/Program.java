import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

import SerializableClasses.Person;
import SerializationHelper.SerializationHelper;

// Serialization + Reflection 
public class Program {
    
	public static void main(String[] args)  {
    	SerializationHelper sh = new SerializationHelper();
    	
    	System.out.println("What to do? \n1.Get serialize. \n2.Set serialize.");
    	
    	Person p = new Person("Sergey", 18, 179.5);

    	switch (new Scanner(System.in).nextByte()) {
    	
    		case 1:
    			try {
    				Person pers = (Person) sh.Deserialize();
    				ArrayList<Field> fld = sh.getFields(pers); //reflection
    				for (Field f : fld) //where f - field with all data
    					System.out.println(f.getName() + " = " + f.get(pers));
    			}catch(Exception ex) {}
    			
    			break;
    				
    		case 2:
    			sh.Serialize(p); 
    			break;
    	}
    } 
}
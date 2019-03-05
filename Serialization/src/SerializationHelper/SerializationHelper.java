package SerializationHelper;import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class SerializationHelper {
	
	public void Serialize(Object obj){
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.dat"))){
            oos.writeObject(obj);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        } 
		finally{
			System.out.println("Serialized!");
		}
	}
	
	
	
	public Object Deserialize(){
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.dat"))){
            Object p = (Object) ois.readObject();
            return (Object)p;
        }
        catch(Exception ex){ 
            System.out.println(ex.getMessage());
        }
		return null;
	}
	
	
	
	public ArrayList<Field> getFields(Object obj){
		ArrayList<Field> fld = new ArrayList<Field>();
		try {
			for (Field field : obj.getClass().getDeclaredFields()) {
				field.setAccessible(true);
				Object value = field.get(obj);
				if (value != null) 
					fld.add(field);
			}
			return fld;
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
}

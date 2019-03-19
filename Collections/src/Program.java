import java.util.Collections;
import java.util.Vector;

public class Program {
	public static void main(String[] args) {
		
		double[] arr = new double[args.length];
		
		for (int i = 0; i < args.length; i++)
			arr[i] = Double.valueOf(args[i]);
		
		DoubleVector dv = new DoubleVector(arr);
		
		while (dv.hasNext()) {
			double obj = dv.next();
			System.out.print(obj + "   ");
		}
		
	}
}



class DoubleVector{
	
	private Vector<Double> vec = new Vector<Double>(); 
	
	private int vectorSize = 0;
	private int elementCount = -1;
	public boolean hasNext() {
		elementCount++;
		if (elementCount < vectorSize)
			return true;
		else 
			return false;
	}
	
	public double next() {
		return vec.get(elementCount);
	}
	
	
	public DoubleVector(double[] array) {
		vectorSize = array.length; 
		for (int i = 0; i < array.length; i++) 
			vec.add(array[i]);
		Collections.sort(vec); //natural order sort
	}
}

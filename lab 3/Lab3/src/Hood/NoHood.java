package Hood;

//капюшон не существует
public class NoHood implements IHood{
	
	@Override
	public void Hood() {
		System.out.println("There is no hood");
	}
	
}

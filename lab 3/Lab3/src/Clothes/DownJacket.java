package Clothes;

//пуховик
public class DownJacket extends ClothBase{

	//отсутствует конструктор определения капюшона
	//поскольку у пуховика капюшон по умолчанию
	
	@Override
	public void display() {
		System.out.println("   Down Jacket:");
	}

	@Override
	public void size() {
		System.out.println("Size: " + size.M);
	}

	@Override
	public void material() {
		System.out.println("Material: Polyester");
	}
	
}

package Clothes;

import Hood.InvoiceHood;

//куртка
public class Jacket extends ClothBase{

	//инициализация особенности капюшона
	public Jacket(){
		//у куртки есть особый накладной капюшон
		hoodBehaviour = new InvoiceHood(); 
	}
	
	@Override
	public void display() {
		System.out.println("   Jacket:");
	}

	@Override
	public void size() {
		System.out.println("Size: " + size.XXL);
	}

	@Override
	public void material() {
		System.out.println("Material: Skin");
	}
	
}

package Clothes;

import Hood.NoHood;

//шуба
public class FurCoat extends ClothBase{
	
	//инициализация особенности капюшона
	public FurCoat(){
		//у шубы нет капюшона
		hoodBehaviour = new NoHood(); 
	}
	
	@Override
	public void display() {
		System.out.println("   Fur Сoat:");
	}

	@Override
	public void size() {
		System.out.println("Size: " + size.S);
	}

	@Override
	public void material() {
		System.out.println("Material: Fur");
	}

}

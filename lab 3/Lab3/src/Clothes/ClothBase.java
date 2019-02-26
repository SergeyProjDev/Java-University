package Clothes;

import Hood.IsHood;
import Hood.IHood;

public abstract class ClothBase {

	//экземпляр поведения (существование капюшона)
	protected IHood hoodBehaviour;
	
	//конструктор: по умолчанию все одежки имеют капюшон
	public ClothBase() {
		hoodBehaviour = new IsHood();
	}
	
	//реализация существования капюшона
	public void hood() {
		hoodBehaviour.Hood();
	}
	
	
	//перечисление размеров
	enum size{
		XXXS, XXS, XS, S, M, L, XL, XXL,XXXL
	};

	
	//методы, одинаковые для всех одежек
	public void season() {
		System.out.println("Winter");
	}
	public void style() {
		System.out.println("Casual");
	}

	
	/*абстрактные методы*/
	
	//название
	public abstract void display();
	//размер
	public abstract void size();
	//материал
	public abstract void material();
}

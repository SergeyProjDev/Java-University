import java.util.ArrayList;

import Clothes.ClothBase;

import Clothes.DownJacket;
import Clothes.FurCoat;
import Clothes.Jacket;

/*   реализация паттерна "Стратегия"   */
public class Program {
	
	public static void main(String[] args) {
		
		//список одежд
		ArrayList<ClothBase> clothes = new ArrayList<ClothBase>();
		
		//добавление:
		clothes.add(new DownJacket()); //пуховика
		clothes.add(new FurCoat()); //шубы
		clothes.add(new Jacket()); //куртки 
		
		//перебор всех методов для каждой одежки
		for (ClothBase cloth : clothes){
			cloth.display();
			cloth.season();
			cloth.material();
			cloth.hood();
			cloth.style();
			cloth.size();
			
			System.out.println("");
		}
	}
}

package StringChecker;

public class StringCheck {
	
	//существуют ли в тексте цифры, за которыми не стоит «+»
	public boolean checkString(String inp) {

		while (true) { //удаление "+" из начала строки
			if (inp.charAt(0) == '+') 
				inp = inp.substring(1);
			else break;
		}
		
		for (int i = 0; i < inp.length(); i++) {
			if (inp.charAt(i) == '+') { //нашло "+"
				if (Character.isDigit(inp.charAt(i-1))) { //перед "+" число
					return true;
				}
			}
		}
		
		return false;
	}
	
}

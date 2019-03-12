package Project;

import java.util.Scanner;

import StringChecker.StringCheck;


public class Program extends ProgramFasade{
	
	public static void main(String[] args) 
	{
		System.out.println("Print expression to check it:");
		
		String inp = getInput();
		boolean result = checkInpStr(inp);
		
		System.out.print("The numbers after which the \"+\" sign ");
		if (result) 
			System.out.print("EXISTS");
		else 
			System.out.print("does NOT exist");	
	}
	
}

class ProgramFasade{
	
	static String getInput() {
		String str = "";
		
		String regex = "[[0-9]+[ ]+[-)(+*/]+]+"; 
		
		Scanner scan = new Scanner(System.in);
		while (true) {
			str = scan.nextLine();
			if (str.matches(regex)) 
				break;
			else 
				System.out.println("Not math expression");
		}
		scan.close();
		
		str = str.replaceAll(" ",""); //remove " "
		return str; //returns math expression
	}
	
	static boolean checkInpStr(String str) {
		StringCheck sc = new StringCheck();
		boolean result = sc.checkString(str);
		return result;
	}
	
}
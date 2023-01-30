package application;

import java.util.ArrayList;
import java.util.List;

public class ProgramList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>(); // aqui não aceita tipos primitivos ex: double, int, string tem que usar o Wrapper classes.
		list.add("Maria");
		list.add("Pedro");
		list.add("Jose");
		list.add("Luanna");
		list.add(2, "Marco");
		
		list.remove("Maria");
		
		for(String x: list) {
			System.out.println(x);
		}
	}

}

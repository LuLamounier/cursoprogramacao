package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int codproduto;
		int quantidade;
		double total;
		
		System.out.println("Digite o primeiro produto?");
		codproduto = sc.nextInt();
		
		System.out.println("Digite a quantidade?");
		quantidade = sc.nextInt();
		
		if (codproduto == 1) {
			total = quantidade * 4.0;
		}
		else if (codproduto == 2) {
			total = quantidade * 4.5;
			
		}
		else if (codproduto == 3) {
			total = quantidade * 5.0;
		
		}
		else if (codproduto == 4) {
			total = quantidade * 2.0;
		}		
		else {
			total = quantidade * 1.5;
		}
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}

}

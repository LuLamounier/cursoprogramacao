package curso_programacao.basico;

import java.util.Scanner;

public class modulo_repetitivas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		
		int senha, tentativas = 0;
		System.out.println("Digite sua senha: ");
		senha = sc.nextInt();
		
		while (senha != 2002) {
			tentativas++;
			System.out.println("Senha Invalida!");
			System.out.println("Digite novamente a senha");
			senha = sc.nextInt();
		}
		
		System.out.println("Total de tentativas: "+ tentativas);
		System.out.println("Programa encerrado");
		sc.close();
	}

}

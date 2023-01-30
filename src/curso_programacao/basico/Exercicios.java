package curso_programacao.basico;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);

		int horai;
	    int horaf;
		
		
		System.out.println("Digite o horário inicial?");
		horai = sc.nextInt();
		
		System.out.println("Digite o horário final?");
		horaf = sc.nextInt();
		
		int duracao;
		
		if (horai < horaf) {
			duracao = horaf - horai;
		}
		else {
			duracao = 24 - horaf - horai;
		}
		
		System.out.println("O JOGO DUROU 10 HORAS");
		}

}


package br.capgemini.program;

import java.util.Locale;
import java.util.Scanner;

public class Questao01 {
	
/*# Questão 01
Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando
o caractere * e espaços. A base e altura da escada devem ser iguais ao 
valor de n. A última linha não deve conter nenhum espaço.
*/

public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------- Questão 01 - Montar escada ---------");
		System.out.print("Informe numero de degraus da escada: ");
				     
		int degraus = sc.nextInt(); 
		System.out.println();

		String n[] = new String[degraus + 1]; /*Cria um Array para receber a posição de cada elemento*/

		for (int i = 0; i < degraus; i++) {/*For para percorrer o Arrey e em cada posição acrecentar o caracter espaço*/
			n[i] = " ";
		}

		for (int x = degraus - 1; x >= 0; x--) {/*For para iniciar a contagem de repetição do tamanho da escada*/
			n[x] = "*";							/*Acresenta na posição do arrey carater */
			for (int y = 0; y < degraus; ++y) {	/*For pegando posição final ate o inicial*/
				System.out.print(n[y]);			/*Nesse ponto imprime na tela os degraus da escada*/

			}
			System.out.println();				/*quebra de linha para cada degrau*/			
		}
		
		
		
		
		sc.close();
	}

}

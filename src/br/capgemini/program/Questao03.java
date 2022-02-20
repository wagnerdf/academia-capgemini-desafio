package br.capgemini.program;


import java.util.Locale;
import java.util.Scanner;

/*
 * Duas palavras podem ser consideradas anagramas de si mesmas se as letras
 *  de uma palavra podem ser realocadas para formar a outra palavra. Dada 
 *  uma string qualquer, desenvolva um algoritmo que encontre o número de 
 *  pares de substrings que são anagramas.
 * */

public class Questao03 {
	
	
	
	
	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String palavra = "";

		System.out.println("------ Questão 03 - Pares por anagramas ------");
		System.out.println("Informe a palavra: ");
		palavra = sc.next();

		/* Chamada de função para mostrar pares de string que são anagramas */
		ContagemPalavra.contagem_palavra(palavra, palavra);

		sc.close();
		
	}
	
	
	
}

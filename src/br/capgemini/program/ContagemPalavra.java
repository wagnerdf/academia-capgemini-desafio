package br.capgemini.program;

import java.util.Arrays;
import java.util.HashMap;

public class ContagemPalavra {
	
	static void contagem_palavra(String palavra1, String palavra2) {

		
		HashMap<String, Integer> lista = new HashMap<>(); /*Gerando na memoria uma lista em HashMa*/

		
		for (int y = 0; y <= palavra1.length(); y++) { /* Dois FOR para percorrer as strings repassada pela classe main */
			for (int x = y; x < palavra2.length(); x++) {
				
				
				char[] ArrayPalavra = palavra1.substring(y, x + 1).toCharArray();	/*Validando o array, por tamanho e ate seu final*/
				Arrays.sort(ArrayPalavra); 											/*Trocando posições*/
				String pseudoP = new String(ArrayPalavra); 							/*Alocando memoria para armazenar o array palavraArray*/
				if (lista.containsKey(pseudoP)) {									/*Validando a lista na posição com do array pseudoP*/
					lista.put(pseudoP, lista.get(pseudoP) + 1);				
				} else {
					lista.put(pseudoP, 1);
				}
			}
		}
			
		int cont1 = 0;
		
		for(String posicao : lista.keySet()) {	/*Apos a montagem e validação dos pares, validar o resultado final de anagrama*/
			int z = lista.get(posicao);
			cont1 += ((z - 1)*z)/2;
		}
		
		System.out.print("Pares de anagramas = " + cont1);
		
		
	}

}

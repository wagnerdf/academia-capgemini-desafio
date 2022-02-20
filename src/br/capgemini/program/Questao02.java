package br.capgemini.program;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Débora se inscreveu em uma rede social para se manter em contato com seus amigos.
 * A página de cadastro exigia o preenchimento dos campos de nome e senha, porém
 * a senha precisa ser forte. O site considera uma senha forte quando ela 
 *  satisfaz os seguintes critérios:
 *  
 * Possui no mínimo 6 caracteres.
 * Contém no mínimo 1 digito.
 * Contém no mínimo 1 letra em minúsculo.
 * Contém no mínimo 1 letra em maiúsculo.
 * Contém no mínimo 1 caractere especial. 
 * Os caracteres especiais são: !@#$%^&*()-+
 * */


public class Questao02 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------- Questão 02 - Validador de senha ---------");
		System.out.print("Informe Senha: ");
		String senha = sc.nextLine();
		System.out.println();
		
		/*Variavel de informação de retorno para o usuário*/
		String info = "Perfeito :) - Senha criada corretamente";
		
		// Regex para verificar a senha tem caracteres especiais.
		String regex = "(?=.*[!@#$%^&*()+])"	/*representa um caractere especial que deve ocorrer pelo menos uma vez.*/
                + "(?=\\S+$).{6,20}$";       	/*espaços em branco não são permitidos em toda a string, representa pelo menos 6 caracteres e no */ 
												/*máximo 20 caracteres.menos 6 caracteres e no máximo 20 caracteres.*/
		// Compilar o ReGex
		Pattern p = Pattern.compile(regex);
		
		/* A classe padrão contém o método matcher()
         * para encontrar correspondência entre a senha fornecida
         * e expressão regular.*/
		Matcher m = p.matcher(senha);
		
		/* Regex para verificar a senha tem caracteres numéricos.*/
		String regexNumero = "^(?=.*[0-9])"   /*representa um número que deve ocorrer pelo menos uma vez.*/
		                	 + "(?=\\S+$).{6,20}$";     /*espaços em branco não são permitidos em toda a string, representa*/ 
														/* pelo menos 6 caracteres e no máximo 20 caracteres.*/
		// Compilar o ReGex
		Pattern p2 = Pattern.compile(regexNumero);
				
		/* A classe padrão contém o método matcher()
		 * para encontrar correspondência entre a senha fornecida
		 * e expressão regular.*/
		Matcher m2 = p2.matcher(senha);
		
        
		
		int totalString = senha.length(); /*guarda o tamanho da variavel senha, por caracteres digitados*/ 
		if (totalString <= 5) { //Verifica se a senha contem 6 digitos
			info = "A senha contem apenas "+totalString+" caracteres, padrão é no mínimo 6.";
			
		}else if (senha.toLowerCase() == senha) {  						/*Verifica se foi digitado letra em maiuscula*/
			info = "A senha '"+senha+"' não contem letra maiúscula";
		}else if(senha.toUpperCase() == senha) {						/*Verifica se foi digitado letra em minúscula*/
			info = "A senha '"+senha+"' não contem letra minúscula";
		}else if(m2.matches() == false) {								/*Verifica se foi digitado digito numérico*/
			info = "A senha '"+senha+"' não contem digito númerico";
		}else if(m.matches() == false) {								/*Verifica se foi digitado caracter especial*/ 
			info = "A senha '"+senha+"' não contem os caracteres especiais '!@#$%^&*()-+'";
		}
		
		/*Imprime na tela resposta do sistema por requisito de semha não atendido*/
		System.out.println(info);
		
		sc.close();
		
	}

}

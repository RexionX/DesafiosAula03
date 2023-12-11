package Desafios;

import java.util.Scanner;

public class Desafio05 {

	public static void main(String[] args) {
		int num;
		int soma = 0;
		int contador = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite números inteiros");
		
		do {
			num = leia.nextInt();
			
			if (num !=0 && num % 3 ==0) {
				soma += num;
				contador++;
			}
		} while (num !=0);
			if (contador > 0) {
				double media = (double) soma / contador;
				System.out.println("Média dos múltiplos de 3 é " + media);
			} else {
				System.out.println("Nenhum mútiplo de 3 foi digitado");
			}
		}
			
}

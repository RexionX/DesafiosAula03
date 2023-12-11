package Desafios;

import java.util.Scanner;

public class Desafios01 {

	public static void main(String[] args) {
		int num1 =3;
		int num2 =5;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número");
		num2 = leia.nextInt();
		
		if(num1>num2){
		System.out.println("Intervalo inválido, o primeiro numero deve ser menor");
		}
		else {
			for(int i=num1; i<=num2; i++)
			if(i % 3==0 && i % 5==0) {
			System.out.println(i);
			{
		System.out.println("Mostre os números que são múltiplos de 3 e 5");
			}	
		}	
	}	
		
	}
}
	
	
	



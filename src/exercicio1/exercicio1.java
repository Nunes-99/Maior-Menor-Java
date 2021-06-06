package exercicio1;

import java.util.Scanner;




public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int n1, n2, n3, maior, menor, media, produto;
		
		System.out.printf("Digite o primeiro numero: ");
		n1=entrada.nextInt();
		
		System.out.printf("Digite o segundo numero: ");
		n2=entrada.nextInt();
		
		System.out.printf("Digite o terceiro numero: ");
		n3=entrada.nextInt();
		
		media = (n1 + n2 +n3) / 3;
		System.out.println("A media e igual a " + media);
		
		if (n1 > n2){
			
			maior = n1;
			menor = n2;
		} else {
			maior = n2;
			menor = n1;
		}
		
		if (maior > n3) {
			maior = maior;
			menor = n3;
		} else {
			maior = n3;
		}
		
		System.out.println("O maior valor e: " + maior);
		System.out.println("O menor valor e: " + menor);
		
		media = (n1 + n2 +n3) / 3;
		System.out.println("A media e igual a " + media);
		
		produto=n1 * n2 * n3;
		System.out.println("O valor do produto e igual a " + produto);
		
	}

}

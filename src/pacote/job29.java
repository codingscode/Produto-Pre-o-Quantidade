package pacote;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class job29 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto product = new Produto();
		System.out.println("digite informa��o do produto: ");
		System.out.println("nome: ");
		product.nome = sc.nextLine();
		System.out.println("pre�o: ");
		product.preco = sc.nextDouble();
		System.out.println("quantidade: ");
		product.quantidade = sc.nextInt();
 		
		System.out.println(product.toString());

		sc.close();
		
	}

}

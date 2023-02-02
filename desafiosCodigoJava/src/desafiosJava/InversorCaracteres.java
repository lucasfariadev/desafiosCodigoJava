package desafiosJava;

import java.util.Scanner;

public class InversorCaracteres {

	public static void main(String[] args) {
		
		System.out.print("Digite uma palavra: ");
		String palavra = new Scanner(System.in).next();
		
		for (int i=palavra.length ()-1; i>=0; i--) System.out.print(palavra.charAt(i));
	}

}

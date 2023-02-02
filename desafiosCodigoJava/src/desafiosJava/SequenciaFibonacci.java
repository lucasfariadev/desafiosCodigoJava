package desafiosJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenciaFibonacci {

	public static void main(String[] args) {
		System.out.print("Digite o número: ");
		Scanner scanner = new Scanner(System.in);
		int numeroDeVerificacao = scanner.nextInt();
		ArrayList<Integer> sequenciaFibonacci = (ArrayList<Integer>) criaSequenciaFibonacci(numeroDeVerificacao);

		if (existeNumero(numeroDeVerificacao, sequenciaFibonacci))
			System.out.printf("O número %d PERTENCE a sequencia Fibonacci\n", numeroDeVerificacao);
		else
			System.out.printf("O número %d NÃO PERTENCE a sequencia Fibonacci\n", numeroDeVerificacao);

	}

	private static List<Integer> criaSequenciaFibonacci(int numeroDeVerificacao) {
		int a = 0, b = 1, auxiliar;
		ArrayList<Integer> sequenciaFibonacci = new ArrayList<>();
		sequenciaFibonacci.add(0);
		while (a <= numeroDeVerificacao) {
			auxiliar = a;
			a = a + b;
			b = auxiliar;
			sequenciaFibonacci.add(a);
		}
		return sequenciaFibonacci;
	}

	private static Boolean existeNumero(int numeroDeVerificacao, ArrayList<Integer> sequenciaFibonacci) {
		if (sequenciaFibonacci.contains(numeroDeVerificacao)) {
			return true;
		} else {
			return false;
		}
	}
}

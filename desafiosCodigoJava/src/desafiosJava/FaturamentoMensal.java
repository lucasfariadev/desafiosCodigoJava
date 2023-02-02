package desafiosJava;

public class FaturamentoMensal {
	
	public static void main(String[] args) {
		
		Double faturamentoSP = 67836.43;
		Double faturamentoRJ = 36678.66;
		Double faturamentoMG = 29229.88;
		Double faturamentoES = 27165.48;
		Double faturamentoOutros = 19849.53;
		
		Double faturamentoTotal = faturamentoSP + faturamentoRJ + faturamentoMG
				+ faturamentoES + faturamentoOutros;
		
		System.out.printf("Porcentagem de SP: %.2f \n",  (faturamentoSP * 100) / faturamentoTotal);
		System.out.printf("Porcentagem de RJ: %.2f \n",  (faturamentoRJ * 100) / faturamentoTotal);
		System.out.printf("Porcentagem de MG: %.2f \n",  (faturamentoMG * 100) / faturamentoTotal);
		System.out.printf("Porcentagem de ES: %.2f \n",  (faturamentoES * 100) / faturamentoTotal);
		System.out.printf("Porcentagem de Outros: %.2f \n",  (faturamentoOutros * 100) / faturamentoTotal);

		
	}
	
	
}

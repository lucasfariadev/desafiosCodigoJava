package desafiosJava;

import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class FaturamentoDiario {

	public static void main(String[] args) throws Exception {

		JsonArray dadosJson = (JsonArray) new JsonParser().parse(new FileReader("src\\arquivos\\dados.json"));

		Double maior = 0.0;
		Double valorTotal = 0.0;
		int contador = 0;
		Double menor = dadosJson.get(0).getAsJsonObject().get("valor").getAsDouble();

		for (JsonElement jsonElement : dadosJson) {
			Double valorDiario = jsonElement.getAsJsonObject().get("valor").getAsDouble();
			maior = verificarMaiorNumero(valorDiario, maior);
			menor = verificarMenorNumero(valorDiario, menor);

			if (valorDiario != 0.0) {
				contador++;
				valorTotal += valorDiario;
			}

		}
		Double media = valorTotal / contador;
		int incidenciaMaiorQueMedia = verificarIncidenciaMaior(dadosJson, media);

		System.out.println("MAIOR valor: " + maior);
		System.out.println("MENOR valor: " + menor);
		System.out.println("MEDIA: " + media);
		System.out.println("Incidencia maior que Media: " + incidenciaMaiorQueMedia + " dias");

	}

	private static int verificarIncidenciaMaior(JsonArray dadosJson, Double media) {
		int contadorDeDias = 0;
		for (JsonElement jsonElement : dadosJson) {
			Double valorDiario = jsonElement.getAsJsonObject().get("valor").getAsDouble();
			if (valorDiario > media) {
				contadorDeDias++;
			}

		}
		return contadorDeDias;
	}

	private static Double verificarMenorNumero(Double valorDiario, Double menor) {
		if (valorDiario <= menor && valorDiario != 0.0) {
			menor = valorDiario;
		}
		return menor;
	}

	private static Double verificarMaiorNumero(Double valorDiario, Double maior) {
		if (valorDiario > maior) {
			maior = valorDiario;
		}
		return maior;
	}

}

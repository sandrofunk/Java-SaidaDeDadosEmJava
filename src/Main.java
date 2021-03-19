import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		// Saída de Texto Sem Quebra de Linha
		System.out.print("Olá");

		// Quebra de Linha
		System.out.println();

		// Saída de Texto Com Quebra de Linha
		System.out.println("Tudo bem ?");

		// Declarando Váriável e Imprimindo na tela
		// Variável inteira
		int x = 50;
		System.out.println(x);

		// Declarando e imprimindo váriavel Double
		double y = 10.334;
		System.out.println(y);

		// Declarando e imprimindo váriavel Double, com 2 casas decimais
		double z = 10.334;
		// Utiliza para definir casas decimais printf e %.2f
		System.out.printf("%.2f%n", z);

		// Declarando e imprimindo váriavel Double, com 2 casas decimais
		double a = 10.334;
		// Utiliza para definir casas decimais printf e %.2f
		// Utiliza a classe Locale para definir o separador ponto
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", a);
		
		//Concatenando valores com print usando o delimitador +
		int b = 2;
		int c = 5;
		System.out.println("Valor " + b + " é Par e o valor " + c + " é Impar");

		
		// Concatenando com %.2f
		String nome = "Maria";
		double renda = 4000.00;
		System.out.printf("%s ganha R$ %.2f", nome, renda);
	}

}

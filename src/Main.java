import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		// Sa�da de Texto Sem Quebra de Linha
		System.out.print("Ol�");

		// Quebra de Linha
		System.out.println();

		// Sa�da de Texto Com Quebra de Linha
		System.out.println("Tudo bem ?");

		// Declarando V�ri�vel e Imprimindo na tela
		// Vari�vel inteira
		int x = 50;
		System.out.println(x);

		// Declarando e imprimindo v�riavel Double
		double y = 10.334;
		System.out.println(y);

		// Declarando e imprimindo v�riavel Double, com 2 casas decimais
		double z = 10.334;
		// Utiliza para definir casas decimais printf e %.2f
		System.out.printf("%.2f%n", z);

		// Declarando e imprimindo v�riavel Double, com 2 casas decimais
		double a = 10.334;
		// Utiliza para definir casas decimais printf e %.2f
		// Utiliza a classe Locale para definir o separador ponto
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", a);
		
		//Concatenando valores com print usando o delimitador +
		int b = 2;
		int c = 5;
		System.out.println("Valor " + b + " � Par e o valor " + c + " � Impar");

		
		// Concatenando com %.2f
		String nome = "Maria";
		double renda = 4000.00;
		System.out.printf("%s ganha R$ %.2f", nome, renda);
	}

}

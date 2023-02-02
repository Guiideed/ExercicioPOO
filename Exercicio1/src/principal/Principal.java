package principal;
import java.util.Scanner;
import java.util.Locale;
import classeRetangulo.Retangulo;

public class Principal {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		
		Scanner leitor = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Favor, adicione o valor da largura");
		retangulo.width = leitor.nextDouble();
		System.out.println("Favor, adicione o valor da altura");
		retangulo.height = leitor.nextDouble();
		System.out.println("O valor da largura e de "+ retangulo.height);
		System.out.println("O valor da altura e de "+ retangulo.width);
		
		System.out.println("Este e o valor da area: " + retangulo.areaRet());
		System.out.println("Este e o valor do perimetro : " + retangulo.perimRet());
		System.out.println("Este e o valor da area: " + retangulo.diagonaRet());
		
		leitor.close();
	}

}

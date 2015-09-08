import java.util.Scanner;
public class Vocales{
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		String texto;
		char letra;

		System.out.print("Ingrese un texto: ");
		texto = rd.next().toLowerCase();

		letra = texto.charAt(2);

		if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
			System.out.println("La letra " + letra + " Es Vocal");
		else
			System.out.println("La letra " + letra + " Es Consonante");

	}
}
import java.util.Scanner;
public class Vocales{
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		String texto;
		char letra;

		System.out.print("Ingrese un texto: ");
		texto = rd.next().toLowerCase();

		while(true){
		
		letra = texto.charAt(texto.length() -1);

		switch (letra){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("La letra " + letra + " Es Vocal");
				return;
			default:
				System.out.println("La letra " + letra + " Es Consonante");	
				return	;
			}
	}

	}
}
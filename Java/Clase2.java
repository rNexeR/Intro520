import java.util.Scanner;
public class Clase2{
	public static void main(String var[]){
		Scanner rd = new Scanner(System.in);

		//Entradas
		System.out.print("Ingrese nombre: ");
		String nombre = rd.next();

		System.out.println("Primera letra de tu nombre: " + nombre.charAt(0));

		System.out.print("Ingrese ano de nacimiento: ");
		int edad = 2015 - rd.nextInt();
		//char letra = 'C';
		char letra = rd.next().charAt(0);
		"Nexer".charAt(0);

		String texto = "Hola";
		System.out.println("Caracteres en \"" + texto + "\":" + texto.length());

		//Proceso

		//Salidas
		System.out.println(nombre + " - " + edad + " - " + letra);
	}
}
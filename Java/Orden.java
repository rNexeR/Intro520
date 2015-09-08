import java.util.Scanner;
class Orden{
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int n1, n2, n3, menor, mayor;

		n1 = rd.nextInt();
		n2 = rd.nextInt();
		n3 = rd.nextInt();

		if(n1 <= n2 && n1 <= n3)
			menor = n1;
		else if(n2 <= n1 && n2 <= n3)
			menor = n2;
		else
			menor = n3;

		System.out.println(menor);

		if(n1 >= n2 && n1 >= n3)
			mayor = n1;
		else if(n2 >= n1 && n2 >= n3)
			mayor = n2;
		else
			mayor = n3;

		if(n1 != menor && n1 != mayor)
			System.out.println(n1);
		else if(n2 != menor && n2 != mayor)
			System.out.println(n2);
		else
			System.out.println(n3);

		System.out.println(mayor);
	}
}
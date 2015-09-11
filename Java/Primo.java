import java.util.Scanner;
class Primo{
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int num, count = 0, x;

		x = 1;
		num = rd.nextInt();

		while(x <= num){
			if(num % x == 0){
				count++;
			}
			x++;
		}
		if(count <= 2){
			System.out.println("El numero es primo");
		}else{
			System.out.println("El numero es Compuesto");
		}
	}
}
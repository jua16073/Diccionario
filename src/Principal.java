/**
 * @author Rodrigo Alvarado 16106
 * @author Pokex sepa putas que carnet
 */

import java.io.IOException;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		Traducir trad= new Traducir();
		trad.lectura();
		System.out.println("Ingrese el texto a traducir");
		String text= teclado.nextLine();
		System.out.println(trad.traduccion(text));
	}

}

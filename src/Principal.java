/**
 * @author Rodrigo Alvarado 16106
 * @author Rodrigo Juarez 16073
 */

import java.io.IOException;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		Traducir trad= new Traducir();
		// instruccion para tener el diccionario
		trad.lectura();
		System.out.println("Ingrese el texto a traducir");
		String text= teclado.nextLine();
		//Instrucciona para traducir de ingles a español
		System.out.println(trad.traduccion(text));
	}

}

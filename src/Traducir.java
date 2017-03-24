/**
 * @author Rodrigo Alvarado 16106
 * @author Pokex sepa putas que carnet
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
public class Traducir {
	BinaryTree<Association<String, String>> tree= new BinaryTree<Association<String, String>>();
	Association<String, String> as;
	
	String lectura() throws IOException{
			String a = ""; 
		
			JFileChooser archivo = new JFileChooser();
			archivo.showOpenDialog(null);
			BufferedReader reader = new BufferedReader(new FileReader(archivo.getSelectedFile().getPath()));
			String pal;
			while(reader.ready()){
				while ((pal=reader.readLine())!= null){
					a=a+" "+pal;
					llenar(pal);
				}
				//String w=tree.find(new Association<String, String>("yes","si")).toString();
				return a;
			}
			return a;
		}
	
	public void llenar(String pal){
		String palabras[]= pal.split(",");
		tree.insert(new Association<String, String>(palabras[0], palabras[1]));
	}
	
	
	/**
	 * @param texto a ser traducido
	 * @return texto traducid0
	 * Metodo toma un texto, lo separa, y luego busca coincidencias en el binary tree. De no encontrarlas agrega a la cadena de "texto traducido" la palabra
	 * ingresada entre asteriscos
	 */
	public String traduccion(String texto){
		String traducido="";
		texto = texto.toLowerCase();
		String palabrasATraducir[] = texto.split("\\s+");
		for (int i=0; i<palabrasATraducir.length;i++){
			String x =palabrasATraducir[i];
			Association<String, String> traduccion = tree.find(new Association<String, String>(x,""));
			if ( traduccion != null){
				traducido = traducido + traduccion.getValue() +" ";
			}else{
				traducido = traducido + "*"+x+"* ";
			}
		}
		return traducido;
	}


	
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Object;
import java.util.TreeSet;

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
	
	public String traduccion(String texto){
		String traducido="";
		texto = texto.toLowerCase();
		String palabrasATraducir[] = texto.split("\\s+");
		for (int i=0; i<palabrasATraducir.length;i++){
			String x =palabrasATraducir[i];
			System.out.println(x);
			if (tree.find(new Association<String, String>("",x)) == null){
				System.out.println("Holiiiii");
			}
		}
		return traducido;
	}


	
}

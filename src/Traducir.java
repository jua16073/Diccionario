import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Object;
import java.util.TreeSet;

import javax.swing.JFileChooser;
public class Traducir {
	
	String lectura() throws IOException{
			String a = ""; 
		
			JFileChooser archivo = new JFileChooser();
			archivo.showOpenDialog(null);
			BufferedReader reader = new BufferedReader(new FileReader(archivo.getSelectedFile().getPath()));
			String pal;
			while(reader.ready()){
				while ((pal=reader.readLine())!= null){
					a= a+" "+pal;
				}
				//a = reader.readLine();
				return a;
			}
			return a;
		}
	
	public void llenar(String pal){
		String palabras[]= pal.split(",");
		int x=0;
		while (x<palabras.length){
			System.out.println();
		}
	}


	
}
